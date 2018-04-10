import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import java.util.HashMap;
import java.util.List;

public class TDS {
    private HashMap<String, String> liste = new HashMap<>();
    private Scope currentScope;
    private final String[] op = {"+","-","*","/","!","&","<","<=",">=","!=","==","&&","||","="};
    private int innerCount;

    public TDS() {
        currentScope = new Scope("General", null, "General");
    }

    public void back(){
        currentScope = currentScope.getAncestor();
    }

    public int add(BaseTree t) {
        switch (t.toString()) {
            case "let":
                try {
                    currentScope.add("var", (List<BaseTree>) t.getChildren());
                    return 0;
                } catch (Exception e) {
                    System.err.println("Error : \"" + e.getMessage() + "\"at " + t.getLine() + ":" + t.getCharPositionInLine());
                    e.printStackTrace();
                    System.exit(-1);
                }
                return 2;
            case "struct":
                System.out.println("VTFF !");
                return 2;
            case "fn"
        }
        return 2;
    }

    public HashMap<String,String> getListe() {
        return liste;
    }

    public void check(BaseTree ast, CommonTree t) {
    }

    public String toString(){
        return currentScope.toString(1);
    }
}
