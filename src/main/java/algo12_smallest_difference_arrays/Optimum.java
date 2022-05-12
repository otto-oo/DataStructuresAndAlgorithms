package main.java.algo12_smallest_difference_arrays;

import java.util.*;

public class Optimum {
    public static void main(String[] args) {

        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] pairs = findSmallestDifference(arrayOne, arrayTwo);
        System.out.println("Arrays.toString(pairs) = " + Arrays.toString(pairs));

    }

    // Time Complexity is O(n), Space complexity is O(1)
    public static int[] findSmallestDifference(int[] arrayOne, int[] arrayTwo) {

        int min = Integer.MAX_VALUE;                                            // begin with maximum integer value
        int pointOne = 0;
        int pointTwo = 0;
        int[] smallestpair = new int[2];

        Arrays.sort(arrayOne); // {-1, 3, 5, 10, 20, 28, 29}                    // array should be sorted
        Arrays.sort(arrayTwo); // {15, 17, 26, 134, 135, 150}                   // array should be sorted

        while (pointOne < arrayOne.length && pointTwo < arrayTwo.length && min != 0) {  // 0 is the best solution

            if (Math.abs(arrayOne[pointOne] - arrayTwo[pointTwo]) < min) {      // check if subtraction is less than min
                min = Math.abs(arrayOne[pointOne] - arrayTwo[pointTwo]);
                smallestpair[0] = arrayOne[pointOne];                           // change smallest pair array elements
                smallestpair[1] = arrayTwo[pointTwo];
            }

            if (arrayOne[pointOne] < arrayTwo[pointTwo]) {                      // If Array[pointOne] is less than Array[pointTwo]
                pointOne++;                                                     // iterate to first array
            } else pointTwo++;                                                  // If not iterate to second array
        }
        return smallestpair;
    }
}
