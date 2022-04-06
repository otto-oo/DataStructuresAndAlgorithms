package main.java.algo4_array_of_products;

import java.util.Arrays;

public class Algo4_2 {

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        System.out.println("Arrays.toString(arrayOfProducts(array)) = " + Arrays.toString(arrayOfProducts(array)));
    }

    public static int[] arrayOfProducts(int[] nums) {

        int[] ret = new int[nums.length];
        if(nums.length == 0) return ret;

        int runningprefix = 1;
        for(int i = 0; i < nums.length; i++){
            ret[i] = runningprefix;
            runningprefix*= nums[i];
        }

        int runningsufix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            ret[i] *= runningsufix;
            runningsufix *= nums[i];
        }
        return ret;
    }
}
