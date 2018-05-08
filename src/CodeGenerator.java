import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator{

    private Scope sc;
    private String code;
    private final String outputFile;
    private int scounter = 0;
    private int ifCount = 0;
    final String[] op = {"+", "-", "*", ">", "<", "<=", "==", ">=", "!=","UNISUB","UNISTAR","!","&","&&","||",};

    public CodeGenerator(String output, Scope currentScope) {

        outputFile = output;
        sc = currentScope;
        code = ""; //Initialiser le code assembleur ici
        code += "EXIT_EXC EQU 64\n\n";
        code += "WRITE_EXC EQU 66\n\n";
        code += "STACK_ADRS EQU 0X1000\n\n";
        code += "LOAD_ADRS EQU 0XF000\n\n";
        code += "NIL EQU 0\n\n";
        code += "SP EQU R15\n\n";
        code += "WR EQU R14\n\n";
        code += "BP EQU R13\n\n";
        code += "ORG LOAD_ADRS\n\n";
        code += "start main_\n\n";
    }

    public void save() throws Exception {
        File out = new File(outputFile);
        BufferedWriter s;
        try {
            s = new BufferedWriter(new FileWriter(out));
        } catch (IOException e) {
            throw new Exception("You can't write on file" + outputFile);
        }
        code+="run LDW R0,#1\n\n";
        code+="JEA (WR)\n\n";
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
        codeBuilder.append("TRP R0\n\n");
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
                codeBuilder.append(generateOperation(t));
        }
        return codeBuilder.toString();
    }

    private String genVec(BaseTree t) {
        return "";
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
        codeBuilder.append("LDW WR, #main_\n\n");
        codeBuilder.append("JEA (WR)\n\n");
        return codeBuilder.toString();
    }

    private String generateStruct(BaseTree t) {

        return "";
    }
    private String generateOperation(BaseTree t2) {
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
                    System.err.println("Opération non gérée !");
            }

        }
        return "";
    }

    private String generateValue(BaseTree t2){
        String s = t2.getText();
        if (isInteger(s)){
            return "LDW R0, #"+Integer.parseInt(s)+"\n\n";
        } else {
            if (s.equals("true")) return "LDW R0,#1\n\n";
            else {
                if (s.equals("false")) return "LDW R0,#0\n\n";
            }

        }
        return "";
    }

    private static boolean isInteger(String s){
        if (s.isEmpty()) return false;
        for (int i = 0; i<s.length(); i++){
            if (i==0 && s.charAt(i) == '-'){
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i),10)<0) return false;
        }
        return true;
    }

    private String generOpBool(String jump){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("MPC WR \n\n"+"ADQ 10,WR\n\n");
        codeBuilder.append("CMP R1, R0\n\n");
        codeBuilder.append(jump+" #run-$-2\n\n");
        codeBuilder.append("LDW R0, #0\n\n");
        return codeBuilder.toString();
    }

// pour le moment toutes les comparaisons sont les mêmes, mais il faut faire des jumps à la fin donc ça sera plus les mêmes :)
    private String generateEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JEQ"));
        return codeBuilder.toString();
    }

    private String generateNotEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JNE"));
        return codeBuilder.toString();
    }

    private String generateGreaterOrEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JGE"));
        return codeBuilder.toString();
    }

    private String generateLowerOrEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JLE"));
        return codeBuilder.toString();
    }

    private String generateGreater(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JGT"));
        return codeBuilder.toString();
    }


    private String generateLower(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append(generOpBool("JLW"));
        return codeBuilder.toString();
    }

    private String generateAddition(BaseTree t2){
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(leftSide));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(rightSide));
        codeBuilder.append("LDW R1, -(SP)\n\n" + "ADD R1, R0, R0\n\n");
        return codeBuilder.toString();
    }

    private String generateSubstraction(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n" + "SUB R1, R0, R0\n\n");
        return codeBuilder.toString();
    }

    private String generateMultiplication(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n" + "MUL R1, R0, R0\n\n");
        return codeBuilder.toString();
    }

    private String generateDivision(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n" + "DIV R1,R0,R0\n\n");
        return codeBuilder.toString();
    }

    private String generateNo(BaseTree t2){
        BaseTree Value = (BaseTree) t2.getChild(0);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(Value)); //Calcul de op1
        codeBuilder.append("NOT R0,R0\n\n");
        return codeBuilder.toString();
    }

    private String generateAddress(BaseTree t2){
        return "";
    }

    private String generateUniSub(BaseTree t2){
        BaseTree Value = (BaseTree) t2.getChild(0);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(Value)); //Calcul de op1
        codeBuilder.append("NEG R0,R0\n\n");
        return codeBuilder.toString();
    }

    private String generateUniStar(BaseTree t2){
        return "";
    }

    private String generateAndBool(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append("AND R0,R1,R0 \n\n");
        return codeBuilder.toString();
    }

    private String generateOrBool(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(generateOperation(left));
        codeBuilder.append("STW R0, (SP)+\n\n");
        codeBuilder.append(generateOperation(right));
        codeBuilder.append("LDW R1, -(SP)\n\n");
        codeBuilder.append("OR R0,R1,R0\n\n");
       return codeBuilder.toString();
    }

    private String generateInstr(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        switch (t.getText()){
            case "print":
                codeBuilder.append(generatePrint(t));
                break;
        }
        return codeBuilder.toString();
    }

    private String generateIf(BaseTree t) throws Exception{
        StringBuilder codeBuilder = new StringBuilder();
        Tree bool = t.getChild(0);
        BaseTree then = (BaseTree) t.getChild(1);
        codeBuilder.append(generateOperation((BaseTree) bool));
        int ic = ifCount++;
        codeBuilder.append("LDW R1, #0\n\n");
        codeBuilder.append("CMP R0,R1\n\n");
        String labelIf = "if"+ic;
        codeBuilder.append("JEQ ").append("#").append(labelIf+"-$-2\n\n");

        codeBuilder.append(generateBlock(then));

        if (t.getChildCount() > 2) {
            codeBuilder.append("JMP #else").append(ic).append("-$-2\n\n");
            codeBuilder.append(labelIf).append("\n\n");
            BaseTree elseT = (BaseTree) t.getChild(2);
            List<BaseTree> l2 = (List<BaseTree>) elseT.getChildren();
            codeBuilder.append(generateBlock(elseT));
            codeBuilder.append("else").append(ic).append("\n\n");
        } else {
            codeBuilder.append(labelIf).append("\n\n");
        }
        return codeBuilder.toString();
    }

    private int getDeplacement(String text) throws Exception {
        ArrayList<String> l = sc.find(text);
        return Integer.valueOf(l.get(2));
    }


}