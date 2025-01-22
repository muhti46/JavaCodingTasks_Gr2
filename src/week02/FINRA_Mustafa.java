package week02;

public class FINRA_Mustafa {

    //Our main method (execution starts here)
    public static void main(String[] args) {

     /*
     We are calling to belows method to process numbers from 1 to 30 (if we want, we can change the numbers )
     based on the "finraNumbers"'s rules
     */

        finraNumbers(1, 30);
    }

    public static void finraNumbers(int num1, int num2) {

       //We use for loop to access all numbers
        for (int i = num1; i <= num2; i++) {

            //if the number is divisible by both 3 and 5, print "FINRA"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            //if the numbers is divisible only 3, print "FIN"
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            //if the numbers is divisible only 5, print "RA"
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            //if the number is not divisible 3 or 5, print the number!
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
