package main.java.algoritm_questions_education.algo9_largest_range;

import java.util.*;

public class Algo9 {

    public static void main(String[] args) {

        int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};

        System.out.println("largestRange(array) = " + Arrays.toString(largestRange(array)));

    }

    // O(n) time | O(n) space
    public static int[] largestRange(int[] array) {
        int[] bestRange = new int[2];
        int longestLength = 0;
        Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
        for (int num : array) {                 // at the beginning set all of the values inside map true
            nums.put(num, true);
        }
        for (int num : array) {
            if (!nums.get(num)) {               // if value is false then pass that number
                continue;
            }
            nums.put(num, false);
            int currentLength = 1;
            int left = num - 1;                 // set previous number of num
            int right = num + 1;                // set previous number of num
            while (nums.containsKey(left)) {    // if there is a number smaller than num
                nums.put(left, false);
                currentLength++;
                left--;
            }
            while (nums.containsKey(right)) {   // if there is a number bigger than num
                nums.put(right, false);
                currentLength++;
                right++;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                bestRange = new int[] {left + 1, right - 1};
            }
        }
        return bestRange;
    }
}
