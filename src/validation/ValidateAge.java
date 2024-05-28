package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidateAge {
    
    public static boolean isValidAge(String age) {
        // Regular expression to validate if the string represents an age between 18 and 110 years
        String regex = "^(1[8-9]|[2-9][0-9]|1[0-0][0-9]|110)$";
        
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object for the given age
        Matcher matcher = pattern.matcher(age);
        
        // Check if the age matches the pattern
        return matcher.matches();
    }

}
