package main.java.algo13_longest_peak;

import java.util.*;

public class Algo13_3 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println("Longest Peak Number = " + longestPeak(array));
    }

    public static int longestPeak(int[] array){

        List<Integer> peakElements = new ArrayList<>();
        int i = 0;
        int peakIndex;

        while (i < array.length - 2){
            if (array[i] < array[i + 1] & array[i + 1] > array[i + 2]){
                peakIndex = i + 1;
                peakElements.add(findPeakNumbers(peakIndex, array));    // returns range number
            }
            i++;
        }

        return Collections.max(peakElements);   // returning max number
    }

    public static int findPeakNumbers(int peakIndex, int[] array){

        int j = peakIndex;
        int beginPeak;                      // start of peak
        int endPeak;

        while (j > 0){                      // calculating previous numbers of peak
            if (array[j] > array[j - 1]){
                j--;
            }else break;
        }

        beginPeak = j;
        j= peakIndex;

        while (j < array.length-1){         // calculating after numbers of peak
            if (array[j] > array[j + 1]){
                j++;
            }else break;
        }

        endPeak = j + 1;                                    // end of peak
        return endPeak - beginPeak;                         // total range
    }

}
