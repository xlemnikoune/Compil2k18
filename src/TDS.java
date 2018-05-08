import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implement a Symbol table by associating a scope to each block and var/function to each scope.
 * @author Frosqh
 */
public class TDS {

    /**
     * Symbol table's list. Extends for each new variable.
     * @see TDS#getList()
     */
    private HashMap<String, String> liste = new HashMap<>();

    /**
     * Symbol table's current scope. Changes for each new enter or exit of block.
     * @see TDS#back()
     */
    Scope currentScope;

    /**
     * List of usable operations.
     */
    final static ArrayList<String> op = new ArrayList<>();

    /**
     * List of usable operations for booleans.
     */
    final static  ArrayList<String> opBool = new ArrayList<>();

    /**
     * Count of anonymous blocks (for naming purpose).
     */
    int innerCount=1;

    /**
     * Count of if blocks (for naming purpose)
     */
    private int ifCount=1;

    /**
     * Count of while blocks (for naming purpose)
     */
    private int whileCount=1;

    /**
     * Save the original Scope ("General")
     */
    private static Scope firstScope;

    /**
     *
     */
    private static HashMap<String, Boolean> functionReturned = new HashMap<>();

    private static HashMap<String, ArrayList<Integer>> functionPartiallyReturned = new HashMap<>();

    /**
     *
     */
    public TDS() {
        currentScope = new Scope("General", null, "General");
        firstScope=currentScope;
        op.add("+"); //->bin
        op.add("-"); //->bin
        op.add("*"); //->bin
        op.add("/"); //->bin
        opBool.add("!");
        op.add("&"); //->unaire
        opBool.add("<");
        opBool.add(">");
        opBool.add("<=");
        opBool.add(">=");
        opBool.add("!=");
        opBool.add("==");
        opBool.add("&&");
        opBool.add("||");
        op.add("="); //->done

    }

    static Scope getFirstScope() {
        return firstScope;
    }

    /**
     * Go back in current scope's ancestor (e.g after treatment of a function)
     * @see TDS#currentScope
     */
    void back(){
        currentScope = currentScope.getAncestor();
    }

