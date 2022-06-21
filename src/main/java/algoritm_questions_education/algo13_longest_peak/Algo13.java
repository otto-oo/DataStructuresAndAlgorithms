package main.java.algoritm_questions_education.algo13_longest_peak;

import java.util.*;

public class Algo13 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

        System.out.println("Longest Peak Array = " + longestPeak(array));
    }

    public static List longestPeak(int[] array){

        Map<Integer, List<Integer>> peakElements = new HashMap<>();

        int[] result = new int[array.length];

        int i = 0;

        int peak = 0;

        int peakIndex = 0;

        while (i < array.length - 2){

            if (array[i] < array[i + 1] & array[i + 1] > array[i + 2]){

                peak = array[i + 1];

                peakIndex = i + 1;

                peakElements = findPeakElements(peakIndex, array);

            }

            i++;

        }

        return Arrays.asList(peakElements.values().toArray());

    }

    public static Map<Integer, List<Integer>> findPeakElements(int peakIndex, int[] array){

        Map<Integer, List<Integer>> peakMap = new HashMap<>();

        List<Integer> elements = new ArrayList<>();

        int j = peakIndex;

        while (j > 0){

            if (array[j] > array[j - 1]){

                elements.add(array[j-1]);

            }else break;

            j--;
        }

        elements.add(array[peakIndex]);

        j= peakIndex;

        while (j < array.length-1){

            if (array[j] > array[j + 1]){

                elements.add(array[j+1]);

            }else break;

            j++;
        }

        peakMap.put(elements.size(), elements);

        return peakMap;
    }

}
