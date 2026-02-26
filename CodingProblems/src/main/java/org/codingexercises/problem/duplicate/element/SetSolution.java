package org.codingexercises.problem.duplicate.element;

import java.util.HashSet;
import java.util.Set;

/**
 * Given set of array, check if array contains duplicate element.
 *
 * Time Complexity:
 *        it iterates over an array O(N),
 *        HashSet operation is O(1)
 *        Overall time complexity: O(N)
 *  Space Complexity:
 *       HashSet uses N space ( worse case to store all elements).
 *        Overall Space Complexity: O(N)
 */
public class SetSolution {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int[] input1 = new int[]{1,2,3,4};
        SetSolution de = new SetSolution();
        boolean result1 = de.containsDuplicate(input1);
        System.out.printf("Result 1: [%s]", result1);

        int[] input2 = new int[]{3,2,3,4};
        boolean result2 = de.containsDuplicate(input2);
        System.out.printf("Result 2: [%s]", result2);
    }

    public boolean containsDuplicate(int[] nums){
        Set<Integer> counterSet = new HashSet<>();
        for(int num : nums){
            if(!counterSet.add(num))
                return true;
        }
        return false;
    }
}
