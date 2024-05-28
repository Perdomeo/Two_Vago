package exeptions;

/**
 *
 * @author arper
 */
public class ValidatePhoneExp extends RuntimeException{

    public ValidatePhoneExp() {
        super("El telefono ingresado no es valido");
    }
    
}
