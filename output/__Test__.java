import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        GrammarLexer lex = new GrammarLexer(new ANTLRFileStream("D:\\workspace\\raimondi3u\\Examples\\ex2.rs", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GrammarParser g = new GrammarParser(tokens, 49100, null);
        try {
            g.axiom();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}