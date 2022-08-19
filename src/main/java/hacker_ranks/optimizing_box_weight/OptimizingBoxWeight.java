package main.java.hacker_ranks.optimizing_box_weight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OptimizingBoxWeight {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,5,6,2);

        System.out.println("optimizingBoxWeight(list) = " + optimizingBoxWeight(list));
    }
    public static List<Integer> optimizingBoxWeight(List<Integer> arr){
        long aSum = 0L;
        long bSum = 0L;
        List<Integer> minimalHeaviestA = new ArrayList<>();

        for (int a : arr){
            bSum += (long) a;                               // bSum = 23; aSum = 0;
        }

        arr.sort(Collections.reverseOrder());               // arr = {7,6,5,3,2}

        for (int a : arr){
            if(aSum > bSum){                                // aSum = 0 bSum = 23  / aSum = 7 bSum = 16  / aSum = 13; bSum = 10;
                break;                                      // aSum > bSum
            }
            minimalHeaviestA.add(a);                        // minimalHeaviestA = {7,6};
            aSum += (long) a;                               // aSum = 7     / aSum = 13
            bSum -= (long) a;                               // aSum = 16    / bSum = 10
        }
        Collections.reverse(minimalHeaviestA);              // minimalHeaviestA = {6,7};

        return minimalHeaviestA;
    }
    
}
