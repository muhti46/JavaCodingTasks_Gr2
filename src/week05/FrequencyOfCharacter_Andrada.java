package week05;

public class FrequencyOfCharacter_Andrada {
    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));

        // providing another word for see if frequencyOfCharacters is working as expected
        System.out.println("frequencyOfCharacters(\"AAABBBCCC\") = " + frequencyOfCharacters("AAABBBCCC"));
        System.out.println("frequencyOfCharacters(\"AAAAAA\") = " + frequencyOfCharacters("AAAAAA"));
    }
/*
we create a mehtod for be easy to put any word and provide frequency of characters
 */
    public static String frequencyOfCharacters(String word){
      //creating empty String for storing our Character and number of them
        String temp = "";

        //Itereting trough each character in the input string
        for (int i = 0 ; i<word.length();i++){
            char charr= word.charAt(i);
            //creating int for counting our characters
            int count = 0 ;

        for (int j = 0 ; j<word.length();j++){
            if(word.charAt(j) == charr){
                count++;
            }
        }
            // If the character is already in the temp string, skip
        if(temp.contains("" + charr)){
            continue;
        }
//
        temp += charr+ "" + count;
    }
        return temp;
}

}