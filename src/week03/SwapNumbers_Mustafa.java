package week03;

public class SwapNumbers_Mustafa {
    public static void main(String[] args) {
        //    1. Using a Temporary Variable


        //Swap values using a temporary variables
        int num1 = 5; //First number
        int num2 = 10; //Second number

        System.out.println("Before Swap: num1 = " + num1 + ",num2 = " + num2);

        int temp;     //Temporary variable to store one of the values
        temp = num1; //Store the value of num1 in temp
        num1 = num2; //Assign the value num2 to num1
        num2 = temp; //Assign the stored value (temp) tpo num2

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("===========================================================");

        // 2. Without Using a Temporary Variable

        num1 = 10; // Resetting the value of num1
        num2 = 5;  // Resetting the value of num2

        System.out.println("Before Swap: num1 = " +num1 + ", num2 = " + num2);

        num1 = num1 + num2; // Add the two numbers and assign the sum to num1
        num2= num1 - num2 ; // Subtract num2 from the new value of num1 to get the original num1
        num1 = num1 - num2; // Subtract the new value of num2 from num1 to get the original num2

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);

    }
}
