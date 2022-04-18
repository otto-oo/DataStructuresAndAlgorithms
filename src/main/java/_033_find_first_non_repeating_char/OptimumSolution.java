package main.java._033_find_first_non_repeating_char;

import java.util.HashMap;
import java.util.Map;

public class OptimumSolution {

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("a green apple"));
    }

    // time complexity O(n), space complexity O(n)
    public static char findFirstNonRepeatingChar(String str){ // like to LeetCode 387 First Unique Character in a String
        // create hashmap for char and its count
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        // O(n)
        var chars=str.toCharArray();
        // O(n)
        for(Character ch: chars) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            }else {// first time we see ch
                map.put(ch, 1);
            }
        }
        // O(n)
        for(Character ch: chars){
            if (map.get(ch) == 1) return ch;
        }
        // O(n) + O(n) + O(n) = O(3n) => O(n) time complexity
        return Character.MIN_VALUE;
    }
}
