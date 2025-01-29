package week03;
/*
 🇯 🇦 🇻 🇦   🇹 🇦 🇸 🇰 - Week 03 🥇
Swap Numbers:

 Swap two integer variable values (including both ways; with using a third variable and without it)
 */
public class SwapNumbers_Andrada {
    public static void main(String[] args) {
        //i-created 3 int
        //first 2 are for storing our value
        //and int c ist for storing one of the value when we swap them
       //first int
        int a =20;
        int b= 30;
        //empty int
        int c;
        //Print before swap the value
        System.out.println("Before swapNumber a = " + a);
        System.out.println("Before swapNumber b = " + b);

        //store our value int c int;
         c=a;
        a=b;
        b=c;
        //print of them after swap the value
        System.out.println("After swapNumber a = " + a);
        System.out.println("After swapNumber b = " + b);

        /*
        swapping value without any empty int one more time
         */
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("After swipping a= " + a);
        System.out.println("After swipping b = " + b);


    }


}
