package main.java.algo4_array_of_products;

import java.util.Arrays;

public class Algo4_1 {

    public static void main(String[] args) {

        int[] array = {5, 0, 4, 2};
        System.out.println("Arrays.toString(arrayOfProducts(array)) = " + Arrays.toString(arrayOfProducts(array)));

    }

    public static int[] arrayOfProducts(int[] array){

        int totalProducts = 1;
        for (int i = 0; i < array.length; i++){
            totalProducts *= array[i];
        }

        int[] resultArray= new int[array.length];
        for(int i = 0; i < array.length; i++){
            resultArray[i] = totalProducts / array[i];
        }
        return resultArray;
    }
}
