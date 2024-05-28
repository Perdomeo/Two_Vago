package exeptions;

/**
 *
 * @author arper
 */
public class ValidateDateExp extends RuntimeException{

    public ValidateDateExp() {
        super ("La fecha ingresada no es valida (YYYY/dd/mm");
    }
    
}
