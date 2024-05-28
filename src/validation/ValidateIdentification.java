package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidateIdentification {
        
    public boolean validateIdentification (long Identification ) {
        // Regular expression to validate an identification number (cedula) with exactly 13 digits
        String regex = "^\\d{7,10}$";       
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);       
        // Create a Matcher for the given cedula
        Matcher matcher = pattern.matcher(String.valueOf(Identification ));
        // Check if the cedula matches the patter
        return matcher.matches();
    }
}
