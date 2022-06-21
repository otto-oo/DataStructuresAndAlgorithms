package main.java.algoritm_questions_education.algo6_three_number_sum;

import java.util.Arrays;
import java.util.Comparator;

public class Algo6 {

    public static void main(String[] args) {

        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        System.out.println("threeNumberSum(array, targetSum).toString() = " + Arrays.deepToString(threeNumberSum(array, targetSum)));
    }

    public static int[][] threeNumberSum(int[] array, int targetSum){

        int[][] resultArray = new int[3][3];
        int z = 0;
        for(int i=0; i<array.length-2; i++){
            for(int j=i+1; j< array.length-1; j++){
                for (int k=j+1; k<array.length; k++){
                    if(array[i] + array[j] + array[k] == targetSum){
                        resultArray[z][0] = array[i];
                        resultArray[z][1] = array[j];
                        resultArray[z][2] = array[k];
                        Arrays.sort(resultArray[z]);
                        z++;
                    }
                }
            }
        }
        Arrays.sort(resultArray, Comparator.comparingDouble(o -> o[0]));
        return resultArray;
    }
}
