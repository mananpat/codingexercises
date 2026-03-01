package org.codingexercises.problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Check if every character of the engligh alphabet appears more than once.
 *
 * Time Complexity:  Iterate over String: O(N)
 *
 * Space Complexity:   Regardless of the String size, HashSet has constant space (26)
 *                     Overall Space: O(1) -> Constant
 *
 */
public class PangramTest {

    public static void main (String[] args){
        String input = "abcde";
        PangramTest solution = new PangramTest();
        boolean result = solution.isStringPangram(input);
        System.out.println("Pangram Result: " + result);
    }

    /*
        Iterate String to extract each character,
        convert to lowercase, further check for character being a letter
        check total size to be exactly 26 to be a Pangram
     */
    public boolean isStringPangram(String input){
        Set<Character> seen = new HashSet<>();
        for(int i=0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(currentChar))
                seen.add(currentChar);
        }
        return seen.size() == 26;
    }
}
