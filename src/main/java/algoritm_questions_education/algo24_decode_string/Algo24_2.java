package main.java.algoritm_questions_education.algo24_decode_string;

import java.util.Stack;

public class Algo24_2 {

    public static void main(String[] args) {

        //String str = "3[a]2[bc]";
        //String str = "3[a2[c]]";
        //String str = "2[abc]3[cd]ef";
        //String str = "abccdef";
        String str = "fr2[abc]3[cd]ef4[asd]der.";
        System.out.println("decodeString(str) = " + decodeString(str));

    }

    public static String decodeString(String s) {

        Stack<Integer> numbers = new Stack<>();
        Stack<String> letters = new Stack<>();
        String resultString = "";
        //String tempString = "";
        int repeatTimes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { // if digit, counting repeat times
                repeatTimes = s.charAt(i) - 48;
                numbers.push(repeatTimes);
            }else if (s.charAt(i) == '[') {        // if [, pushing result string to the letters' stack
                letters.push(resultString);
                resultString = "";
            }else if (s.charAt(i) == ']') {         // if ], popping repeat times and calculating/adding to the string
                int k = numbers.pop();
                String tempString = letters.pop();
                for (int j = 0; j < k; j++) {
                    tempString += resultString;
                }
                resultString = tempString;
            }else {
                resultString += s.charAt(i);        // if alphabetic, then adding it
            }
        }
        return resultString;
    }
}

