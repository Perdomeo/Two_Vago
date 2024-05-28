package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidateCode {
    
    public boolean validateCode (int code){      
        // Regular expression to validate an identification number (cedula) with exactly 13 digits
        String regex = "\\d+";      
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);     
        // Create a Matcher for the given cedula
        Matcher matcher = pattern.matcher(String.valueOf(code));     
        // Check if the cedula matches the pattern
        return matcher.matches();
    }
}
