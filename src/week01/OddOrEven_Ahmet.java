package week01;

public class OddOrEven_Ahmet {
    /*
**Numbers -- odd & even**

       Write a method that can identify  a given number is even or odd.

       EX:

              identify(5) --> "Odd"
              identify(6) --> "Even"
 */
    public static void main(String[] args) {

        identify(5);
        identify(6);
        identify(101);
    /*
        for (int i = 1; i <100 ; i++) {
            System.out.print(i+"=");
            identify(i);
        }

     */

    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
