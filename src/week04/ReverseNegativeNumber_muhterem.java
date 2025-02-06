package week04;

public class ReverseNegativeNumber_muhterem {
    /*
    Write a return method that can reverse digits of a negative number and return it as int
     input: -35  output: -53
     */
    public static void main(String[] args) {

        reverseNegativeNumber("-35");
        System.out.println(reverseNegativeNumber2(-35));
        System.out.println(reverseNegativeNumber3(-35));

    }

    public static void reverseNegativeNumber(String str) {
        str = str.substring(1, str.length());// create a new string beginning with second character of the string.
        StringBuilder sb = new StringBuilder(str);// Create a StringBuilder object
        System.out.println("-" + sb.reverse());// use StringBuilder object and reverse it then print with "-" sign

    }
/*
Mathematical approach to reverse a number
 */
    public static int reverseNegativeNumber2(int num){
        if(num>=0){ //throw an Exception if the number is positive
            throw new IllegalArgumentException("Input must be a negative number");
        }

        int digit=Math.abs(num);// Take the absolute value of the number
        int rev = 0;

        while (digit >0){//While loop for reversing the number
            int temp = digit % 10;// Extract the last digit
            rev =rev*10+temp;// Append the digit to the reversed number
            digit = digit/10;//Remove the last digit from the original number
        }
            return -rev;  // Restore the negative sign
     }
/*
Convert the number to a string, reverse it, and parse back to an integer
 */
    public static int reverseNegativeNumber3(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be negative");
        }
        String str = Integer.toString(Math.abs(num));//Convert to string and take absolute value
        String reversed = new StringBuilder(str).reverse().toString();
        return -Integer.parseInt(reversed);//Convert back to integer and return it with negative sign
    }
}
