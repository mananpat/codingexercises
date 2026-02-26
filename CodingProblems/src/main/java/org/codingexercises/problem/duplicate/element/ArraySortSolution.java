package org.codingexercises.problem.duplicate.element;

import java.util.Arrays;

/**
 *
 * Time Complexity: Arrays.Sort()  O(N logN)
 *                  Comparision of elements: O(N)
 *
 *  Space Complexity:
 *                  Depends on the implementation of Sorting Algorithams.
 *                  if Quicksort then O(log N)
 */

public class ArraySortSolution {

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        ArraySortSolution solution = new ArraySortSolution();
        int[] input1 = new int[]{1, 5, 2, 4};
        System.out.println(solution.checkForDuplicate(input1));
    }


    public boolean checkForDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
