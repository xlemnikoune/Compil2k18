import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <b>Correspond to a Scope in code (Function, block, loop ...).</b> <br>
 * A scope contains following informations :
 * <ul>
 *     <li>An ancestor</li>
 *     <li>An origin</li>
 *      <li>A name</li>
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
    private HashMap<String, ArrayList<String>> table;

    /**
     * Scope's second table. Extends for each non-anonymous block encountered.
     * @see Scope#addScopeNotInner(String, Scope)
     */
    private HashMap<String, Scope> secondTable;

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
        table = new HashMap<>();
        secondTable = new HashMap<>();
        origin = id;
        ancestor = anc;
        name = string;
    }

    /**
     * @return Scope's offset
     * @see Scope#deplacement
     */
    public int getDeplacement() {
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
     *  &emsp; param1 : [param, param1type, offset] <br>
     *  &emsp; var1 : [var, var1type, offset, mutable?] <br>
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
                String temp =sc.toString(tab+1);
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
            if (!isIn(name)){
                if (isInAncestor(name)) {
                    System.out.println("Warning : \"Var name surcharged : " + name + "\" at " + children.get(0).getLine() + ":" + children.get(0).getCharPositionInLine());
                }
                Type tempType = getType(childrens.get(1));
                if (type != null) {
                    if (!type.equals(tempType)) {
                        throw new SemanticException("Mismatched types : expected " + type + ", found " + tempType);
                    } else {
                        type = tempType;
                    }
                } else {
                    type=tempType;
                }

                int deplacement = 0;
                if (type.is("i32")){
                    deplacement = this.deplacement;
                    this.deplacement += 4;
                } else {
                    if (type.is("bool")){
                        deplacement = this.deplacement;
                        this.deplacement += 1;
                    } else {
                        deplacement = this.deplacement;
                        this.deplacement += 12;
                        //TODO Struct type and vec type -> offset
                    }
                }
                ArrayList<String> param = new ArrayList<>();
                param.add(string);
                param.add(type.getName());
                param.add(String.valueOf(deplacement));
                param.add(String.valueOf(isMut));

                table.put(name,param);
                MiniRustCompiler.tds.getList().put(name,"var");
            } else {
                throw new SemanticException("Var name already used : " + name);
            }
        } else {
            System.err.println("Should not happen");
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
                checkType(tempType);
            type = new Type("vec "+tempType.getName());
        }

        if (text.matches("[a-zA-Z][a-zA-Z0-9]+") && type==null){ //First should always be true
            type=new Type(text);
            checkType(type);
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
            name=child.getText();
        }
        if (name.equals("true") || name.equals("false")){ //Si l'on a affaire à un booléen
            return new Type("bool");
        }

        if (name.matches("[0-9]+")){
            return new Type("i32");
        }

        if (child.getChildCount() > 0 && child.getChild(0).getText().equals("NEW")){
            Type tempType = new Type(name);
            checkType(tempType);
            return tempType;
        }

        if (child.getChildCount() > 0 && name.equals("vec")){
            Type tempType = getType(child.getChild(0));
            for (int i =0;i<child.getChildCount();i++){
                if (!getType(child.getChild(i)).equals(tempType)){
                    throw new SemanticException("Mismatched types : expected " + tempType + ", found " + getType(child.getChild(i)));
                }
            }
            return tempType;
        }

        if (child.getChildCount() > 0){
            //TODO Opération ou trucs plus compliqués du moins !
            if (TDS.op.contains(name)){
                if (name.equals("=")){
                    String var = child.getChild(0).getText();
                    boolean haveToChange = false;
                    if (var.equals("UNISTAR")){
                        var=child.getChild(0).getChild(0).getText();
                        haveToChange = true;
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
                            throw new SemanticException("Mismatched types : expected " + tempType + ", found " + type);
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
                            throw new SemanticException("Mismatched types : expected " + tempType + ", found " + type);
                        }
                    }
                    throw new SemanticException("Cannot find value `"+var+"` in this scope");
                }
                if (name.equals("&")){
                    if (child.getChild(0).getChildCount() > 0){
                        throw new SemanticException("Unary operation `"+name+"` cannot be applied to expression");
                    }
                    String var = child.getChild(0).getText();
                    Type tempType = getType(child.getChild(0));
                    return new Type("&"+tempType.getName());

                }
                Type tempType = getType(child.getChild(0));
                Type tempType2 = getType(child.getChild(1));
                if (tempType.getName().equals("i32")){
                    if (tempType2.getName().equals("i32")) {
                        return new Type("i32");
                    } else {
                        throw new SemanticException("Mismatched types : expected i32, found " + tempType2);
                    }
                }
                throw new SemanticException("Binary operation `"+name+"` cannot be applied to type `"+tempType+"`");


            }
            if (TDS.opBool.contains(name)){
                if (name.equals("!")){
                    Type tempType = getType(child.getChild(0));
                    if (tempType.getName().equals("bool")){
                        return new Type("bool");
                    } else {
                        throw new SemanticException("Mismatched types : expected bool, found " + tempType);
                    }
                }
                if (name.equals("&&") || name.equals("||")){
                    Type tempType = getType(child.getChild(0));
                    Type tempType2 = getType(child.getChild(1));
                    if (tempType.getName().equals("bool")){
                        if (tempType2.getName().equals("bool")){
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected bool, found " + tempType2);
                        }
                    } else {
                        throw new SemanticException("Mismatched types : expected bool, found " + tempType);
                    }
                }
                if (name.equals("==") || name.equals("!=")){
                    Type tempType = getType(child.getChild(0));
                    Type tempType2 = getType(child.getChild(1));
                    if (tempType.getName().equals("i32")){
                        if (tempType2.getName().equals("i32")) {
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected i32, found " + tempType2);
                        }
                    }
                    if (tempType.getName().equals("bool")){
                        if (tempType2.getName().equals("bool")) {
                            return new Type("bool");
                        } else {
                            throw new SemanticException("Mismatched types : expected bool, found " + tempType2);
                        }
                    }
                    throw new SemanticException("Binary operation `"+name+"` cannot be applied to type `"+tempType+"`");
                }
                Type tempType = getType(child.getChild(0));
                Type tempType2 = getType(child.getChild(1));
                if (tempType.getName().equals("i32")){
                    if (tempType2.getName().equals("i32")){
                        return new Type("bool");
                    } else {
                        throw new SemanticException("Mismatched types : expected i32, found " + tempType2);
                    }
                } else {
                    throw new SemanticException("Mismatched types : expected i32, found " + tempType);
                }
            }
            if (name.equals("UNISTAR")){
                Type tempType = getType(child.getChild(0));
                if (tempType.getName().startsWith("&")){
                    return new Type(tempType.getName().substring(1));
                }
                throw new SemanticException("Unary operation `*` cannot be applied to type `"+tempType+"`");

            }
            if (name.equals("UNISUB")){
                Type tempType = getType(child.getChild(0));
                if (tempType.getName().equals("i32")){
                    return new Type("i32");
                }
                throw new SemanticException("Unary operation `-` cannot be applied to type `"+tempType+"`");

            }


        }
        if (isIn(name)){
            ArrayList<String> values = table.get(name);
            String type = values.get(1);
            Type typeT = new Type(type);
            if (!typeT.isRaw())
                checkType(typeT);
            return typeT;
        }
        if (isInAncestor(name)){
            ArrayList<String> values = getFromAncestor(name);
            String type = values.get(1);
            Type typeT = new Type(type);
            if (!typeT.isRaw())
                checkType(typeT);
            return typeT;
        }

        throw new SemanticException("Cannot find value `"+name+"` in this scope");
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
        int deplacement = 0;
        if (type.is("i32")){
            deplacement = this.deplacement;
            this.deplacement += 4;
        } else {
            if (type.is("bool")){
                deplacement = this.deplacement;
                this.deplacement += 1;
            } else{
                deplacement = this.deplacement;
                this.deplacement += 1;
            }
        }
        ArrayList<String> param = new ArrayList<>();
        param.add(s);
        param.add(type.getName());
        param.add(String.valueOf(deplacement));
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
            throw new SemanticException("Function name already used");
        }
    }

    /**
     * Check the existence of the type passed in parameter (Does a structure exist in the Symbol Table ?).
     * @param tempType The type to be checked
     * @throws SemanticException If the semantic controls failed (here a non-existing structure)
     */
    private void checkType(Type tempType) throws SemanticException {
        if (isIn(tempType.getName())){
            if (!table.get(tempType.getName()).get(0).equals("struct")){
                throw new SemanticException(tempType + " is not a struct");
            }
        } else {
            if (isInAncestor(tempType.getName())){
                if (!getFromAncestor(tempType.getName()).get(0).equals("struct")){
                    throw new SemanticException(tempType + " is not a struct");
                }
            } else {
                throw new SemanticException(tempType + " is not a struct");
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
    private ArrayList<String> getFromAncestor(String name) throws SemanticException {
        if (!isInAncestor(name)) {
            throw new SemanticException(name + "is not in ancestor");
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
    private boolean isInAncestor(String name) {
        return ancestor != null && (ancestor.isIn(name) || ancestor.isInAncestor(name));
    }

    /**
     * Check if data is in this scope.
     * @param name Name of the data to search
     * @return 'true' if the data is in this scope, 'false' otherwise
     */
    private boolean isIn(String name) {
        return table.containsKey(name);
    }

    /**
     * @return Scope's table
     */
    public HashMap<String,ArrayList<String>> getTable() {
        return table;
    }

    /**
     * Add a scope corresponding to a non-anonymous block to this scope.
     * @param s Name of scope to addVar
     * @param temp Scope to addVar
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
            throw new SemanticException("Structure name already used");
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
            throw new SemanticException("Mismatched types : expected bool, found "+type);
        }
    }
}
