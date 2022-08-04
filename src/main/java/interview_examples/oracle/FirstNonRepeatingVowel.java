package main.java.interview_examples.oracle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        System.out.println("firstNonRepeatingVowel(\"sdasaedifiibobocusut\") = " + firstNonRepeatingVowel("sdasaedifiibobocusut"));
        System.out.println("getFirstNonRepeatingVowel(\"sdasaedifiibobocusut\") = " + getFirstNonRepeatingVowel("sdasaedifiibobocusut"));
    }
    public static Character firstNonRepeatingVowel(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                if (!map.containsKey(chars[i])){
                    map.put(chars[i], i);
                }else map.put(chars[i], -1);
            }
        }
        int min = str.length();
        for (Integer entry: map.values()){
            if (entry < min && entry != -1){
                min = entry;
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == min){
                return entry.getKey();
            }
        }
        return null;
    }

    static int getFirstNonRepeatingVowel(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)) {
                    map.put(ch, i);
                } else {
                    map.put(ch, -1);
                }
            }
        }
        for (Integer value : map.values()) {
            if (value >= 0) {
                return value;
            }
        }
        return -1;
    }
}
