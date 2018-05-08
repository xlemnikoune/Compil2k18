import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator{

    private Scope sc;
    private String code;
    private final String outputFile;
    final String[] op = {"+", "-", "*", ">", "<", "<=", "==", ">=", "!=","UNISUB","UNISTAR","!","&","&&","||",};

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
            return genMain(t.getChild(1));
        }
        return "";
    }

    private String genMain(Tree child) {
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("main_ LDW SP, #STACK_ADRS\n\n");
        codeBuilder.append("LDQ NIL, BP");
        codeBuilder.append("STW BP,-(SP)");
        codeBuilder.append("LDW BP, SP");




        codeBuilder.append("LDW SP, BP");
        codeBuilder.append("LDW BP, (SP)+");
        codeBuilder.append("LDW WR, #EXIT_EXC\n\n");
        codeBuilder.append("TRP WR\n\n");
        codeBuilder.append("LDW WR, #debut\n\n");
        codeBuilder.append("JEA (WR)\n\n");
        return codeBuilder.toString();
    }

    private String generateStruct(BaseTree t) {

        return "";
    }
    private String generateOperation(BaseTree t2) throws Exception {
        if (!Arrays.asList(op).contains(t2.getText())) { //Si ce n'est pas une opération
            return generateValue(t2);
        } else {
            switch (t2.getText()) {
                case "+":
                    return generateAddition(t2);
                case "-":
                    return generateSubstraction(t2);
                case "*":
                    return generateMultiplication(t2);
                case "/":
                    return generateDivision(t2);
                case ">":
                    return generateGreater(t2);
                case "<":
                    return generateLower(t2);
                case ">=":
                    return generateGreaterOrEqual(t2);
                case "<=":
                    return generateLowerOrEqual(t2);
                case "==":
                    return generateEqual(t2);
                case "!=":
                    return generateNotEqual(t2);
                case "!":
                    return generateNo(t2);
                case "&":
                    return generateAddress(t2);
                case "&&":
                    return generateAndBool(t2);
                case "||":
                    return generateOrBool(t2);
                case "UNISUB":
                    return generateUniSub(t2);
                case "UNISTAR":
                    return generateUniStar(t2);
                default:
                    throw new Exception("Opération non gérée !");
            }

        }
    }

    private String generateValue(BaseTree t2) throws Exception {
        return "";
    }


    private String generateEqual(BaseTree t2) throws Exception {
        return "";
    }

    private String generateNotEqual(BaseTree t2) throws Exception {
        return "";
    }

    private String generateGreaterOrEqual(BaseTree t2) throws Exception {
        return "";
    }

    private String generateLowerOrEqual(BaseTree t2) throws Exception {
        return "";
    }

    private String generateGreater(BaseTree t2) throws Exception {
        return "";
    }


    private String generateLower(BaseTree t2) throws Exception {
        return "";
    }

    private String generateAddition(BaseTree t2) throws Exception {
        return "";
    }

    private String generateSubstraction(BaseTree t2) throws Exception {
        return "";
    }

    private String generateMultiplication(BaseTree t2) throws Exception {
        return "";
    }

    private String generateDivision(BaseTree t2) throws Exception {
        return "";
    }

    private String generateNo(BaseTree t2) throws Exception {
        return "";
    }

    private String generateAddress(BaseTree t2) throws Exception {
        return "";
    }

    private String generateUniSub(BaseTree t2) throws Exception {
        return "";
    }

    private String generateUniStar(BaseTree t2) throws Exception {
        return "";
    }

    private String generateAndBool(BaseTree t2) throws Exception {
        return "";
    }

    private String generateOrBool(BaseTree t2) throws Exception {
        return "";
    }


}