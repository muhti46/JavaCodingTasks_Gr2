package week01;
 /*
    **Numbers -- odd & even**

         Write a method that can identify  a given number is even or odd.

         EX:

                identify(5) --> "Odd"
                identify(6) --> "Even"
    */

public class OddOrEven_Andrada {

    public static void main(String[] args) {
        identify(5);
        identify(6);
    }

    /**
     * return given number if it odd or even
     * @param number int
     */
    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}



