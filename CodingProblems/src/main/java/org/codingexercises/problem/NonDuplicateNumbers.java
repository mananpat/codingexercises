package org.codingexercises.problem;

/**
 * Given Sorted Array Input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 * Explanation: The first four elements after moving element will be [2, 3, 6, 9].
 *
 *
 * Time Complexity: Loop through array (O(N))
 * Overall space complexity: O(1)
 *
 */
public class NonDuplicateNumbers {

    public void main (String[] args){
        int[] inputArray = new int[]{2, 3, 3, 3, 6, 9, 9};
        NonDuplicateNumbers solution = new NonDuplicateNumbers();
        int resultIndex = solution.arrangeNonDuplicate(inputArray);
        System.out.println("Non Duplicate Numbers: " + resultIndex);
    }

    public int arrangeNonDuplicate(int[] input) {
        int nextNonDuplicateIndex = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[nextNonDuplicateIndex - 1] != input[i]) {
                // If different, copy the current element to the nextNonDuplicate position
                input[nextNonDuplicateIndex] = input[i];
                // Increment the index of the next non-duplicate element
                nextNonDuplicateIndex++;
            }
        }
        return nextNonDuplicateIndex;
    }

}

