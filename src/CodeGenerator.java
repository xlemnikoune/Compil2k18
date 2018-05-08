import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        code += "NIL EQU 0";
        code += "SP EQU R15\n\n";
        code += "WR EQU R14\n\n";
        code += "BP EQU R13\n\n";
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
                    codeBuilder.append(genCode(t2));
                }
            }
        }
        code += codeBuilder.toString();
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
        if (t.getChild(0).getText().equals("main")){
            return genMain((BaseTree) t.getChild(1));
        }

        return "";
    }

    private String generatePrint(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(genExpr((BaseTree) t.getChild(0)));
        codeBuilder.append("LDW WR, #WRITE_EXC\n\n");
        codeBuilder.append("TRP WR\n\n");
        return codeBuilder.toString();
    }

    private String genExpr(BaseTree t) {
        StringBuilder codeBuilder = new StringBuilder();
        switch (t.getText()){
            case "print":
                codeBuilder.append(generatePrint(t));
                break;
            case "VEC":
                codeBuilder.append(genVec(t));
                break;
            default:
                codeBuilder.append(generateNo(t));
        }
        return codeBuilder.toString();
    }

    private String genVec(BaseTree t) {
    }

    private String genMain(BaseTree t) {
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("main_ LDW SP, #STACK_ADRS\n\n");
        codeBuilder.append("LDQ NIL, BP\n\n");
        codeBuilder.append("STW BP,-(SP)\n\n");
        codeBuilder.append("LDW BP, SP\n\n");
        for (BaseTree t2 : (List<BaseTree>) t.getChildren()){
            codeBuilder.append(generateInstr(t2));
        }
        codeBuilder.append("LDW SP, BP\n\n");
        codeBuilder.append("LDW BP, (SP)+\n\n");
        codeBuilder.append("LDW WR, #EXIT_EXC\n\n");
        codeBuilder.append("TRP WR\n\n");
        codeBuilder.append("LDW WR, #debut\n\n");
        codeBuilder.append("JEA (WR)\n\n");
        return codeBuilder.toString();
    }

    private String generateStruct(BaseTree t) {
        return "";
    }

    private String generateInstr(BaseTree t) {
        StringBuilder codeBuilder = new StringBuilder();
        switch (t.getText()){
            case "print":
                codeBuilder.append(generatePrint(t));
                break;
        }
        return codeBuilder.toString();
    }

    private int getDeplacement(String text) throws Exception {
        ArrayList<String> l = sc.find(text);
        return Integer.valueOf(l.get(2));
    }
}