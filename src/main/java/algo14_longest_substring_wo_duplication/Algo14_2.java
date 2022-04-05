package main.java.algo14_longest_substring_wo_duplication;

import java.util.HashSet;
import java.util.Set;

public class Algo14_2 {

    public static void main(String[] args) {

        String str = "clementisacap";
        System.out.println("longestSubsWithoutDups(str) = " + longestSubsWithoutDups(str));
    }

    public static int longestSubsWithoutDups(String str){

        int biggestLength = 0;
        int startPointer = 0;
        int endPointer = 0;
        Set<Character> uniques = new HashSet<>();

        while (endPointer < str.length()){
            if (uniques.add(str.charAt(endPointer))){   // if it has in the hashset returns false
                endPointer++;
                biggestLength = Math.max(biggestLength, uniques.size()); // finds the bigger one
            }else{
                uniques.remove(str.charAt(startPointer)); // remove till the unique one.
                startPointer++;
            }
        }
        return biggestLength;
    }
}
