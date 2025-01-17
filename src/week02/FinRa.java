package week02;
/*
Write a function that prints out the numbers from 1 to 30
but for numbers that are a multiple of 3, print "FIN" instead of the number,
 and for numbers that are a multiple of 5, print "RA" instead of the number.
 For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class FinRa {

    public static void main(String[] args) {

        printFinRa();//call the method

    }


    /**
     * Create a method which iterates the numbers between 1-30.
     * Print all the numbers but "FIN" instead of 3 or multible of 3,
     * "RA" instead of 5 or multible of 5,
     * "FINRA" instead of multible of 3 and 5.
     */
    public static void printFinRa() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // It must be in the first order
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
