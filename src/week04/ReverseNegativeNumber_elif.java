package week04;

public class ReverseNegativeNumber_elif {
/*
Task: How to reverse a negative number.
 */
        public static int reverseNegativeNumber(int n) {

            // Only reverse if the number is negative
            if (n < 0) {
                // Convert the number to positive, reverse it, then reapply the negative sign
                int reversed = reverseNumber(Math.abs(n));
                return -reversed;
            }
            // If the number is positive, return it as is
            return n;
        }

        private static int reverseNumber(int num) {

            // Convert the number to a string
            String numStr = Integer.toString(num);
            String reversedStr = "";

            // Reverse the string by iterating backwards
            for (int i = numStr.length() - 1; i >= 0; i--) {
                reversedStr += numStr.charAt(i);
            }
            // Convert the reversed string back to an integer
            return Integer.parseInt(reversedStr);
        }

        public static void main(String[] args) {
            int n = -12345;
            int reversed = reverseNegativeNumber(n);
            System.out.println("Reversed negative number: " + reversed);  // Output: -54321

            int positiveNum = 12345;
            System.out.println("Positive number (unchanged): " + reverseNegativeNumber(positiveNum));  // Output: 12345
        }

    //2nd option for reversing negative number & also reversing positive numbers (by using Stringbuilder)
//    public static int reverseNegativeNumber(int n) {
//        if (n < 0) {
//            // Convert the number to a positive value, reverse it, then reapply the negative sign
//            int reversed = reverseNumber(Math.abs(n));
//            return -reversed;
//        } else {
//            return reverseNumber(n); // If the number is positive, just reverse it
//        }
//    }
//    private static int reverseNumber(int num) {
//        // Convert the number to a string, reverse it, and then convert it back to an integer
//        String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();
//        return Integer.parseInt(reversedString);
//    }
//
//    public static void main(String[] args) {
//        int n = -12345;
//        int reversed = reverseNegativeNumber(n);
//        System.out.println("Reversed negative number: " + reversed);  // Output: -54321
//    }
}