import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.util.*;

/**
 * <b>Correspond to a Scope in code (Function, block, loop ...).</b> <br>
 * A scope contains following informations :
 * <ul>
 *     <li>An ancestor</li>
 *     <li>An origin</li>
 *     <li>A name</li>
 *     <li>An offset, corresponding to current offset</li>
 *     <li>An "innerScopeList", corresponding to a list of scope of anonymous block inside this scope</li>
 *     <li>A table, containing every variables, parameters</li>
 *     <li>A second table, containing scope of non-anonymous block</li>
 * </ul>
 * @author Frosqh
 */
public class Scope {

    /**
     * Scope's ancestor. Is set at instantiation.
     * @see Scope#getAncestor()
     * @see Scope#isInAncestor(String)
     * @see Scope#getFromAncestor(String)
     */
    private Scope ancestor;

    /**
     * Scope's origin. Is set at instantiation.
     * @see Scope#getOrigin()
     */
    private String origin;

    /**
     * Scope's name. Is set at instantiation.
     */
    private String name;

    /**
     * Scope's offset. Increments for each variable or parameter.
     * @see Scope#getDeplacement()
     */
    private int deplacement;

    /**
     * Scope's innerScopeList. Extends for each anonymous block encountered.
     */
    private ArrayList<Scope> innerScopeList = new ArrayList<>();

    /**
     * Scope's table. Extends for each variable or parameter encountered.
     * @see Scope#getTable()
     */
    private LinkedHashMap<String, ArrayList<String>> table;

    /**
     * Scope's second table. Extends for each non-anonymous block encountered.
     * @see Scope#addScopeNotInner(String, Scope)
     */
    private LinkedHashMap<String, Scope> secondTable;

    /*******************************************************************************************************************/

    /**
     * @param id Scope's origin
     * @param anc Scope's ancestor
     * @param string Scope's name
     * @see Scope
     */
    public Scope (String id, Scope anc, String string){
        if (anc != null){
            deplacement = anc.getDeplacement(); //Getting ancestor's offset to continue in stack <- Not sure about this one (for function)
        }
        table = new LinkedHashMap<>();
        secondTable = new LinkedHashMap<>();
        origin = id;
        ancestor = anc;
        name = string;
    }

    /**
     * @return Scope's offset
     * @see Scope#deplacement
     */
    private int getDeplacement() {
        return deplacement;
    }

    /**
     * @return Scope's origin
     * @see Scope#origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @return Scope's ancestor
     * @see Scope#ancestor
     */
    public Scope getAncestor() {
        return ancestor;
    }

    /**
     * @return Scope's Name
     * @see Scope#name
     */
    public String getName(){return name;}

    /**
     * Print this Scope in format : <br>
     * Scope General <br>
     *  &emsp; functionName : [function, functionReturnType] <br>
     *  &emsp; Scope functionName: <br>
     *  &emsp; &emsp; param1 : [param, param1type, offset, mutable?] <br>
     *  &emsp; &emsp; var1 : [var, var1type, offset, mutable?, size* (if vec)] <br>
     * @param tab Scope's offset (in tabulation)
     * @return The string representing the Scope
     */
    public String toString(int tab){
        if (table.isEmpty()){
            return null;
        }
        StringBuilder tabu = new StringBuilder();
        for (int i =0 ; i< tab; i++){
            tabu.append("    ");
        }
        StringBuilder s = new StringBuilder(tabu.substring(0, tabu.length() - 4) + "Scope " + name + "\n");
        for (String k : table.keySet()){
            s.append(tabu).append(k).append(" : ").append(table.get(k)).append("\n");
        }
        if (secondTable != null){
            for (String k : secondTable.keySet()){
                String temp = secondTable.get(k).toString(tab+1);
                if (temp != null){
                    s.append(temp).append("\n");
                }
            }
        }
        if(innerScopeList != null){
            for (Scope sc : innerScopeList){
                String temp = sc.toString(tab+1);
                if (temp != null){
                    s.append(temp).append("\n");
                }
            }
        }
        String st = s.toString();
        return st.substring(0,st.length()-1);
    }

