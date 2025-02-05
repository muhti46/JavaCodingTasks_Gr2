package week03;

/*
Swap two integer variable values
(including both ways; with using a third variable and without it)
 */
public class swapTwoVariables {
    public static void main(String[] args) {

        int var01 = 12;
        int var02 = 1;
        int temp;

        System.out.println("Before swap: var01 = "+var01);
        System.out.println("Before swap: var02 = "+var02);

        temp=var01;
        var01=var02;
        var02=temp;


        System.out.println("After swap: var01 = "+var01);
        System.out.println("After swap: var02 = "+var02);


   }

}
