package org.codingexercises.problem;

import java.util.Arrays;

/*
In summary, the algorithm has an average
time complexity: O(N)
space complexity of O(N)
 */
public class PairWithTargetSum {
    public void main (String[] args){
      int[] inputArray = new int[]{1,2,4,5,6};
      int target = 7;
      PairWithTargetSum solution = new PairWithTargetSum();

      int[] result = solution.findPair(inputArray, target);

        System.out.println(Arrays.toString(result));

    }

    /*

     */
    public int[] findPair(int[] inputArray, int target){
        int first = 0, last = inputArray.length-1;
        while(first < last) {
            if (target == inputArray[first] + inputArray[last])
                return new int[]{first, last};
            else if (target > inputArray[first] + inputArray[last])
                first++;
            else
                last--;
        }
        return new int[]{-1,-1};
    }

}
