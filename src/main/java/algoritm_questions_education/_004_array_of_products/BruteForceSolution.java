package main.java.algoritm_questions_education._004_array_of_products;

import java.util.Arrays;

public class BruteForceSolution {
    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2};
        System.out.println("Arrays.toString(arrayOfProducts(array)) = " + Arrays.toString(arrayOfProducts(array)));
    }

    // time complexity O(n^2), space complexity O(n)
    public static int[] arrayOfProducts(int[] array){
        int[] resultArray= new int[array.length];

        for(int i = 0; i < array.length; i++){
            int products = 1;
            for(int j = 0; j < array.length; j++){
                if(i != j){
                    products *= array[j];
                }
            }
            resultArray[i] = products;
        }
        return resultArray;
    }
}
