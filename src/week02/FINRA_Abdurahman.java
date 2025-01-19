package week02;

public class FINRA_Abdurahman {
/*
 FINRA:
 Write a function that prints out the numbers from 1 to 30 but for numbers
 that are a multiple of 3, print "FIN" instead of the number,
 and for numbers that are a multiple of 5, print "RA"
 instead of the number.
 For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
    public static void main(String[] args) {

        finra(3);
    }

    /**
     * return given number if are a multiple of 3, print "FIN"
     * return given number if are a multiple of 5, print "RA"
     * return given number if are a multiple of 3 and 5, print "FINRA"
     * @param num
     */
    public static void finra(int num) {

        for (int i = 1; i <= 30; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i + " is FINRA.");
            } else if (i%3 == 0) {
                System.out.println(i + " is FIN.");
            } else if (i%5 == 0) {
                System.out.println(i + " is RA.");
            }else {
                System.out.println(i + " is number.");
            }
        }
    }
}
