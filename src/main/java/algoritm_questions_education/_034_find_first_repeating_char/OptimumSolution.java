package main.java.algoritm_questions_education._034_find_first_repeating_char;

import java.util.HashSet;
import java.util.Set;

public class OptimumSolution {

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("a green apple"));
    }

    // time complexity O(n), space complexity O(n)
    public static char findFirstNonRepeatingChar(String str){
        // create set for char
        Set<Character> set = new HashSet<>();
        // O(n)
        var chars= str.toCharArray();
        // O(n)
        for(Character ch : chars) {
            if (set.contains(ch)) {
                return ch;
            }else set.add(ch);                              // first time we see ch
        }
        // O(n) + O(n) = O(2n) => O(n) time complexity
        return Character.MIN_VALUE;
    }
}
