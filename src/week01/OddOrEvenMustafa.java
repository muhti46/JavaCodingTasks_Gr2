package week01;

public class OddOrEvenMustafa {
    /*
Write a method that can identify a given number is even or odd

       EX:
              identify(5) --> "Odd"
              identify(6) --> "Even"
     */
    public static void main(String[] args) {
        identify(5);
        identify(6);
    }
    public static void identify(int num){
        if (num % 2 == 1) {
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }
}
