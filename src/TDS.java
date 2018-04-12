import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

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
    private final String[] op = {"+","-","*","/","!","&","<","<=",">=","!=","==","&&","||","="};

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
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + t.getLine() + ":" + t.getCharPositionInLine());
                    //e.printStackTrace();
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
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + t.getLine() + ":" + t.getCharPositionInLine());
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
                } catch (Exception e) {
                    System.err.println("Error : \"" + e.getMessage() + "\" at " + t.getLine() + ":" + t.getCharPositionInLine());
                    //e.printStackTrace();
                }
                if (currentScope==temp)
                    return 1;
                return 2;
            case "if":
                temp = new Scope("if", currentScope, "if"+ifCount);
                currentScope.addScopeNotInner("if"+ifCount,temp);
                ifCount++;
                currentScope=temp;
                return 1;
            case "else":
                temp = new Scope("else", currentScope, "else"+elseCount);
                currentScope.addScopeNotInner("else"+elseCount,temp);
                elseCount++;
                currentScope=temp;
                return 1;
            case "while":
                temp = new Scope("while", currentScope, "while"+whileCount);
                currentScope.addScopeNotInner("while"+whileCount,temp);
                whileCount++;
                currentScope=temp;
                return 1;
            case "ANOBLOCK":
                temp = new Scope("anonymous", currentScope, "inner"+innerCount);
                currentScope.addScopeNotInner("inner"+innerCount,temp);
                innerCount++;
                currentScope=temp;
                return 1;
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
