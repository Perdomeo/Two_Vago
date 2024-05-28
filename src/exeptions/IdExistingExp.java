package exeptions;

/**
 *
 * @author arper
 */
public class IdExistingExp extends Exception{

    public IdExistingExp() {
        super("Este id ya se encuentra registrado");
    }
    
}
