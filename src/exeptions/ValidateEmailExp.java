package exeptions;

/**
 *
 * @author arper
 */
public class ValidateEmailExp extends RuntimeException{

    public ValidateEmailExp() {
        super("El correo ingresado no es valido");
    }
    
}
