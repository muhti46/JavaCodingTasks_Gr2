package week06;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";//ABC
        System.out.println(removeDup(str));

    }
/*
 * Removes duplicate characters from a string while preserving the original order.
 * @param str Input string to process
 * @return String with duplicates removed
 */
    //Null control
    public static String removeDup(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        // LinkedHashSet maintains insertion order and automatically removes duplicates
        LinkedHashSet<Character> result = new LinkedHashSet<>();

        // Add each character to the set
        for (char c : str.toCharArray()) {
            result.add(c);
            }
        // Use StringBuilder for efficient string construction
        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            sb.append(c);

        }

        return sb.toString();
    }

}


