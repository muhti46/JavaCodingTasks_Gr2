package week04;

public class ReversingNegativeNumber_Andrada {
    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber(-35) = " + reverseNegativeNumber(-35));


    }
    public static int reverseNegativeNumber(int num){
        if(num>=0){ //throw an Exception if the number is positive
            throw new IllegalArgumentException("Input must be a negative number");
        }

        int digit=Math.abs(num);// Take the absolute value of the number  int digit =number (without minus)

        int rev = 0; // create a intiger named rev for sotring our reverse num

        while (digit >0){//While loop for reversing the number
            int temp = digit % 10;// Extract the last digit
            rev =rev*10+temp;// Append the digit to the reversed number
            digit = digit/10;//Remove the last digit from the original number
        }
        return -rev;  // Restore the negative sign
    }
}
