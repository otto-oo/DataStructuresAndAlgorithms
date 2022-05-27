package main.java.hacker_ranks.find_number_of_pairs;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 5, 2, 2, 2};
        System.out.println("findNumberOfPairs(arr) = " + findNumberOfPairs(arr));
    }

    public static int findNumberOfPairs(int[] arr){
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        if(arr.length == 0 || arr.length == 1){
            return result;
        }
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer val : map.values()){
            result += val / 2;
        }
        return result;
    }
}
