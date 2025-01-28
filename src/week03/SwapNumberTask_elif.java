package week03;

public class SwapNumberTask_elif {

        public static void main(String[] args) {
            int a = 5, b = 10;

            // Before swapping
            System.out.println("Before Swap: a = " + a + ", b = " + b);

            // Using a temporary variable to swap
            int temp = a;
            a = b;
            b = temp;

            // After swapping
            System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
