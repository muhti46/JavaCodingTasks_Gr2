package week08;

public class ReverseString_Muhterem {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));
    }
    /*
    This method returns the reverse of a string.
     */
    //Null control
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        //Create an object from StringBuilder class to use ready reverse() method.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
         result.append(str.charAt(i));

        }
       return result.reverse().toString();

    }

}
