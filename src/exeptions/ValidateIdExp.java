package exeptions;

/**
 *
 * @author arper
 */
public class ValidateIdExp extends RuntimeException{

    public ValidateIdExp() {
        super ("El id ingresado no es valido");
    }
    
}
