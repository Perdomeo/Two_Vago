package exeptions;

/**
 *
 * @author arper
 */
public class EmailExistingExp extends Exception{

    public EmailExistingExp() {
        super ("Este correo ya se encuentra registrado");
    }
    
}
