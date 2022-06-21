package main.java.code_wars.number_of_duplicated_letters;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDuplicatedLetters {
    public static void main(String[] args) {
        String str = "invisiBble";
        System.out.println("numberOfDuplicatedLetters(str) = " + numberOfDuplicatedLetters(str));
    }
    public static int numberOfDuplicatedLetters(String str){
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch: str.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (Integer val : map.values()){
            if (val >= 2){
                result++;
            }
        }
        return result;
    }
}
