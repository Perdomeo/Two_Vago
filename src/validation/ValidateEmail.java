package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidateEmail {
        
    public boolean validateEmail(String email) {
        // Regular expression to validate emails
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object for the given email
        Matcher matcher = pattern.matcher(email);
        
        // Check if the email matches the pattern
        return matcher.matches();
    }
}
