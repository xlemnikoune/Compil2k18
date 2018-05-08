import java.util.Objects;

/**
 * Implement a type. Composed mainly of a single String
 * @author Frosqh
 */
public class Type {

    /**
     * Name of this type.
     * @see #getName()
     */
    private String name;

    public Type(String type){
        name=type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(name, type.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    /**
     * Check if type is a structure or a "raw type".
     * @return 'true' if this type is raw, 'false' otherwise
     */
    boolean isRaw(){
        if (name.equals("i32") || name.equals("bool") || name.equals("&i32") || name.equals("&bool")){
            return true;
        } else {
            if (name.startsWith("vec ")){
                Type type = new Type(name.split(" ", 2)[1]);
                if (type.isRaw()){
                    return true;
                } else {
                    try {
                        MiniRustCompiler.tds.currentScope.checkType(type,-1,-1);
                    } catch (SemanticException e) {
                        return false;
                    }
                    return true;
                }
            }
            if (name.startsWith(("&"))) {
                return new Type(name.substring(1)).isRaw();
            }
        }
        return false;
    }

    /**
     * @return Name of this type
     * @see Type#name
     */
    public String getName(){
        return name;
    }

    /**
     * Check if this type is equivalent to parameter.
     * @param type Type to be tested
     * @return 'true' if the two types are the same, 'false' otherwise
     */
    public boolean is(String type) {
        return name.equals(type);
    }

    @Override
    public String toString(){
        return name;
    }
}
