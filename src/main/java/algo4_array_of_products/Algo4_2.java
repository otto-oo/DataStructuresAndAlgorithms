package main.java.algo4_array_of_products;

import java.util.Arrays;

public class Algo4_2 {

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 2};
        System.out.println("Arrays.toString(arrayOfProducts(array)) = " + Arrays.toString(arrayOfProducts(array)));
    }

    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];

        int leftRunningProduct = 1;
        for (int i = 0; i < array.length; i++) {            // 1, 5, 15, 60
            products[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }

        int rightRunningProduct = 1;                        // 24 ,40 ,30 ,60
        for (int i = array.length - 1; i >= 0; i--) {
            products[i] *= rightRunningProduct;
            rightRunningProduct *= array[i];
        }
        return products;
    }
}
