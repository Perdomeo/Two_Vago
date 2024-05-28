package exeptions;

/**
 *
 * @author arper
 */
public class CodeExistingExp extends Exception{

    public CodeExistingExp() {
        super("Este codigo ya existe");
    }
    
}
