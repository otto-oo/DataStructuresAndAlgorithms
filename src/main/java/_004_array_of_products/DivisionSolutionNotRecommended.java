package main.java._004_array_of_products;

import java.util.Arrays;

public class DivisionSolutionNotRecommended {

    public static void main(String[] args) {

        int[] array = {5, 3, 4, 2};
        System.out.println("Arrays.toString(arrayOfProducts(array)) = " + Arrays.toString(arrayOfProducts(array)));

    }

    // time complexity O(n), space complexity O(n)
    public static int[] arrayOfProducts(int[] array){
        int totalProducts = 1;
        for (int i = 0; i < array.length; i++){
            totalProducts *= array[i];                  //
        }
        // totalProducts = 120;
        int[] resultArray= new int[array.length];
        for(int i = 0; i < array.length; i++){
            resultArray[i] = totalProducts / array[i]; //     120 / 5 = 24,   120 / 3 = 40, 120 / 4 = 30, 120/ 2 = 60
        }
        return resultArray;
    }
}
