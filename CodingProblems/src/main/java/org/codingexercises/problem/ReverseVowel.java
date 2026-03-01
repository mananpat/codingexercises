package org.codingexercises.problem;

/*
Giving input string, reverse vowel characters.

Two Pointers traversal. first and last pointers.
Linear scan of the characters.
Vowel Check: O(1)
 */
public class ReverseVowel {


    public static void main(String[] args){
        ReverseVowel solution = new ReverseVowel();
        String input = "abbded";

        String output = solution.reverseString(input);
        System.out.println("output String: " + output);

    }

    public String reverseString(String input){
        String vowel = "aeiouAEIOU";
        int first = 0;
        int last = input.length()-1;
        char[] array = input.toCharArray();
        while(first < last){
            while (first < last && vowel.indexOf(array[first]) == -1)
                first++;
            while(first < last && vowel.indexOf(array[last]) == -1)
                last--;

            char temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }

        return new String(array);

    }
}
