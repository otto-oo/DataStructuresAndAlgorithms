package main.java._032_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Optimum {
    public static void main(String[] args) {
        int number = romanToInt("XIX");
        System.out.println("number = " + number);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();

        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);

        int total = 0, carry = valueMap.get(s.charAt(0));

        for(int index = 1; index < s.length(); index++) {
            int value = valueMap.get(s.charAt(index));
            if(carry >= value) {
                total += carry;
            } else {
                total -= carry;
            }
            carry = value;
        }
        if(carry != 0) {
            total += carry;
        }
        return total;
    }
}
