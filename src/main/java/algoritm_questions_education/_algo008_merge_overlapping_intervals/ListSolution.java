package main.java.algoritm_questions_education._algo008_merge_overlapping_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSolution {

    public static void main(String[] args) {

        int[][] array = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        System.out.println("mergeOverlappingIntervals(array).toString() = " + mergeOverlappingIntervals(array));
    }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] array){

        Arrays.sort(array, Comparator.comparingInt(o -> o[0]));         // nlogn, needs to be sorted before going on..

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i < array.length; i++){                            // O(n)
            if( i != array.length-1 && array[i][1]>=array[i+1][0] ){
                array[i+1][0] = array[i][0];
                array[i+1][1] = Math.max(array[i][1],array[i+1][1]);
            }else list.add(Arrays.asList(array[i][0],array[i][1]));
        }
        return list;
    }
}
