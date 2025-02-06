package week05;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_muhterem {
  /*
   Write a return method that can find the frequency of characters

         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
   */

        public static String frequencyOfChars(String str) {
            if (str == null || str.isEmpty()) {
                return "";
            }

            // Use LinkedHashMap to maintain insertion order
            LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();

            // Count character frequencies
            for (char c : str.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            // Build the result string
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            return result.toString();
        }

        // Test cases
        public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCDD"));  // A3B2C1D2
            System.out.println(frequencyOfChars("HelloWorld")); // H1e1l3o1W1r1d1
            System.out.println(frequencyOfChars("aabbcc"));     // a2b2c2
        }
    }