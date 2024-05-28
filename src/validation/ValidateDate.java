package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidateDate {
    
    public boolean validateDate (String date){      
        // Regular expression to validate an identification number (cedula) with exactly 13 digits
        String regex = "\\d{4}/\\d{2}/\\d{2}";      
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);     
        // Create a Matcher for the given cedula
        Matcher matcher = pattern.matcher(date);     
        // Check if the cedula matches the pattern
        return matcher.matches();
    }
}
