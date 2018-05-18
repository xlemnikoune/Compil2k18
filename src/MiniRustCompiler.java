import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
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

    /**
     * Compile the file passed in argument. <br>
     * Exit Code : 5 -&gt; Error while parsing <br>
     * Exit Code : 6 -&gt; Error on semantic controls
     * @param args args[0] : file path
     * @throws IOException If error on opening FileStream
     * @see #parseTree(CommonTree, TDS, boolean, boolean)
     * @see #genCode(CommonTree, TDS, String)
     */
    public static void main(String[] args) throws Exception {
        CharStream input;
        String output = "./code";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        //System.setErr(ps);
        if (args.length > 0){
            input = new ANTLRFileStream(args[0]);
            if (args.length >1)
                output=args[1];
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
        } catch (Exception e){
            System.err.println(e);
        }
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(5); // -> Error on parsing
        }
        tds = new TDS();
        assert t != null;
        parseTree(t,tds,false,false);
        tds.validate();
        System.out.println(tds);
        if (baos.toString().length() > 0){
            System.setErr(old);
            System.err.println(baos.toString());
            System.exit(6); // -> Error on semantic controls
        }

        System.setErr(old);
        genCode(t, tds, output);
        System.exit(0);
    }


    /**
     * Generate the PIUP code corresponding to AST and associated Symbol Table
     * @param t AST to parse
     * @param tds Associated Symbol Table
     * @param output Path to save code output
     * @throws Exception
     * @see CodeGenerator#generate(CommonTree)
     * @see CodeGenerator#save();
     */
    private static void genCode(CommonTree t, TDS tds, String output) throws Exception {
        CodeGenerator code = new CodeGenerator(output, tds.currentScope);
        code.generate(t);
        code.save();
    }

    /**
     * Parse the tree to build the Symbol Table
     * @param t Tree to parse
     * @param tds Current state of Symbol Table
     * @param b Is it a new scope ?
     * @param fromScope Is it is called for a control purpose ?
     * @see TDS#add(BaseTree, boolean)
     */
    static void parseTree(CommonTree t, TDS tds, boolean b, boolean fromScope){
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
