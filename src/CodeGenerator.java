import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeGenerator{
    //TODO Optimize call to R5 -> if not already done for operation (and in print :p)
    private Scope sc;
    private String code;
    private final String outputFile;
    //private int scounter = 0;
    private int WhileCount = 0;
    private int ifCount = 0;
    private int d =-2;
    private boolean isPrint = false;
    private boolean isR5Done = false;
    private final String[] op = {"+", "-", "*","/", ">", "<", "<=", "==", ">=", "!=","UNISUB","UNISTAR","!","&","&&","||",};
    private int scounter = 0;

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

    void save() throws Exception {
        File out = new File(outputFile);
        BufferedWriter s;
        try {
            s = new BufferedWriter(new FileWriter(out));
        } catch (IOException e) {
            throw new Exception("You can't write on file" + outputFile);
        }
        code+="run LDW R0,#1\n\n";
        code+="JEA (WR)\n\n";
        code+="TRUE string \"true\"\n\n";
        code+="FALSE string \"false\"\n\n";
        code+="print_\n\n"; //Va peut-être falloir commenter ce truc obscur
        //code+="SUB SP,R0,SP\n";
        code+="STW BP,-(SP)\n";
        code+="LDW BP, SP\n";
        code+=  "    STW R0,-(SP)\n"+
                "    LDW R6,#0\n" +
                "    STB R6,-(SP)\n" +
                "    LDW R4, #0\n" +
                "    CMP R5,R4\n" +
                "    JEQ #ent-$-2\n" +
                "    LDW R4, #2\n" +
                "    CMP R5,R4\n" +
                "    JEQ #str-$-2\n" +
                "    LDW R4, #3\n" +
                "    CMP R5, R4\n"+
                "    JEQ #CRLF-$-2\n" +
                "    CMP R0,R4\n" +
                "    JEQ #false-$-2\n" +
                "    LDW R0,#TRUE\n" +
                "    TRP #WRITE_EXC\n" +
                "    JMP #fin-$-2\n" +
                "    false\n" +
                "    LDW R0,#FALSE\n" +
                "    TRP #WRITE_EXC\n" +
                "    JMP #fin-$-2\n" +
                "    str \n"+
                "    JMP #fin_str-$-2\n"+
                "    CRLF \n"+
                "    LDW R6,#0x000a\n" +
                "    STB R6,-(SP)\n" +
                "    JMP #fin-$-2\n"+
                "    ent\n" +
                "    CMP R0,R4\n" +
                "    JNE #nonzero-$-2\n" +
                "    LDW R6,#0x0030\n" +
                "    STB R6,-(SP)\n" +
                "    JMP #fin-$-2\n" +
                "    nonzero\n" +
                "    CMP R0,R4\n" +
                "    JGE #finsigne-$-2\n" +
                "    LDW R4,#1\n" +
                "    NEG R0,R0\n" +
                "    finsigne\n" +
                "    LDW R7,R0\n" +
                "    boucle\n" +
                "    LDW R0,R7\n" +
                "    LDW R6,#0\n" +
                "    CMP R0,R6\n" +
                "    JEQ #finboucle-$-2\n" +
                "    LDW R6,#10\n" +
                "    DIV R0,R6,R6\n" +
                "    STW R6,R7\n" +
                "    LDW R6,#0x0030\n" +
                "    ADD R6,R0,R6\n" +
                "    STB R6,-(SP)\n" +
                "    JMP #boucle-$-2\n" +
                "    finboucle\n" +
                "    LDW R6,#1\n" +
                "    CMP R4,R6\n" +
                "    JNE #fin-$-2\n" +
                "    LDW R0,#0x002d\n" +
                "    STB R0,-(SP)\n" +
                "    JMP #fin-$-2\n"+
                "    fin_str \n"+
                "    TRP#WRITE_EXC\n"+
                "    fin\n" +
                "    LDW R0,SP\n" +
                "    TRP #WRITE_EXC\n" +
                "    LDW R0,(SP)+\n" +
                "    LDW SP,BP\n"+
                "    LDW BP, (SP)+\n"+
                //"    ADD SP,R0,SP\n"+
                "    JEA (WR)\n\n";

        s.write(code);
        s.close();
    }

    private String genR5(int mode){
        if (isPrint)
            if (!isR5Done)
                return "LDW R5,#"+mode+"\n\n";
            else
                isR5Done=true;
        return "";
    }

    void generate(CommonTree t){
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
        } else {
            StringBuilder codeBuilder = new StringBuilder();
            codeBuilder.append(t.getChild(0).getText()).append("_ ");
            codeBuilder.append(ChangeScope(t.getChild(0).getText()));
            for (BaseTree t2 : (List<BaseTree>) t.getChildren()) {
                if (t2.getText().equals("BLOCK")) {
                    codeBuilder.append(generateBlock((BaseTree) t2));
                }
            }

            codeBuilder.append(goBack(t.getChild(0).getText()));
            codeBuilder.append("LDW WR, (SP)+\n\n");
            codeBuilder.append("JEA (WR)\n\n");
            return codeBuilder.toString();
        }
    }

    private String generatePrint(BaseTree t){
        isPrint=true;
        String s = "";
        for (BaseTree t2 : (List<BaseTree>) t.getChildren()){
            isR5Done = false;
            s +=  genExpr(t2) +
                    "MPC WR \n\n" + "ADQ 6,WR\n\n" +
                    "JMP #print_-$-2\n\n";
        }
        s += "LDW R5, #3\n\n" +
                "MPC WR \n\n" + "ADQ 6,WR\n\n" +
                "JMP #print_-$-2\n\n";
        isPrint = false;
        return s;
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
            case "=":
                codeBuilder.append(generateAffect(t));
                break;
            default:
                codeBuilder.append(generateOperation(t));
                break;
        }
        return codeBuilder.toString();
    }

    private String genVec(BaseTree t) {
        return "";
    }

    private String genMain(BaseTree t) {

        String s ="main_ LDW SP, #STACK_ADRS\n\n" +
                "LDQ NIL,BP\n\n"+
                ChangeScope("--/.-/../-.////");
        s+=
                generateBlock(t) +
                goBack("--/.-/../-.////")+
                "LDW WR, #EXIT_EXC\n\n" +
                "TRP WR\n\n" +
                "LDW WR, #main_\n\n" +
                "JEA (WR)\n\n";
        return s;
    }

    private String generateBlock (BaseTree t) {
        StringBuilder codeBuilder = new StringBuilder();
        for (BaseTree t2 : (List<BaseTree>) t.getChildren()){
            codeBuilder.append(generateInstr(t2));
        }
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
        if (t2.getChildCount()>0){
            return genCall(t2);
        }
        String s = t2.getText();
        if (isInteger(s)){
            return "LDW R0, #"+Integer.parseInt(s)+"\n\n"+genR5(0);
        } else {
            if (s.equals("true")) return "LDW R0,#1\n\n"+genR5(1);
            else {
                if (s.equals("false")) return "LDW R0,#0\n\n"+genR5(1);
            }
            if (s.matches("\"(\\S| )*\"")) {
                scounter++;
                return "STR"+scounter+" string "+s+"\n\n"+genR5(2)+"LDW R0, #STR"+scounter+"\n\n";
            }

            return "LDW R0, (BP)"+getDeplacement(s)+"\n\n"+genR5(getType(s));
        }
    }

    private int getType(String s) {
        try {
            String t = sc.find(s).get(1);
            switch (t){
                case "i32":
                    return 0;
                case "bool":
                    return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private String genCall(BaseTree t2) {
        String code = "";
        String v = t2.getText();
        t2 = (BaseTree) t2.getChild(0);
        System.out.println(t2.getText());
        List<BaseTree> l = (List<BaseTree>) t2.getChildren();
        if (l != null) {
            for (int i = l.size() - 1; i >= 0; i--) {
                BaseTree t = l.get(i);
                code += genExpr(t);
                code += "STW R0, -(SP)\n\n";
                String s = t.getText();
                if (!isInteger(s) && !s.equals("true") && !s.equals("false")) {
                    try {
                        if (sc.find(t.getText()).get(1).equals("i32")) {
                            code += "ADQ -2,SP\n\n";
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        code+="LDW R0, #"+v+"_\n\n";
        code+="MPC WR\n\n";
        code+="ADQ 6, WR\n\n";
        code+="STW WR, -(SP)\n\n";
        code+="JEA (R0)\n\n";
        return code;
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
        return ("MPC WR \n\n" + "ADQ 10,WR\n\n") +
                "CMP R1, R0\n\n"+
                jump + " #run-$-2\n\n" +
                "LDW R0, #0\n\n"+
                genR5(1);
    }

// pour le moment toutes les comparaisons sont les mêmes, mais il faut faire des jumps à la fin donc ça sera plus les mêmes :)
    private String generateEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JEQ");
    }

    private String generateNotEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JNE");
    }

    private String generateGreaterOrEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JGE");
    }

    private String generateLowerOrEqual(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JLE");
    }

    private String generateGreater(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JGT");
    }


    private String generateLower(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                generOpBool("JLW");
    }

    private String generateAddition(BaseTree t2){
        BaseTree leftSide = (BaseTree) t2.getChild(0);
        BaseTree rightSide = (BaseTree) t2.getChild(1);
        return generateOperation(leftSide) +
                "STW R0, -(SP)\n\n" +
                generateOperation(rightSide) +
                "LDW R1, (SP)+\n\n" + "ADD R1, R0, R0\n\n"+genR5(0);
    }

    private String generateSubstraction(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" + "SUB R1, R0, R0\n\n"+genR5(0);
    }

    private String generateMultiplication(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" + "MUL R1, R0, R0\n\n"+genR5(0);
    }

    private String generateDivision(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" + "DIV R1,R0,R0\n\n"+genR5(0);
    }

    private String generateNo(BaseTree t2){
        BaseTree Value = (BaseTree) t2.getChild(0);
        return generateOperation(Value) + //Calcul de op1
                "NOT R0,R0\n\n"+genR5(1);
    }

    private String generateAddress(BaseTree t2){
        return "";
    }

    private String generateUniSub(BaseTree t2){
        BaseTree Value = (BaseTree) t2.getChild(0);
        return generateOperation(Value) + //Calcul de op1
                "NEG R0,R0\n\n"+genR5(0);
    }

    private String generateUniStar(BaseTree t2){
        return "";
    }

    private String generateAndBool(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                "AND R0,R1,R0 \n\n"+genR5(1);
    }

    private String generateOrBool(BaseTree t2){
        BaseTree left = (BaseTree) t2.getChild(0);
        BaseTree right = (BaseTree) t2.getChild(1);
        return generateOperation(left) +
                "STW R0, -(SP)\n\n" +
                generateOperation(right) +
                "LDW R1, (SP)+\n\n" +
                "OR R0,R1,R0\n\n"+genR5(1);
    }

    private String generateInstr(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        switch (t.getText()){
            case "print":
                codeBuilder.append(generatePrint(t));
                break;
            case "if":
                codeBuilder.append(generateIf(t));
                break;
            case "while":
                codeBuilder.append(generateWhile(t));
                break;
            case "let":
                if (t.getChild(0).getText().equals("mut"))
                    codeBuilder.append(generateAffect((BaseTree) t.getChild(1)));
                else
                    codeBuilder.append(generateAffect((BaseTree) t.getChild(0)));
                break;
            case "return":
                codeBuilder.append(genExpr((BaseTree) t.getChild(0)));
                codeBuilder.append(goBack(sc.getName(),false));
                codeBuilder.append("LDW WR, (SP)+\n\n");
                codeBuilder.append("JEA (WR)\n\n");

                break;
            default:
                codeBuilder.append(genExpr((BaseTree) t));
                break;


        }
        return codeBuilder.toString();
    }

    private String goBack(String name, boolean b) {
        boolean b2 = false;
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("//Quidditch "+name+"\n\n");

        int dep= 0;
        for (String i : sc.getTable().keySet()) {
            if (!sc.getTable().get(i).get(0).equals("function") && !sc.getTable().get(i).get(0).equals("param")) {
                String type = sc.getTable().get(i).get(1);
                if (type.equals("i32")) {
                    dep += 4;
                } else {
                    if (type.equals("bool")) {
                        dep += 2;
                    } else {
                        if (type.startsWith("vec ")) {
                            //int a =vecCoun.get(0);
                            //vecCoun.remove(vecCoun.get(0));
                            //return a*getDeplacement(type.split(" ",2)[1], vecCoun);
                            dep += 2;
                        } else {
                            dep += 2;
                        }
                    }
                }
            }
        }

        if (b) {
            d -= dep + 2;
            sc = sc.getAncestor();
        }
        codeBuilder.append("LDW SP,BP\n\n");
        codeBuilder.append("ADQ " + dep + ", SP\n\n");

        codeBuilder.append("LDW BP,(SP)+\n\n");
        codeBuilder.append("//Not in aymore :(\n");
        return codeBuilder.toString();
    }

    private String generateIf(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        Tree bool = t.getChild(0);
        BaseTree then = (BaseTree) t.getChild(1);
        codeBuilder.append(generateOperation((BaseTree) bool));
        int ic = ++ifCount;
        String labelIf = "if"+ic;
        codeBuilder.append("LDW R1, #0\n\n");
        codeBuilder.append("CMP R0,R1\n\n");
        codeBuilder.append("JEQ ").append("#").append(labelIf).append("-$-2\n\n");
        codeBuilder.append(ChangeScope(labelIf));
        codeBuilder.append(generateBlock(then));
        codeBuilder.append(goBack(labelIf));
        if (t.getChildCount() > 2) {
            codeBuilder.append("JMP #else").append(ic).append("-$-2\n\n");
            codeBuilder.append(labelIf).append("\n\n");
            codeBuilder.append(ChangeScope("else"+ic));
            //System.out.println(sc.getName());
            BaseTree elseT = (BaseTree) t.getChild(2).getChild(0);
            codeBuilder.append(generateBlock(elseT));
            codeBuilder.append(goBack("else"+ic));
            codeBuilder.append("else").append(ic).append("\n\n");
        } else {
            codeBuilder.append(labelIf).append("\n\n");
        }
        return codeBuilder.toString();
    }

    private int getDeplacement(String text) {
        ArrayList<String> l = null;
        try {
            l = sc.find(text);
            if (l.get(0).equals("param")) {
                String type = l.get(1);
                int dep = 2+Integer.valueOf(l.get(2));
                if (type.equals("i32")){
                    dep+=4;
                } else {
                    if (type.equals("bool")){
                        dep+=2;
                    } else {
                        if (type.startsWith("vec ")){
                            //int a =vecCoun.get(0);
                            //vecCoun.remove(vecCoun.get(0));
                            //return a*getDeplacement(type.split(" ",2)[1], vecCoun);
                            dep+=2;
                        } else {
                            dep+=2;
                        }
                    }
                }
                return dep;
            }
            return Integer.valueOf(l.get(2))+d;
        } catch (Exception e) {
            System.out.println(text);
            System.out.println(sc.getName());
            System.err.println("Error ancestor");
            System.exit(-1);
        }
        return "Should not happen".hashCode();
    }

    private String generateWhile(BaseTree t) {
        StringBuilder codeBuilder = new StringBuilder();
        int c = ++WhileCount;
        codeBuilder.append(ChangeScope("while"+c));
        codeBuilder.append("While").append(c).append("\n\n");
        BaseTree Bool = (BaseTree) t.getChild(0);
        BaseTree Block = (BaseTree) t.getChild(1);
        codeBuilder.append(generateOperation(Bool));
        codeBuilder.append("LDW R1,#0\n\n");
        codeBuilder.append("CMP R0,R1\n\n");
        codeBuilder.append("JEQ #EndWhile").append(c).append("-$-2\n\n");
        codeBuilder.append(generateBlock(Block));
        codeBuilder.append("JMP #While").append(c).append("-$-2\n\n");
        codeBuilder.append("EndWhile").append(c).append("\n\n");
        codeBuilder.append(goBack("while"+c));
        return codeBuilder.toString();
    }

    private String ChangeScope(String nom) {
        boolean b = false;
        if (nom.equals("--/.-/../-.////")){
             b = true;
            nom = "General";
        }
        ArrayList<Scope> scopes = sc.getScopeList();

        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append("//Entering "+nom+"\n\n");
        for (Scope s : scopes) { ;
            if (s.getName().equals(nom)) {
                sc = s;
                break;
            }
        }
        if (b){
            for (Scope s : sc.getScopeList()){
                if (s.getName().equals("main")){
                    sc = s;
                }
            }
        }

        codeBuilder.append("STW BP, -(SP)\n\n");
        int dep= 0;
        for (String i : sc.getTable().keySet()) {
            if (!sc.getTable().get(i).get(0).equals("function") && !sc.getTable().get(i).get(0).equals("param")) {
                String type = sc.getTable().get(i).get(1);
                if (type.equals("i32")) {
                    dep += 4;
                } else {
                    if (type.equals("bool")) {
                        dep += 2;
                    } else {
                        if (type.startsWith("vec ")) {
                            //int a =vecCoun.get(0);
                            //vecCoun.remove(vecCoun.get(0));
                            //return a*getDeplacement(type.split(" ",2)[1], vecCoun);
                            dep += 2;
                        } else {
                            if (!type.equals("function"))
                                dep += 2;
                        }
                    }
                }
            }
        }
        d+=dep+2;
        codeBuilder.append("ADQ -" + dep + ", SP\n\n");
        codeBuilder.append("LDW BP, SP\n\n");
        codeBuilder.append("//We're in !\n");
        return codeBuilder.toString();
    }

    private String goBack(String nom) {
        return goBack(nom,true);
    }

    private String generateAffect(BaseTree t){
        StringBuilder codeBuilder = new StringBuilder();
        Tree t1 = t.getChild(0);
        Tree t2 = t.getChild(1);
        String expr = genExpr((BaseTree) t2);
        int deplacement = 0;
        deplacement = getDeplacement(t1.getText());
        codeBuilder.append(expr);
        codeBuilder.append("STW R0, (BP)"+deplacement+"\n\n");
        return codeBuilder.toString();

    }

}