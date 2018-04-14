import org.antlr.runtime.tree.CommonTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator{

    private Scope sc;
    private String code;
    private final String outputFile;

    public CodeGenerator(String output, Scope currentScope) {
        outputFile = output;
        sc = currentScope;
        code = ""; //Initialiser le code assembleur ici
    }

    public void save() throws Exception {
        File out = new File(outputFile);
        BufferedWriter s;
        try {
            s = new BufferedWriter(new FileWriter(out));
        } catch (IOException e) {
            throw new Exception("You can't write on file" + outputFile);
        }
        s.write(code);
        s.close();
    }

    public void generate(CommonTree t){
        //code += generation du code
    }
}