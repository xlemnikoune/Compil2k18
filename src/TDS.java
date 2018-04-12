import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
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
    private Scope currentScope;

    /**
     * List of usable operations.
     */
    protected final static ArrayList<String> op = new ArrayList<>();

    /**
     * List of usable operations for booleans.
     */
    protected final static  ArrayList<String> opBool = new ArrayList<>();

    /**
     * Count of anonymous blocks (for naming purpose).
     */
    private int innerCount=1;

    /**
     * Count of if blocks (for naming purpose)
     */
    private int ifCount=1;

    /**
     * Count of else blocks (for naming purpose)
     */
    private int elseCount=1;

    /**
     * Count of while blocks (for naming purpose)
     */
    private int whileCount=1;

    /*******************************************************************************************************************/

    /**
     *
     */
    public TDS() {
        currentScope = new Scope("General", null, "General");
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

    /**
     * Go back in current scope's ancestor (e.g after treatment of a function)
     * @see TDS#currentScope
     */
    public void back(){
        currentScope = currentScope.getAncestor();
    }

    /**
     * Add to current scope the data described by t (if needed).
     * @param t Tree corresponding to data to addVar
     * @return 2 if everything went well and 1 if it is needed to go back (e.g treatment of a function, a block ...)
     */
    public int add(BaseTree t) {
        Scope temp = null;
        switch (t.toString()) {
            case "let":
                try {
                    currentScope.addVar("var", (List<BaseTree>) t.getChildren());
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                    e.printStackTrace();
                }
                return 2;
            case "struct":
                //TODO Gérer les structures :!
                try {
                    currentScope.addStruct("struct", t);
                    temp = new Scope("struct", currentScope, t.getChild(0).toString());
                    currentScope.addScopeNotInner(t.getChild(0).toString(),temp);
                    currentScope=temp;

                    for (int i=0; i<t.getChildCount()-1;i++){
                        currentScope.addParam("attribute", t.getChild(i+1));
                    }
                } catch (SemanticException e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                }
                if (currentScope==temp)
                    return 1;
                return 2;
            case "fn":
                try {
                    currentScope.addFunction("function", t);
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
                }
                return 2;
            case "else":
                temp = new Scope("else", currentScope, "else"+elseCount);
                currentScope.addScopeNotInner("else"+elseCount,temp);
                elseCount++;
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
                }
                return 2;

            //cas return
            case "return":

                //Type returnType = currentScope.getType();
                String name ;
                Scope tempScope = currentScope;
                while (tempScope.getOrigin() != "function"){
                        tempScope = tempScope.getAncestor();


                }
                name = tempScope.getName();
                try {
                    if (!(tempScope.getAncestor().getTable().get(1)).equals(currentScope.getType(t.getChild(0)).toString())) {
                        System.err.println("Return type Error at " + t.getLine() + ":" + t.getCharPositionInLine());
                    }

                }catch (SemanticException e){
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + t.getLine() + ":" + t.getCharPositionInLine());
                    }
                return 2;


             //attention
            case "ANOBLOCK":
                temp = new Scope("anonymous", currentScope, "inner"+innerCount);
                currentScope.addScopeNotInner("inner"+innerCount,temp);
                innerCount++;
                currentScope=temp;
                return 1;
            case "=":
                Boolean toDo = true;
                for (Tree j : t.getAncestors()){
                    if (j.getText() != null && j.getText().equals("let")){
                        toDo = false;
                    }
                }
                if (toDo) {
                    try {
                        currentScope.getType(t);
                    } catch (SemanticException e) {
                        System.err.println("Error : \"" + e.getMessage() + "\" at " + e.getLine() + ":" + e.getColumn());
                        //e.printStackTrace();
                    }
                }
                return 2;
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
     * Execute some semantic controls
     * @param ast
     * @param t
     */
    public void check(BaseTree ast, CommonTree t) {
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
}
