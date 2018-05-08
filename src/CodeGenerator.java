import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CodeGenerator{

    private Scope sc;
    private String code;
    private final String outputFile;

    public CodeGenerator(String output, Scope currentScope) {
        outputFile = output;
        sc = currentScope;
        code = ""; //Initialiser le code assembleur ici
        code += "EXIT_EXC EQU 64\n\n";
        code += "WRITE_EXC EQU 66\n\n";
        code += "STACK_ADRS EQU 0X1000\n\n";
        code += "LOAD_ADRS EQU 0XF000\n\n";
        code += "SP EQU R15\n\n";
        code += "WR EQU R14\n\n";
        code += "BP EQU R13\n\n";
        code += "LDW SP, #STACK_ADRS\n\n";
        code += "ORD LOAD_ADRS\n\n";
        code += "start main\n\n";
    }

    public void save() throws Exception {
        File out = new File(outputFile);
        BufferedWriter s;
        try {
            s = new BufferedWriter(new FileWriter(out));
        } catch (IOException e) {
            throw new Exception("You can't write on file" + outputFile);
        }
        code+= "LDW WR, #EXIT_EXC\n\n";
        code+= "TRP R14\n\n";
        code+= "LDW R14, #debut\n\n";
        code+= "JEA (R14)\n\n";
        s.write(code);
        s.close();
    }

    public void generate(CommonTree t){
        StringBuilder codeBuilder = new StringBuilder();
        if (t.getText() != null){ //Si c'est une feuille (ou un noeud nommé), on génére
            codeBuilder.append(genCode(t));
        } else { //Sinon, on parcourt les fils
            List<BaseTree> l = (List<BaseTree>) t.getChildren();
            if (l != null){
                for (BaseTree t2 : l){
                    codeBuilder.append(genCode(t));
                }
            }
        }
    }

    private String genCode(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        String temp;
        switch(t.getText()){
            case "struct":
                temp = generateStruct(t);
                codeBuilder.append(temp);
                break;
            case "fn":
                temp = generateFun(t);
                codeBuilder.append(temp);
                break;
            default:
                System.err.println("What is the fuck");
        }
        return codeBuilder.toString();
    }

    private String generateFun(BaseTree t) {
        return "";
    }

    private String generateStruct(BaseTree t) {
        return "";
    }
}