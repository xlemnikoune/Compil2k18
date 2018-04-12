/**
 * Exception thrown when a semantic control fails.
 * @author Frosqh
 */
public class SemanticException extends Exception{

    private int line;
    private int column;
    /**
     * @param message Message to be shown
     */
    public SemanticException(String message){
        super(message);
        line=-1;
        column=-1;
    }

    /**
     * @param message Message to be shown
     * @param lin Line where the crash occurs
     * @param colum Column where the crash occurs
     */
    public SemanticException(String message, int lin, int colum){
        super(message);
        line=lin;
        column=colum;
    }

    /**
     * @return Column where the crash occurs
     */
    public int getColumn() {
        return column;
    }

    /**
     * @return Line where the crash occurs
     */
    public int getLine() {
        return line;
    }
}
