import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scope {

    public Scope ancestor;
    public String origin;
    private String name;
    private int deplacement;
    private ArrayList<Scope> innerScopeList = new ArrayList<>();
    private HashMap<String, ArrayList<String>> table;
    private HashMap<String, Scope> secondTable;

    public Scope (String id, Scope anc, String string){
        if (anc != null){
            deplacement = anc.getDeplacement();
        }
        table = new HashMap<>();
        secondTable = new HashMap<>();
        origin = id;
        ancestor = anc;
        name = string;
    }

    public Scope(String id){
        this(id, null, null);
        deplacement = 2;
    }

    public int getDeplacement() {
        return deplacement;
    }

    public String getOrigin() {
        return origin;
    }

    public Scope getAncestor() {
        return ancestor;
    }

    public String toString(int tab){
        if (table.isEmpty()){
            return null;
        }
        StringBuilder tabu = new StringBuilder();
        for (int i =0 ; i< tab; i++){
            tabu.append("    ");
        }
        StringBuilder s = new StringBuilder(tabu.substring(0, tabu.length() - 4) + "Scope " + name + "\n");
        for (String k : table.keySet()){
            s.append(tabu).append(k).append(" : ").append(table.get(k)).append("\n");
        }
        if (secondTable != null){
            for (String k : secondTable.keySet()){
                String temp = secondTable.get(k).toString(tab+1);
                if (temp != null){
                    s.append(temp).append("\n");
                }
            }
        }
        if(innerScopeList != null){
            for (Scope sc : innerScopeList){
                String temp =sc.toString(tab+1);
                if (temp != null){
                    s.append(temp).append("\n");
                }
            }
        }
        return s.toString();
    }

    public void add(String string, List<BaseTree> children) throws Exception {
        boolean isMut = false;
        String type = null;
        int index = 0;
        if (children.get(index).getText().equals("mut")){
            isMut = true;
            index++;
        }
        if (children.get(index).getText().equals("i32") || children.get(index).getText().equals("bool")){
            type = children.get(index).getText();
            index++;
        }
        if (children.get(index).getText().equals("=")){
            List<BaseTree> childrens = (List<BaseTree>) children.get(index).getChildren();
            String name = childrens.get(0).getText();
            if (!isIn(name)){
                if (isInAncestor(name)) {
                    System.out.println("Warning : \"Var name surcharged : " + name + "\" at " + children.get(0).getLine() + ":" + children.get(0).getCharPositionInLine());
                }
                if (childrens.get(1).getChildCount()>0 && childrens.get(1).getChild(0).getText()=="NEW"){
                    type = childrens.get(1).getText();
                    checkType(type);
                }
                if (type == null){
                    type = "i32";
                }
                int deplacement = 0;
                if (type.equals("i32")){
                    deplacement = this.deplacement;
                    this.deplacement += 4;
                } else {
                    if (type.equals("bool")){
                        deplacement = this.deplacement;
                        this.deplacement += 1;
                    }
                }
                ArrayList<String> param = new ArrayList<>();
                param.add(string);
                param.add(type);
                param.add(String.valueOf(deplacement));
                param.add(String.valueOf(isMut));

                table.put(name,param);
                MiniRustCompiler.tds.getListe().put(name,"var");
            } else {
                throw new Exception("Var name already used : " + name);
            }
        } else {
            System.err.println("WTF");
        }
    }

    public void addVar(String s, Tree child) throws Exception {
        String name = child.toString();
        String type = null;
        if (child.getChild(0).toString().equals("i32") || child.getChild(0).toString().equals("bool")){
            type = child.getChild(0).toString();
        }
        if (child.getChild(0).getChildCount()>0 && child.getChild(0).getChild(0).getText() == "NEW"){
            type=child.getChild(0).toString();
            checkType(type);
        }
        if (type == null){
            type = "i32";
        }
        int deplacement = 0;
        if (type.equals("i32")){
            deplacement = this.deplacement;
            this.deplacement += 4;
        } else {
            if (type.equals("bool")){
                deplacement = this.deplacement;
                this.deplacement += 1;
            }
        }
        ArrayList<String> param = new ArrayList<>();
        param.add(s);
        param.add(type);
        param.add(String.valueOf(deplacement));
        table.put(name,param);
        MiniRustCompiler.tds.getListe().put(name,"param");

    }

    public void addFunction(String s, Tree child) throws Exception {
        String name = child.getChild(0).toString();
        if (!isIn(name)){
            String returnType = null;
            if (child.getChildCount() > 1 ){
                if (child.getChild(1).toString().equals("->")){
                    returnType=child.getChild(1).getChild(0).toString();
                }
            }
            if (returnType == null){
                returnType="Void";
            }
            ArrayList<String> param = new ArrayList<>();
            param.add(s);
            param.add(returnType);
            table.put(name,param);
            MiniRustCompiler.tds.getListe().put(name,"function");
        } else {
            throw new Exception("Function name already used");
        }
    }

    private void checkType(String tempType) throws Exception {
        if (isIn(tempType)){
            if (!table.get(tempType).get(0).equals("struct")){
                throw new Exception(tempType + "is not a struct");
            }
        } else {
            if (isInAncestor(tempType)){
                if (!getFromAncestor(tempType).get(0).equals("struct")){
                    throw new Exception(tempType + "is not a struct");
                }
            } else {
                throw new Exception(tempType + "is not a struct");
            }
        }
    }

    private ArrayList<String> getFromAncestor(String tempType) throws Exception {
        if (!isInAncestor(tempType)) {
            throw new Exception(tempType + "is not in ancestor");
        } else {
            if (getAncestor().isIn(tempType)){
                return getAncestor().getTable().get(tempType);
            } else{
                return getAncestor().getFromAncestor(tempType);
            }
        }
    }

    private boolean isInAncestor(String tempType) {
        return false;
    }

    private boolean isIn(String tempType) {
        return false;
    }


    public HashMap<String,ArrayList<String>> getTable() {
        return table;
    }

    public void addScopeNotInner(String s, Scope temp) {
        secondTable.put(s, temp);
    }
}
