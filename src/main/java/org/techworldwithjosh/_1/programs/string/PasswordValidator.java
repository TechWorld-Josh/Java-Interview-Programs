package org.techworldwithjosh._1.programs.string;


public class PasswordValidator {

    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static boolean validateTraditional(String password) {

        if (password == null || password.length() < 8) { // Check minimum length
            return false;
        }

        boolean hasUpperCase = false;    // Check uppercase letter
        boolean hasLowerCase = false;    // Check lowercase letter
        boolean hasDigit = false;        // Check digit
        boolean hasSpecial = false;      // Check special character

        for (char ch : password.toCharArray()) { // Iterate through password

            if (Character.isUpperCase(ch)) {     // Check uppercase
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) { // Check lowercase
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {  // Check digit
                hasDigit = true;
            } else {                             // Special character
                hasSpecial = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecial;
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static boolean validateModern(String password) {

        if (password == null || password.length() < 8) { // Check minimum length
            return false;
        }

        boolean hasUpperCase = password.chars().anyMatch(Character::isUpperCase); // At least one uppercase
        boolean hasLowerCase = password.chars().anyMatch(Character::isLowerCase); // At least one lowercase
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);     // At least one digit
        boolean hasSpecial = password.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch)); // Special character

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {

        String password = "Java@123";

        // Part 1
        boolean traditionalResult = validateTraditional(password);
        // Part 2
        boolean modernResult = validateModern(password);

        System.out.println("Password : " + password);
        System.out.println("\nTraditional Approach : " + (traditionalResult ? "Valid Password" : "Invalid Password"));
        System.out.println("\nJava 8 / 17 / 21 Approach : " + (modernResult ? "Valid Password" : "Invalid Password"));
    }
}
