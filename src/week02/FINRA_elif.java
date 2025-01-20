package week02;

public class FINRA_elif {
        public static void main(String[] args) {

            for (int i = 1; i <= 30; i++) {
                boolean by3 = i % 3 == 0;
                boolean by5 = i % 5 == 0;
                if (by3 && by5) {
                    System.out.print("FINRA");
                } else if (by3) {
                    System.out.print("FIN" + " ");
                } else if (by5) {
                    System.out.print("RA" + " ");
                } else {
                    System.out.print(" " + i + " ");
                }
            }
        }
    }
/*
Write a function that prints out the numbers from 1 to 30 but for numbers
that are a multiple of 3, print "FIN" instead of the number, and for numbers that are a multiple of 5,
 print "RA" instead of the number.
For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
