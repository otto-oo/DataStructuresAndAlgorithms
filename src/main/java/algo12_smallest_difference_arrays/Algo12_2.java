package main.java.algo12_smallest_difference_arrays;

import java.util.*;

public class Algo12_2 {
    public static void main(String[] args) {

        int[] arrayOne = {-1, 5, 10, 20, 28, 3};

        int[] arrayTwo = {26, 134, 135, 15, 17, 29};

        int[] pairs = findSmallestDifference(arrayOne, arrayTwo);

        System.out.println("Arrays.toString(pairs) = " + Arrays.toString(pairs));

    }

    public static int[] findSmallestDifference(int[] arrayOne, int[] arrayTwo) {

        int min = Integer.MAX_VALUE;

        int pointOne = 0;

        int pointTwo = 0;

        Arrays.sort(arrayOne); // {-1, 3, 5, 10, 20, 28, 29}

        Arrays.sort(arrayTwo); // {15, 17, 26, 134, 135, 150}

        int[] smallestpair = new int[2];

        while (pointOne < arrayOne.length && pointTwo < arrayTwo.length) {

            if (Math.abs(arrayOne[pointOne] - arrayTwo[pointTwo]) < min) {

                min = Math.abs(arrayOne[pointOne] - arrayTwo[pointTwo]);

                smallestpair[0] = arrayOne[pointOne];

                smallestpair[1] = arrayTwo[pointTwo];

            }

            if (arrayOne[pointOne] < arrayTwo[pointTwo]) {

                pointOne++; //If Array[pointOne] is less than Array[pointTwo] go with first array

            } else pointTwo++; //If Array[pointOne] is bigger than Array[pointTwo] go with second array

        }

        return smallestpair;

    }
}
