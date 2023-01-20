import java.util.*; 


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> occurrences = new HashMap<>(); 
        int maxOccurring = 0; 
        char maxOccurringCh = 0; 

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i); 

        //     if (occurrences.containsKey(ch)) {
        //         occurrences.put(ch, occurrences.get(ch) + 1); 
        //         if (occurrences.get(ch) > maxOccurring) {
        //             maxOccurring = occurrences.get(ch); 
        //         }
        //     } else {
        //         occurrences.put(ch, 1); 
        //     }; 

        //     // if (occurrences.get(ch) > maxOccurring) {
        //     //     maxOccurring = occurrences.get(ch); 
        //     // }
        // }; 

        

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            Integer val = occurrences.get(c); 
            if (val != null) {
                occurrences.put(c, val+1); 
            } else {
                occurrences.put(c, 1); 
            }
        }; 
        
        for (Map.Entry<Character, Integer> occurrence : occurrences.entrySet()) {
            if (occurrence.getValue() > maxOccurring) {
                maxOccurring = occurrence.getValue(); 
                maxOccurringCh = occurrence.getKey(); 
            }
        }
        return maxOccurringCh;
    }
}
