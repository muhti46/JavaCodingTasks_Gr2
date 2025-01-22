public class FinRa_muhterem {
    /**
     Write a function(method) that prints out the numbers from 1 to 30
     but for numbers that are a multiple of 3, print "FIN" instead of the number,
     and for numbers that are a multiple of 5, print "RA" instead of the number.
     For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.

     */
    public static void main(String[] args) {

        finra();

        System.out.println("=========================================");
        finra(45,"JA","VA");
    }
    /**
     * - The `finra` method prints numbers from 1 to 30 (inclusive) with the following rules:
     * - If a number is divisible by both 3 and 5, it prints "FINRA".
     * - If a number is divisible by only 3, it prints "FIN".
     * - If a number is divisible by only 5, it prints "RA".
     * - Otherwise, it prints the number itself.
     *-  the method will print numbers and apply the rules.
     */
    public static void finra() {
        String str1 = "FIN";
        String str2 = "RA";
        for (int i = 1; i <=30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(str1 + str2);
            } else if (i % 3 == 0) {
                System.out.println(str1);
            } else if (i % 5 == 0) {
                System.out.println(str2);
            }else {
                System.out.println(i);
            }
        }
    }

    /**
     * The `finra` method prints numbers from 1 to a specified limit (inclusive) with custom rules:
     * - If a number is divisible by both 3 and 5, it prints the concatenation of the two provided strings (`str1 + str2`).
     * - If a number is divisible only by 3, it prints the first string (`str1`).
     * - If a number is divisible only by 5, it prints the second string (`str2`).
     * - Otherwise, it prints the number itself.
     * @param n The upper limit of the range (inclusive) to which the method will print numbers and apply the rules.
     * @param str1 The string to print when a number is divisible by 3.
     * @param str2 The string to print when a number is divisible by 5.
     */
    public static void finra(int n, String str1, String str2) {

        for (int i = 1; i <=n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(str1 + str2);
            } else if (i % 3 == 0) {
                System.out.println(str1);
            } else if (i % 5 == 0) {
                System.out.println(str2);
            }else {
                System.out.println(i);
            }

        }
        if (n < 1) {
            System.out.println("The range must start at 1 or higher.");
            return;
        }
    }
}



