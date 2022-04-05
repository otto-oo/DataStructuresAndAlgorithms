package main.java.algo15_subarray_sort;

import java.util.Arrays;

public class Algo15_2 {

    public static void main(String[] args) {

        int [] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        //int [] array = {1, 2, 4, 7, 10, 11, 16, 18, 19};
        System.out.println("subarraySort(array).toString() = " + Arrays.toString(subarraySort(array)));

    }

    public static int[] subarraySort(int[] array){

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int[] result = new int[2];
        int[] sortedResult = {-1,-1};

        if (isEqual(array,sortedArray)){
            return sortedResult;
        }

        for(int i = 0; i < array.length; i++){
            if (array[i] != sortedArray[i]){
                result[0] = i;
                break;
            }
        }

        for(int j = array.length - 1; j >= 0; j--){
            if (array[j] != sortedArray[j]){
                result[1] = j;
                break;
            }
        }

        return result;
    }

    public static boolean isEqual(int[] array, int[] array2){

        for (int i = 0; i < array.length; i++){
            if (array[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
