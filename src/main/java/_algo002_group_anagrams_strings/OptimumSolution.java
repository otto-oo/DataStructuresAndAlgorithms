package main.java._algo002_group_anagrams_strings;

import java.util.*;

public class OptimumSolution {

    public static void main(String[] args) {

        String[] words = {"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
        System.out.println("groupAnagramStrings(words) = " + groupAnagramStrings(words));

    }

    // time complexity ??????, space complexity ????
    public static List<List<String>> groupAnagramStrings(String[] words){
        Map<String, List<String>> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++){
            char[] charArray = words[i].toCharArray();              // converting to char array
            Arrays.sort(charArray);                                 // sorting
            String sortedWord = new String(charArray);
            wordMap.putIfAbsent(sortedWord, new ArrayList<>());     // putting sorted word inside the map as a key if it is not associated any value inside keys
            wordMap.get(sortedWord).add(words[i]);                  // getting sorted word and adding actual word inside the array list
        }
        return new ArrayList<>(wordMap.values());                   // returning just
    }
}
