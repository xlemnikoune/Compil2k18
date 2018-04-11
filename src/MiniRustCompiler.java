import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import java.io.IOException;
import java.util.List;

public class MiniRustCompiler {
    public static TDS tds;

    public static void main(String[] args) throws IOException, RecognitionException {
        CharStream input;

        if (args.length > 0){
            System.out.println(args[0]);
            input = new ANTLRFileStream(args[0]);
        }
        else {
            System.out.println("Please type your program here : ");
            input = new ANTLRInputStream(System.in);
        }
        GrammarLexer lex = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.axiom_return r = parser.axiom();
        CommonTree t = r.tree;
        tds = new TDS();
        parseTree(t,tds,false);
        System.out.println(tds);

    }

    private static void parseTree(CommonTree t, TDS tds, boolean b){
        int hasChanged;
        List<BaseTree> l = (List<BaseTree>) t.getChildren();
        if (l != null){
            for (BaseTree AST : l){
                //System.out.println(AST);
                hasChanged = tds.add(AST);
                tds.check(AST,t);
                parseTree((CommonTree) AST,tds,(hasChanged == 1));
            }
        }
        if (b){
            tds.back();
        }
    }
}
