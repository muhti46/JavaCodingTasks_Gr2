package week01;

import java.util.Scanner;

public class OddOrEven_Abdurahman {

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
    }

    /**
     * return given if it is  odd or even number
     * @param n int
     */
    public static void identify(int n) {
        if(n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}