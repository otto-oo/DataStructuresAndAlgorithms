package main.java.algoritm_questions_education.algo12_smallest_difference_arrays;

import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args) {

        int[] arrayOne = {-1, 5, 10, 20, 28, 3};

        int[] arrayTwo = {26, 134, 135, 15, 17};

        int[] pairs = findSmallestDifference(arrayOne, arrayTwo);

        System.out.println("Arrays.toString(pairs) = " + Arrays.toString(pairs));
    }

    // Time Complexity is O(n), Space complexity is O(1)
    public static int[] findSmallestDifference(int[] arrayOne, int[] arrayTwo){

        int min = Integer.MAX_VALUE;                                // begin with maximum integer value
        int subtraction;
        int[] smallestpair = new int[2];

        for (int i = 0; i < arrayOne.length; i++){
            for (int j = 0; j < arrayTwo.length; j++){
                subtraction = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (subtraction < min){                             // check if subtraction is new min value
                    min = subtraction;
                    smallestpair[0] = arrayOne[i];                  // if it is new minimum, replace the smallest array elements
                    smallestpair[1] = arrayTwo[j];
                }
            }
        }
        return smallestpair;
    }
}
