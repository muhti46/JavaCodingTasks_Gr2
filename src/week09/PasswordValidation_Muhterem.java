package week09;
public class PasswordValidation_Muhterem {

//    Write a return method that can verify if a password is valid or not.
//    Requirements:
//    Password MUST be at least 6 characters and should not contain spaces.
//    Password should contain at least one uppercase letter.
//    Password should contain at least one lowercase letter.
//    Password should contain at least one special character.
//    Password should contain at least one digit.
//    If all the requirements above are met, the method returns true; otherwise, it returns false.
    public static void main(String[] args) {

        String str = "Hello1!";//True
        System.out.println(isValidPassword(str));
    }

    /**
     * This method checks password if it has at least one uppercase one
     * lowercase letter and one special character and one digit. Then returns boolean value.
     * @param password declared as string
     * @return True or False
     */
    public static boolean isValidPassword(String password) {
        // Check length and spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()-+";   // Special characters set

        // Loop through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.contains(Character.toString(c))) {
                hasSpecialChar = true;
            }
        }
        // Check all conditions
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}