import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

/**
 * Implement a compiler for MiniRust Language. <br>
 * Grammar of this language can be found <a href="../Grammar.g">here</a>.
 * @author Frosqh
 */
public class MiniRustCompiler {
    public static TDS tds;

    /*******************************************************************************************************************/

    /**
     * Compile the file passed in argument. <br>
     * Exit Code : 5 -&gt; Error while parsing <br>
     * Exit Code : 6 -&gt; Error on semantic controls
     * @param args args[0] : file path
     * @throws IOException If error on opening FileStream
     * @throws RecognitionException If error on parsing the file
     */
    public static void main(String[] args) throws IOException {
        CharStream input;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        System.setErr(ps);
        if (args.length > 0){
            input = new ANTLRFileStream(args[0]);
        }
        else {
            System.out.println("Please type your program here : ");
            input = new ANTLRInputStream(System.in);
        }
        CommonTree t=null;
        try {
            GrammarLexer lex = new GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            GrammarParser parser = new GrammarParser(tokens);
            GrammarParser.axiom_return r = parser.axiom();
            t = r.tree;
        } catch (RecognitionException e){
            System.err.println(e);
        } catch (Exception e){
            //System.err.println(e);
        }
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(5); // -> Error on parsing
        }
        //System.setErr(old);
        tds = new TDS();
        parseTree(t,tds,false,false);
        tds.validate();
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(6); // -> Error on semantic controls
        }
        System.out.println(tds);
    }

    /**
     * Parse the tree to build the Symbol Table
     * @param t Tree to parse
     * @param tds Current state of Symbol Table
     * @param b Is it a new scope ?
     * @see TDS#add(BaseTree, boolean)
     */
    protected static void parseTree(CommonTree t, TDS tds, boolean b, boolean fromScope){
        int hasChanged;
        List<BaseTree> l = (List<BaseTree>) t.getChildren();
        if (l != null){
            for (BaseTree AST : l){
                hasChanged = tds.add(AST,fromScope);
                parseTree((CommonTree) AST,tds,(hasChanged == 1),fromScope);
            }
        }
        if (b){
            tds.back();
        }
    }
}
