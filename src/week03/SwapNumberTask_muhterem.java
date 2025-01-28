package week03;

public class SwapNumberTask_muhterem {
    public static void main(String[] args) {
       // Swap two integer variable values (including both ways;
       // with using a third variable and without it)
        int num1=5;
        int num2=10;
        System.out.println("Before swapping num1= " + num1);
        System.out.println("Before swapping num2= " + num2);
/*
Using third variable to swapping
*/
        int temp=num1;//assign num1 to temp
        num1=num2;// assign num2 to num1
        num2=temp;// assign temp to num2
        System.out.println("After swapping num1= " + num1);
        System.out.println("After swapping num2= " + num2);



/*
Using math logic to swapping--> addition and subtraction
 */
        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping num1= " + num1);
        System.out.println("After swapping num2= " + num2);

/*
Using math logic to swapping--> division and multiplication
 */
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;
        System.out.println("After swapping num1= " + num1);
        System.out.println("After swapping num2= " + num2);
    }

}
