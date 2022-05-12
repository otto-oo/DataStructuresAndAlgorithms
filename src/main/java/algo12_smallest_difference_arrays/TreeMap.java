package main.java.algo12_smallest_difference_arrays;

import java.util.Arrays;
import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] pairs = smallestDifferenceWithMap(arrayOne, arrayTwo);
        //System.out.println("Arrays.toString(pairs) = " + Arrays.toString(pairs));
    }

    public static int[] smallestDifferenceWithMap(int[] array1, int[] array2){
        int[] output = new int[2];

        Map<Integer, Integer> allNumbersMap = new TreeMap<>();

        int difference = Integer.MAX_VALUE;

        for(int i : array1) allNumbersMap.put(i,1);
        for(int i : array2) allNumbersMap.put(i,2);

        Object[] keysArray = allNumbersMap.keySet().toArray();

        for(int i=0 ; i<keysArray.length-1 ; i++){
            // {-1, 5, 10, 15, 17, 20, 26, 28, 134, 135};
            //   1  1  1   2   2   1   2   1    2    2
            int firstElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i].toString()));
            int secondElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i+1].toString()));

            int firstElement = Integer.parseInt(keysArray[i].toString());
            int secondElement = Integer.parseInt(keysArray[i+1].toString());

            if(firstElementArray != secondElementArray){
                if (secondElement - firstElement < difference){
                    difference = secondElement - firstElement;
                    output[0] = firstElement;
                    output[1] = secondElement;
                    if(difference == 0) break;
                }
            }
        }
        return output;
    }
}
