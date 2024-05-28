package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arper
 */
public class ValidatePhoneNumber {
    
    public boolean validatePhoneNumbers(String phoneNumber) {
        // Regular expression to match exactly 10 digits
        String regex = "^\\d{10}$";
        
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher for the given phone number
        Matcher matcher = pattern.matcher(String.valueOf(phoneNumber));
        
        // Check if the phone number matches the pattern and is not negative
        return matcher.matches();
    }
}
