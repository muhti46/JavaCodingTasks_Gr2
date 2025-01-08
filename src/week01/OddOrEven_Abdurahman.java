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
        // create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        oddOrEven(number);

    }
    public static void oddOrEven(int number) {
       if (number % 2 == 0) {
           System.out.println("Even");
       }else {
           System.out.println("Odd");
       }
    }
}
