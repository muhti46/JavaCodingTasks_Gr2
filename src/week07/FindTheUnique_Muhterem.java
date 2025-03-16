package week07;

import java.util.*;

public class FindTheUnique_Muhterem {
    //String-- Find the unique
    //Write a return method that can find the unique characters from the string
    //Ex: unique("AAABBBCCCDEF")-->"DEF";
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
    }

    public static String unique(String str) {
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count character frequencies
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        // Build the result string
        StringBuilder result = new StringBuilder();

        //Add unique character to result
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() == 1){
                result.append(entry.getKey());

            }
        }
// convert StringBuilder to String
        return result.toString();
        }

    }

