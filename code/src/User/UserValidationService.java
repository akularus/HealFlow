/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.regex.Pattern;

/**
 *
 * @author srivarinimandali
 */
public class UserValidationService {
    // Example pattern: Username must start with a letter and be between 3 and 15 characters long.
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[A-Za-z][A-Za-z0-9_.]{2,14}$");
        // Example pattern: Password must be at least 8 characters long and include a number and a special character.
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*.]).{8,}$");    
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile(".*[A-Z].*");
    private static final Pattern NUMBER_PATTERN = Pattern.compile(".*[0-9].*");
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile(".*[!@#$%^&*.].*");
    private static final Pattern PASSWORD_LENGTH_PATTERN = Pattern.compile(".{8,}");

    
    public boolean isValidUsername(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    public boolean isStrongPassword(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }
    
   public String getPasswordValidationMessage(String password) {
        boolean isLengthValid = PASSWORD_LENGTH_PATTERN.matcher(password).matches();
        boolean isUppercaseValid = UPPERCASE_PATTERN.matcher(password).matches();
        boolean isNumberValid = NUMBER_PATTERN.matcher(password).matches();
        boolean isSpecialCharValid = SPECIAL_CHAR_PATTERN.matcher(password).matches();

    if (!isLengthValid || !isUppercaseValid || !isNumberValid || !isSpecialCharValid) {
        StringBuilder message = new StringBuilder();
        message.append("<html><b>Password Requirements:</b><br>");
        if (!isLengthValid) {
            message.append("- Minimum 8 characters<br>");
        }
        if (!isUppercaseValid) {
            message.append("- At least one uppercase letter (A-Z)<br>");
        }
        if (!isNumberValid) {
            message.append("- At least one number (0-9)<br>");
        }
        if (!isSpecialCharValid) {
            message.append("- At least one special character (!@#$%^&*.)<br>");
        }
        message.append("</html>");
        return message.toString();
    } else {
        return "Password is strong.";
    }
}
}
