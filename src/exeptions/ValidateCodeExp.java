package exeptions;

/**
 *
 * @author arper
 */
public class ValidateCodeExp extends RuntimeException{

    public ValidateCodeExp() {
        super("El codigo ingresado no es valido");
    }
    
}
