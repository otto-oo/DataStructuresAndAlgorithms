package main.java.interview_examples.amazon.max_length_valid_subarray;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxLengthValidSubArray {
    public static void main(String[] args) {
        List<Integer> bootingPower = Arrays.asList(3,6,1,3,4);
        List<Integer> processingPower = Arrays.asList(2,1,3,4,5);
        int powerMax = 25;

        System.out.println("maxLengthValidSubArray(processingPower, bootingPower, powerMax) = " + maxLengthValidSubArray(processingPower, bootingPower, powerMax));
    }

    public static int maxLengthValidSubArray(List<Integer> processingPower, List<Integer> bootingPower, long powerMax){
        if (bootingPower.size() != processingPower.size() || bootingPower.size() == 0 || processingPower.size() == 0){
            return 0;
        }
        if (bootingPower.size() == 1 && processingPower.size() == 1 && (bootingPower.get(0) + processingPower.get(0) <= powerMax)){
            return 1;
        }
        int minK = 1;
        int maxK = bootingPower.size();
        int maxPowerK = 0;
        for (int k = minK; k <= maxK; k++){
            int i = 0;
            while(i <= maxK-k){
                int powerK = calculateSum(bootingPower, processingPower, i, k);
                if (powerK <= powerMax){
                    maxPowerK = Math.max(k, maxPowerK);
                    i += 1;
                }
            }
        }
        return maxPowerK;
    }

    private static int calculateSum(List<Integer> booting, List<Integer> processing, int leftPointer, int rightPointer){
        int sum = booting.stream().filter(x->booting.indexOf(x)>=leftPointer && booting.indexOf(x)<=rightPointer).reduce(Integer::sum).get();
        for(int i = leftPointer;i<=rightPointer;i++){
            sum+= (processing.get(i)*(rightPointer+1-leftPointer));
        }
        return  sum;
    }
}
