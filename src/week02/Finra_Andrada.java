package week02;

public class Finra_Andrada {
    public static void main(String[] args) {
        //OR We can also create that method direct in main method

        finraMethod(30);

    }
    // we create a method named finraMethod with int number argument , so we can change the number
    // with which one we want to print
 public static void finraMethod(int number){
      //we create for loop for itereting throw each number
        for (int i = 0 ; i<=number; i++){
            //if number is divisible of both 3 and 5, print "FINRA" instead of the number
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
                //we create if condition for printing FIN if number i is divisible by 3
            }else if (i % 3 == 0 ){
                System.out.println("FIN");
                //if number is divisible by 5 == 0 we print RA
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }

        }
    }
}

