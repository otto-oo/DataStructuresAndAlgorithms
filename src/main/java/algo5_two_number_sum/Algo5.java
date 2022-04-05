package main.java.algo5_two_number_sum;

import java.util.Arrays;

public class Algo5 {

    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println("twoNumberSum(array, targetSum).toString() = " + Arrays.toString(twoNumberSum(array, targetSum)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum){

        int[] resultArray = new int[2];
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] + array[j] == targetSum){
                    resultArray[0] = array[i];
                    resultArray[1] = array[j];
                    return resultArray;
                }
            }
        }
        return resultArray;
    }
}