    /**
     * Add a var to this Scope
     * @param string "Var", leftover of an unique function
     * @param children List of arguments
     * @throws SemanticException If semantic controls fail
     */
    public void addVar(String string, List<BaseTree> children) throws SemanticException {
        boolean isMut = false;
        int vecChildCount;
        Type type = null;
        int index = 0; //Will track advancement of children's parsing
        if (children.get(index).getText().equals("mut")){ //If mutable is indicated
            isMut = true;
            index++;
        }

        if (!children.get(index).getText().equals("=")){ //Should be able to get the correct type
            type = getRawType(children.get(index));
            index++;
        }

        if (children.get(index).getText().equals("=")){ //Entering interesting part (val name at right and value at left)
            List<BaseTree> childrens = (List<BaseTree>) children.get(index).getChildren();
            String name = childrens.get(0).getText();
            if (isInAncestor(name)) {
                String a=getFromAncestor(name).get(0);
                if (a.equals("function")){
                    throw new SemanticException("Function name " + name + " already used", childrens.get(0).getLine(), childrens.get(0).getCharPositionInLine() );
                }else{
                    System.out.println("Warning : \"Var name surcharged : " + name + "\" at " + children.get(0).getLine() + ":" + children.get(0).getCharPositionInLine());
                }
            }

            Type tempType = getType(childrens.get(1));
            if (type != null) {
                if (type.getName().startsWith("vec ")){
                    tempType=new Type(tempType.getName());
                }
                if (!type.equals(tempType)) {
                    throw new SemanticException("Mismatched types : expected " + type + ", found " + tempType,children.get(1).getLine(),children.get(1).getCharPositionInLine());
                } else {
                    type = tempType;
                }
            } else {
                type=tempType;
            }
            if (isIn(name)) {
                System.out.println("Warning : \"Var shadowed: " + name + " from type "+table.get(name).get(1)+" to type "+tempType+"\" at " + childrens.get(1).getLine() + ":" + childrens.get(1).getCharPositionInLine());
            }
            ////////// Counting children for vec declaration
            ArrayList<Integer> veCount = new ArrayList<>();
            BaseTree child = childrens.get(1);
            while (child.getText().equals("vec")){
                vecChildCount = child.getChildCount();
                veCount.add(vecChildCount);
                if (vecChildCount > 0){
                    int v = -1;
                    for (int i = 0; i< vecChildCount;i++){
                        if (v==-1){
                            v = child.getChild(i).getChildCount();
                        } else {
                            if (v!=child.getChild(i).getChildCount()){
                                throw new SemanticException("Every sub-array size should be the same", child.getLine(), child.getCharPositionInLine());
                            }
                        }
                    }
                    child = (BaseTree) child.getChild(1);
                }
            }

            /////////

            int deplacement = this.deplacement;
            this.deplacement += getDeplacement(type.getName(), (ArrayList<Integer>) veCount.clone());


            ArrayList<String> param = new ArrayList<>();
            param.add(string);
            param.add(type.getName());
            param.add(String.valueOf(deplacement));
            param.add(String.valueOf(isMut));
            /// adding vecChildCount to TDS
            if(type.getName().startsWith("vec ")) {
                for (int i : veCount){
                    param.add(String.valueOf(i-1));
                }
            }

            table.put(name,param);
            MiniRustCompiler.tds.getList().put(name,"var");
        } else {
            System.err.println("LEL, should not happen");
        }
    }

    /**
     * Return which type designate a node, either it is a structure in Symbol Table or a 'basic' one.
     * @param baseTree Node to be parse
     * @return Found type ('unknown' if none were found)
     * @exception SemanticException If semantic controls fail
     */
    private Type getRawType(BaseTree baseTree) throws SemanticException {
        Type type = null;
        String text = baseTree.getText();
        if (text.equals("i32") || text.equals("bool")){ //Basic type case
            type = new Type(text);
        }

        if (text.equals("&") && baseTree.getChildCount()>0){ //Pointer
            Type tempType = getRawType((BaseTree) baseTree.getChild(0));
            type= new Type("&"+tempType.getName());
        }
        if (text.equals("vec")){
            Type tempType = getRawType((BaseTree) baseTree.getChild(0));
            if (!tempType.isRaw())
                checkType(tempType,baseTree.getChild(0).getLine(), baseTree.getChild(0).getCharPositionInLine());
            type = new Type("vec "+tempType.getName());
        }

        if (text.matches("[a-zA-Z][a-zA-Z0-9]+") && type==null){ //First should always be true
            type=new Type(text);
            checkType(type,baseTree.getLine(), baseTree.getCharPositionInLine());
        }
        return type;
    }

