package week03;

/**
 * Swap two integer variable values
 * (including both ways; with using a third variable and without it)
 */
public class SwapNumbers_Abdurahman {
    int num1;
    int num2;

    public static void main(String[] args) {

        swapNumbers(10, 5);
        swapNumbers2(100,10);

    }
    /**
     * This method swaps the values of two given integer numbers
     * @param num1 first integer to be swapped
     * @param num2 second integer to be swapped
     */
    public static void swapNumbers(int num1, int num2) {
        System.out.println("Before Swapping Numbers are " + num1 + " and " + num2);
        int temp = num1;    // Store the value of num1 in a temporary variable
        num1 = num2;        // Assign num2's value to num1
        num2 = temp;        // Assign the original num1 value (stored in temp) to num2
        System.out.println("After Swapping Numbers are " + num1 + " and " + num2);
    }
    public static void swapNumbers2(int num1, int num2) {
        System.out.println("Before Swapping Numbers are " + num1 + " and " + num2);
        num1 = num1 + num2;    // num1 contains the sum of both numbers
        num2 = num1 - num2;    // num2 becomes the original value of num1
        num1 = num1 - num2;    // num1 becomes the original value of num2
        System.out.println("After Swapping Numbers are " + num1 + " and " + num2);
    }
}