    /**
     * Add to current scope the data described by t (if needed).
     * @param t Tree corresponding to data to addVar
     * @param fromScope Is it is called for a control purpose ?
     * @return 2 if everything went well and 1 if it is needed to go back (e.g treatment of a function, a block ...)
     */
    public int add(BaseTree t,boolean fromScope) {
        Scope temp = null;
        String name;
        switch (t.toString()) {
            case "let":
                try {
                    currentScope.addVar((List<BaseTree>) t.getChildren());
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    //e.printStackTrace();
                }
                return 2;
            case "struct":
                try {
                    currentScope.addStruct(t);
                    temp = new Scope("struct", currentScope, t.getChild(0).toString());
                    currentScope.addScopeNotInner(t.getChild(0).toString(),temp);
                    currentScope=temp;

                    for (int i=0; i<t.getChildCount()-1;i++){
                        currentScope.addParam("attribute", t.getChild(i+1));
                    }
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    //e.printStackTrace();
                }
                if (currentScope==temp)
                    return 1;
                return 2;
            case "fn":
                try {
                    currentScope.addFunction(t);
                    functionReturned.put(t.getChild(0).getText(),false);
                    functionPartiallyReturned.put(t.getChild(0).getText(), new ArrayList<>());
                    temp = new Scope("function", currentScope, t.getChild(0).toString());
                    currentScope.addScopeNotInner(t.getChild(0).toString(), temp);
                    currentScope = temp;

                    for (int i = 0; i<t.getChildCount()-2;i++) {
                        if (!t.getChild(i + 1).toString().equals("BLOCK")) {
                            if (!t.getChild(i + 1).toString().equals("->")) {
                                currentScope.addParam("param", t.getChild(i + 1));
                            }
                        }
                    }
                    return 1;
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    //e.printStackTrace();
                }
                if (currentScope==temp)
                    return 1;
                return 2;
            case "if":
                temp = new Scope("if", currentScope, "if"+ifCount);
                currentScope.addScopeNotInner("if"+ifCount,temp);
                try {
                    currentScope.checkCondition(t.getChild(0));
                    ifCount++;
                    currentScope=temp;
                    return 1;
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    //e.printStackTrace();
                }
                return 2;
            case "else":
                temp = new Scope("else", currentScope, "else"+(ifCount-1));
                currentScope.addScopeNotInner("else"+(ifCount-1),temp);
                currentScope=temp;
                return 1;
            case "while":
                temp = new Scope("while", currentScope, "while"+whileCount);
                currentScope.addScopeNotInner("while"+whileCount,temp);
                try {
                    currentScope.checkCondition(t.getChild(0));
                    whileCount++;
                    currentScope=temp;
                    return 1;
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    //e.printStackTrace();
                }
                return 2;

            //cas return
            case "return":

                Scope tempScope = currentScope;
                while (!tempScope.getOrigin().equals("function")){
                    tempScope = tempScope.getAncestor();
                }
                name = tempScope.getName();
                Type type = new Type(tempScope.getAncestor().getTable().get(name).get(1));
                try {
                    if (t.getChildCount() == 0){
                        if (!(type.getName().equals("Void"))){
                            System.err.println("Error : \"Mismatched types : expected "+ type +", found Void \"at " + t.getLine() + ":" + t.getCharPositionInLine());
                            return 2;
                        }
                    }
                    Type secondType = currentScope.getType(t.getChild(0));
                    if (!(type.equals(secondType))) {
                        System.err.println("Error :\"Mismatched types : expected "+ type +", found "+secondType+" \"at " + t.getLine() + ":" + t.getCharPositionInLine());
                    }

                }catch (SemanticException e){
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + t.getLine() + ":" + t.getCharPositionInLine());
                }
                Scope ifBlock;
                if ((ifBlock = currentScope.isInIf())!=null){
                    functionPartiallyReturned.get(name).add(Integer.parseInt(ifBlock.getName().replace("if","")));
                } else {
                    Scope elseBlock;
                    if ((elseBlock = currentScope.isInElse())!=null){
                        if (functionPartiallyReturned.get(name).contains(Integer.parseInt(elseBlock.getName().replace("if","")))){
                            functionReturned.replace(name, true);
                        }
                    } else {
                        if (currentScope.isInWhile() == null && currentScope.isInAno()==null){
                            functionReturned.replace(name,true);
                        }
                    }
                }

                return 2;

            case "ANOBLOCK":
                if (fromScope) {
                    temp = new Scope("anonymous", currentScope, "inner" + innerCount);
                    currentScope.addInnerScope(temp);
                    innerCount++;
                    currentScope = temp;
                    return 1;
                }
                return 2;
            case "=":

                boolean toDo = true;
                for (Tree j : t.getAncestors()){
                    if (j.getText() != null && j.getText().equals("let")){
                        toDo = false;
                    }
                }
                if (toDo) {
                    boolean ismut = false;
                    name = t.getChild(0).getText();
                    if (name.equals("UNISTAR")) {
                        name = t.getChild(0).getChild(0).getText();
                        ismut = true;
                    }
                    if (name.equals(".")) {
                        name = t.getChild(0).getChild(0).getText();
                    }
                    if (name.equals("[")) {
                        Tree ch = t.getChild(0);
                        while (ch.getText().equals("[")){
                            ch = ch.getChild(0);
                        }
                        name = ch.getText();
                    }
                    if (currentScope.isIn(name)) {
                        if( currentScope.getTable().get(name).get(3).equals("true") ){
                            ismut=true;
                        }
                    } else if (currentScope.isInAncestor(name)) {
                        try {
                            if ( currentScope.getFromAncestor(name).get(3).equals("true")){
                                ismut=true;
                            }
                        } catch (SemanticException e) {
                            System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                            //e.printStackTrace();
                        }
                    } else {
                        System.err.println("Error : \"Var `"+name+"`\" doesn't exist at " + t.getLine() + ":" + t.getCharPositionInLine());
                        return 2;
                    }
                    if (ismut) {
                        try {
                            currentScope.getType(t);

                        } catch (SemanticException e) {
                            System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                            //e.printStackTrace();
                        }
                    } else {
                        System.err.println("Error : \"cannot assign twice to immutable variable `"+name+"`\" at " + t.getLine() + ":" + t.getCharPositionInLine());
                    }
                }
                return 2;
            default:
                boolean todo = true;
                boolean realToDo = false;
                ArrayList<String> alreadyTreated = new ArrayList<>();
                alreadyTreated.add("=");
                alreadyTreated.add("let");
                alreadyTreated.add("return");
                alreadyTreated.add(".");
                ArrayList<String> keywords = new ArrayList<>();
                keywords.add("RES");
                keywords.add("print");
                keywords.add("BLOCK");
                keywords.add("len");
                for (Tree j : t.getAncestors()){
                    String node = j.getText();
                    if (node != null && alreadyTreated.contains(node)){
                        todo = false;
                    }
                    if (node != null && node.equals("BLOCK")){
                        realToDo=true;
                    }
                }
                if (keywords.contains(t.getText())){
                    todo=false;
                }
                if (todo && realToDo){
                    try {
                        currentScope.getType(t);
                    } catch (SemanticException e) {
                        System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                        //e.printStackTrace();
                    }
                }
        }
        return 2;
    }

    /**
     * @return List corresponding to Symbol Table
     * @see TDS#liste
     */
    public HashMap<String,String> getList() {
        return liste;
    }

    /**
     * Print Symbol Table in a understandable way
     * @return The string representing the Symbol Table
     * @see Scope#toString(int)
     */
    @Override
    public String toString(){
        return currentScope.toString(1);
    }

    void validate() {
        if (functionReturned.containsValue(false)){
            ArrayList<String> notReturned = new ArrayList<>();
            for (String i : functionReturned.keySet()){
                if (! functionReturned.get(i) && !currentScope.getTable().get(i).get(1).equals("Void")){
                    notReturned.add(i);
                }
            }
            if (notReturned.size()>0)
                System.out.println("WARNING ! These functions does not have a proper return : "+notReturned);
        }
    }
}