    /**
     * Return a node's type, either it is a structure in Symbol Table or a 'basic' one.
     * @param child Node the type is search
     * @return Found type ('unknown' if none were found)
     * @exception SemanticException If semantic controls fail
     */
    protected Type getType(Tree child) throws SemanticException {
        String name = child.getText();
        if (name.equals("BLOCK")){
            child = child.getChild(0);
            return getType(child);
        }

        if (name.equals(".")){
            String varName = child.getChild(0).getText();
            String attName = child.getChild(1).getText();
            String type;
            type = getType(child.getChild(0)).getName();
            if (attName.equals("len") && type.startsWith("vec")){
                return new Type("i32");
            } else {
                if (attName.equals("len")) {
                    throw new SemanticException("Cannot len on type " + type, child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                }
            }
            checkType(new Type(type), child.getLine(), child.getCharPositionInLine());
            LinkedHashMap<String, ArrayList<String>> values = TDS.getFirstScope().getScope(type).getTable();
            //System.out.println(values);
            if (values.containsKey(attName)){
                return new Type(values.get(attName).get(1));
            } else {
                throw new SemanticException("Unknown attribute `"+attName+"` in structure "+type,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
            }
        }

        if (name.equals("ANOBLOCK")){
            CommonTree tr = new CommonTree();
            tr.addChild(child);
            MiniRustCompiler.parseTree(tr, MiniRustCompiler.tds, false,true);
            Tree ch = child.getChild(0);
            if (ch.getChild(ch.getChildCount()-1).getText().equals("RES")){
                child = ch.getChild(ch.getChildCount()-2);
                return innerScopeList.get(MiniRustCompiler.tds.innerCount-2).getType(child);
            } else {
                return new Type("Void");
            }
        }

        if (name.equals("true") || name.equals("false")){ //Si l'on a affaire à un booléen
            return new Type("bool");
        }

        if (name.matches("[0-9]+")){
            return new Type("i32");
        }

        if (name.equals("[")){
            Tree ch = child;
            int i =0;
            while(ch.getText().equals("[")){
                ch = ch.getChild(0);
                i++;
            }
            BaseTree chi;
            chi = (BaseTree) ch.getAncestors().get(ch.getAncestors().size() - 1);
            Type varType = getType(chi.getChild(0));
            String var  = chi.getChild(0).getText();
            Type valType = getType(child.getChild(1));
            if (varType.getName().startsWith("vec ")){
                if (valType.getName().equals("i32")){
                    if (child.getChild(1).getText().matches("[a-z][a-zA-Z0-9]*")){
                        return new Type(varType.getName().split(" ",i+1)[i]);
                    }
                    int val = Integer.parseInt(child.getChild(1).getText());
                    if (isIn(var)){
                        if (val > Integer.parseInt(table.get(var).get(3+i))){
                            throw new SemanticException("Index out of bounds ("+val+" > "+Integer.parseInt(table.get(var).get(3+i))+")" ,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                        }
                    } else {
                        if (isInAncestor(var)){
                            if (val > Integer.parseInt(getFromAncestor(var).get(3+i))){
                                throw new SemanticException("Index out of bounds ("+val+" > "+Integer.parseInt(getFromAncestor(var).get(3+i))+")" ,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                            }
                        } else {
                            throw new SemanticException("Cannot find value `"+var+"` in this scope",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                        }
                    }
                    return new Type(varType.getName().split(" ",i+1)[i]);
                }
                throw new SemanticException("Mismatched types : expected i32, found " + valType,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
            }
            throw new SemanticException("Mismatched types : expected vec<>, found " + varType,child.getChild(0).getLine(),child.getChild(0).getCharPositionInLine());
        }

        if (child.getChildCount() > 0 && child.getChild(0).getText().equals("NEW")){
            Type tempType = new Type(name);
            checkType(tempType, child.getLine(), child.getCharPositionInLine());
            LinkedHashMap<String, ArrayList<String>> val = TDS.getFirstScope().getScope(name).getTable();
            HashMap<String, Boolean> valValid = new HashMap<>();
            for (String i : val.keySet()){
                valValid.put(i,false);
            }
            for (int i = 0; i < child.getChild(0).getChildCount();i++){
                Tree c = child.getChild(0).getChild(i);
                String attName = c.getText();
                if (val.containsKey(attName)){
                    Tree v = c.getChild(0);
                    Type type = getType(v);
                    Type theoricalType = new Type(val.get(attName).get(1));
                    if (type.equals(theoricalType)){
                        valValid.replace(attName,true);
                    } else {
                        throw new SemanticException("Mismatched types : expected "+theoricalType+", found " + type+" for attribute "+attName,child.getChild(0).getLine(),child.getChild(0).getCharPositionInLine());
                    }
                } else {
                    throw new SemanticException("Attribute "+attName+" does not exist for structure "+name,child.getChild(0).getLine(),child.getChild(0).getCharPositionInLine());

                }
            }
            if (valValid.containsValue(false)){
                List<String> l = new ArrayList<>();
                for (String i : valValid.keySet()){
                    if (!valValid.get(i)){
                        l.add(i);
                    }
                }
                throw new SemanticException("Missing attributes for structure "+name+" : "+l,child.getChild(0).getLine(),child.getChild(0).getCharPositionInLine());
            }
            return tempType;
        }

        if (child.getChildCount() > 0 && name.equals("vec")){
            Type tempType = getType(child.getChild(0));
            for (int i =0;i<child.getChildCount();i++){
                if (!getType(child.getChild(i)).equals(tempType)){
                    throw new SemanticException("Mismatched types : expected " + tempType + ", found " + getType(child.getChild(i)),child.getChild(0).getLine(),child.getChild(0).getCharPositionInLine());
                }
            }
            return new Type("vec "+tempType);
        }

        if (child.getChildCount() > 0){
            if (TDS.op.contains(name)){
                if (name.equals("=")){
                    String var = child.getChild(0).getText();
                    boolean haveToChange = false;
                    if (var.equals("UNISTAR")){
                        var=child.getChild(0).getChild(0).getText();
                        haveToChange = true;
                    }

                    if (var.equals("[")){
                        //System.out.println(TDS.getFirstScope().toString(1));
                        Type leftType =  getType(child.getChild(0));
                        Type secondType = getType(child.getChild(1));
                        if (leftType.equals(secondType)){
                            return secondType;
                        }
                        throw new SemanticException("Mismatched types : expected " + leftType + ", found " + secondType,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                    }

                    if (var.equals(".")){
                        Type leftType =  getType(child.getChild(0));
                        Type secondType = getType(child.getChild(1));
                        if (leftType.equals(secondType)){
                            return secondType;
                        }
                        throw new SemanticException("Mismatched types : expected " + leftType + ", found " + secondType,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                    }

                    if (isIn(var)){
                        Type tempType = new Type(table.get(var).get(1));
                        if (haveToChange) {
                            tempType = new Type(tempType.getName().substring(1));
                        }
                        Type type = getType(child.getChild(1));
                        if (tempType.equals(type)){
                            return type;
                        } else {
                            throw new SemanticException("Mismatched types : expected " + tempType + ", found " + type,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                        }
                    }
                    if (isInAncestor(var)){
                        Type tempType = new Type(getFromAncestor(var).get(1));
                        if (haveToChange) {
                            tempType = new Type(tempType.getName().substring(1));
                        }
                        Type type = getType(child.getChild(1));
                        if (tempType.equals(type)){
                            return type;
                        } else {
                            throw new SemanticException("Mismatched types : expected " + tempType + ", found " + type,child.getChild(1).getLine(),child.getChild(1).getCharPositionInLine());
                        }
                    }
                    throw new SemanticException("Cannot find value `"+var+"` in this scope",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                }
                if (name.equals("&")){
                    if (child.getChild(0).getChildCount() > 0){
                        throw new SemanticException("Unary operation `"+name+"` cannot be applied to expression",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                    }
                    Type tempType = getType(child.getChild(0));
                    return new Type("&"+tempType.getName());

                }
                Type tempType = getType(child.getChild(0));
                Type tempType2 = getType(child.getChild(1));
                if (tempType.getName().equals("i32")){
                    if (tempType2.getName().equals("i32")) {
                        return new Type("i32");
                    } else {
                        throw new SemanticException("Mismatched types : expected i32, found " + tempType2,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
                    }
                }
                throw new SemanticException("Binary operation `"+name+"` cannot be applied to type `"+tempType+"`",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());


            }
            if (TDS.opBool.contains(name)){
                if (name.equals("!")){
                    Type tempType = getType(child.getChild(0));
                    if (tempType.getName().equals("bool")){
                        return new Type("bool");
                    } else {
                        throw new SemanticException("Mismatched types : expected bool, found " + tempType,child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                    }
                }
                if (name.equals("&&") || name.equals("||")){
                    Type tempType = getType(child.getChild(0));
                    Type tempType2 = getType(child.getChild(1));
                    if (tempType.getName().equals("bool")){
                        if (tempType2.getName().equals("bool")){
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected bool, found " + tempType2,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
                        }
                    } else {
                        throw new SemanticException("Mismatched types : expected bool, found " + tempType,child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                    }
                }
                if (name.equals("==") || name.equals("!=")){
                    Type tempType = getType(child.getChild(0));
                    Type tempType2 = getType(child.getChild(1));
                    if (tempType.getName().equals("i32")){
                        if (tempType2.getName().equals("i32")) {
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected i32, found " + tempType2,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
                        }
                    }
                    if (tempType.getName().equals("bool")){
                        if (tempType2.getName().equals("bool")) {
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected bool, found " + tempType2,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
                        }
                    }
                    throw new SemanticException("Binary operation `"+name+"` cannot be applied to type `"+tempType+"`",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                }
                Type tempType = getType(child.getChild(0));
                Type tempType2 = getType(child.getChild(1));
                if (tempType.getName().equals("i32")){
                    if (tempType2.getName().equals("i32")){
                        return new Type("bool");
                    } else {
                        throw new SemanticException("Mismatched types : expected i32, found " + tempType2,child.getChild(1).getLine(), child.getChild(1).getCharPositionInLine());
                    }
                } else {
                    throw new SemanticException("Mismatched types : expected i32, found " + tempType,child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
                }
            }
            if (name.equals("UNISTAR")){
                Type tempType = getType(child.getChild(0));
                if (tempType.getName().startsWith("&")){
                    return new Type(tempType.getName().substring(1));
                }
                throw new SemanticException("Unary operation `*` cannot be applied to type `"+tempType+"`",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());

            }
            if (name.equals("UNISUB")){
                Type tempType = getType(child.getChild(0));
                if (tempType.getName().equals("i32")){
                    return new Type("i32");
                }
                throw new SemanticException("Unary operation `-` cannot be applied to type `"+tempType+"`",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());

            }


        }
        if (isIn(name)){
            ArrayList<String> values = table.get(name);
            String type = values.get(1);
            Type typeT = new Type(type);
            if (!typeT.isRaw())
                checkType(typeT,child.getLine(), child.getCharPositionInLine());
            return typeT;
        }
        if (isInAncestor(name)){
            ArrayList<String> values = getFromAncestor(name);
            if (child.getChildCount() > 0) {
                Scope tempscope = TDS.getFirstScope().getScope(name);
                Set<String> param = tempscope.getTable().keySet();
                LinkedList<String> ll = new LinkedList<>(param);
                for (int j=0;j<child.getChildCount();j++) {
                    String t = getType((child.getChild(j))).getName();
                    if (ll.size() > j){
                        ArrayList<String> val = tempscope.getTable().get(ll.get(j));
                        if (!val.get(0).equals("param")){
                            throw new SemanticException("Too many parameters for function "+name, child.getChild(j).getLine(),child.getChild(j).getCharPositionInLine());
                        }
                        if (!t.equals(val.get(1))) {
                            throw new SemanticException("Type mismatch for the Parameter '"+ (ll.get(j))+"' : expected "+val.get(1)+", found "+t,child.getChild(j).getLine(),child.getChild(j).getCharPositionInLine());
                        }
                    } else {
                        throw new SemanticException("Too many parameters for function "+name, child.getChild(j).getLine(),child.getChild(j).getCharPositionInLine());
                    }
                }
                if (ll.size() >child.getChildCount()) {
                    String l = tempscope.getTable().get(ll.get(child.getChildCount())).get(0);
                    if (l != null && l.equals("param")) {
                        throw new SemanticException("Not enough parameters for function " + name, child.getChild(child.getChildCount() - 1).getLine(), child.getChild(child.getChildCount() - 1).getCharPositionInLine());
                    }
                }
            }

            String type = values.get(1);
            Type typeT = new Type(type);
            if (!typeT.isRaw())
                checkType(typeT,child.getLine(), child.getCharPositionInLine());
            return typeT;
        }

        throw new SemanticException("Cannot find value `"+name+"` in this scope",child.getLine(), child.getCharPositionInLine());
    }

    /**
     * Add a parameter to this scope.
     * @param s "Param", leftover of an unique function
     * @param child Tree to add
     * @throws SemanticException If semantic controls fail
     */
    public void addParam(String s, Tree child) throws SemanticException {
        String name = child.toString();
        Type type = getRawType((BaseTree) child.getChild(0));
        if (s.equals("param")) {
            if (type.getName().startsWith("vec ")) {
                throw new SemanticException("Cannot pass vec as parameter, please use pointer", child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
            }
        }
        int deplacement = this.deplacement;
        this.deplacement += getDeplacement(type.getName(), new ArrayList<>());
        ArrayList<String> param = new ArrayList<>();
        param.add(s);
        param.add(type.getName());
        param.add(String.valueOf(deplacement));
        param.add("false");
        table.put(name,param);
        MiniRustCompiler.tds.getList().put(name,"param");

    }

    /**
     * Add a function to this scope.
     * @param s "Function", leftover of an unique function
     * @param child Tree to add
     * @throws SemanticException If semantic controls fail
     */
    public void addFunction(String s, Tree child) throws SemanticException {
        String name = child.getChild(0).toString();
        if (!isIn(name)){
            String returnType = null;
            if (child.getChildCount() > 1 ){
                if (child.getChild(1).toString().equals("->")){
                    returnType=child.getChild(1).getChild(0).toString();
                    Type tempType = new Type(returnType);
                    if (!tempType.isRaw())
                        checkType(new Type(returnType),child.getChild(1).getChild(0).getLine(),child.getChild(1).getChild(0).getCharPositionInLine());
                }
            }
            if (returnType == null){
                returnType="Void";
            }
            ArrayList<String> param = new ArrayList<>();
            param.add(s);
            param.add(returnType);
            table.put(name,param);
            MiniRustCompiler.tds.getList().put(name,"function");
        } else {
            throw new SemanticException("Function name already used",child.getChild(0).getLine(), child.getChild(0).getCharPositionInLine());
        }
    }

    /**
     * Check the existence of the type passed in parameter (Does a structure exist in the Symbol Table ?).
     * @param tempType The type to be checked
     * @throws SemanticException If the semantic controls failed (here a non-existing structure)
     */
    protected void checkType(Type tempType, int line, int column) throws SemanticException {
        if (tempType.is("Void")){
            return;
        }
        if (isIn(tempType.getName())){
            if (!table.get(tempType.getName()).get(0).equals("struct")){
                throw new SemanticException(tempType + " is not a struct", line, column);
            }
        } else {
            if (isInAncestor(tempType.getName())){
                if (!getFromAncestor(tempType.getName()).get(0).equals("struct")){
                    throw new SemanticException(tempType + " is not a struct", line, column);
                }
            } else {
                throw new SemanticException(tempType + " is not a struct", line, column);
            }
        }
    }

    /**
     * Get the data in scope's ancestor.
     * @param name Name of the entry
     * @return Data corresponding to name in scope's ancestor
     * @throws SemanticException If trying to recover a non-existing data
     * @see Scope#ancestor
     * @see Scope#isInAncestor(String)
     */
    ArrayList<String> getFromAncestor(String name) throws SemanticException {
        if (!isInAncestor(name)) {
            throw new SemanticException(name + " is not in ancestor");
        } else {
            if (getAncestor().isIn(name)){
                return getAncestor().getTable().get(name);
            } else{
                return getAncestor().getFromAncestor(name);
            }
        }
    }

    /**
     * Check if data is in scope's ancestor.
     * @param name Name of the data to search
     * @return 'true' if the data is in scope's ancestor, 'false' otherwise
     * @see Scope#ancestor
     * @see Scope#isInAncestor(String)
     */
    boolean isInAncestor(String name) {
        return ancestor != null && (ancestor.isIn(name) || ancestor.isInAncestor(name));
    }

    /**
     * Check if data is in this scope.
     * @param name Name of the data to search
     * @return 'true' if the data is in this scope, 'false' otherwise
     */
    boolean isIn(String name) {
        return table.containsKey(name);
    }

    /**
     * @return Scope's table
     */
    public LinkedHashMap<String,ArrayList<String>> getTable() {
        return table;
    }

    /**
     * Add a scope corresponding to a non-anonymous block to this scope.
     * @param s Name of scope to add
     * @param temp Scope to add
     * @see Scope#secondTable
     */
    public void addScopeNotInner(String s, Scope temp) {
        secondTable.put(s, temp);
    }

    /**
     * Add a structure to this scope
     * @param struct "Struct", leftover of an unique function
     * @param t Tree to add
     * @exception SemanticException If structure name already used
     */
    public void addStruct(String struct, BaseTree t) throws SemanticException {
        String name = t.getChild(0).toString();
        if (!isIn(name)){
            ArrayList<String> param = new ArrayList<>();
            param.add(struct);
            table.put(name,param);
            MiniRustCompiler.tds.getList().put(name,"struct");
        } else {
            throw new SemanticException("Structure name already used", t.getLine(), t.getCharPositionInLine());
        }

    }

    /**
     * Chech the tree represent a boolean
     * @param child Tree to check
     * @exception SemanticException If tree is not a boolean
     */
    public void checkCondition(Tree child) throws SemanticException {
        Type type=getType(child);
        if (!type.getName().equals("bool")){
            throw new SemanticException("Mismatched types : expected bool, found "+type,child.getLine(), child.getCharPositionInLine());
        }
    }

    /**
     * @param name Name of scope to get in secondTable
     * @return Corresponding scope
     */
    private Scope getScope(String name){
        return secondTable.get(name);
    }

    /**
     * Calculate adequate offset for variable of type type and, if vec, size of vecCoun
     * @param type Type of the variable
     * @param vecCoun Possible size for vec
     * @return Adequate offset ( 4 per i32, 1 per bool, 2 per & and struct, and size*getDeplacement(type) for vec)
     */
    private int getDeplacement(String type,ArrayList<Integer> vecCoun){
        if (type.equals("i32")){
            return 4;
        } else {
            if (type.equals("bool")){
                return 1;
            } else {
                if (type.startsWith("vec ")){
                    int a =vecCoun.get(0);
                    vecCoun.remove(vecCoun.get(0));
                    return a*getDeplacement(type.split(" ",2)[1], vecCoun);
                } else {
                    return 2;
                }
            }
        }

    }

    /**
     * @param temp Inner Scope to add
     */
    public void addInnerScope(Scope temp) {
        innerScopeList.add(temp);
    }

    public Scope isInIf() {
        Scope t = this;
        while (t.getAncestor() != null){
            if (t.getOrigin().equals("if")){
                return t;
            }
            t = t.getAncestor();
        }
        return null;
    }

    public Scope isInElse() {
        Scope t = this;
        while (t.getAncestor() != null){
            if (t.getOrigin().equals("else")){
                return t;
            }
            t = t.getAncestor();
        }
        return null;
    }

    public Scope isInWhile() {
        Scope t = this;
        while (t.getAncestor() != null){
            if (t.getOrigin().equals("while")){
                return t;
            }
            t = t.getAncestor();
        }
        return null;
    }

    public Scope isInAno() {
        Scope t = this;
        while (t.getAncestor() != null){
            if (t.getOrigin().equals("inner")){
                return t;
            }
            t = t.getAncestor();
        }
        return null;
    }
}
