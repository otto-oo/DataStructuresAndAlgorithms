package main.java.algoritm_questions_education.algo10_reverse_string;

import java.util.Stack;

public class Algo10 {

    public static void main(String[] args) {

        String str = "Cydeo is the best!";

        System.out.println("reverseString(str) = " + reverseString(str));
    }

    public static String reverseString(String str){

        Stack<String> stack = new Stack<>();
        String word = "";
        String result = "";

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                if(stack.isEmpty() & word.isEmpty()){          // if space is very beginning
                    stack.push(String.valueOf(str.charAt(i)));
                }else if(!word.isEmpty()){                     // if space comes after a word
                    stack.push(word);
                    word = "";
                    stack.push(String.valueOf(str.charAt(i)));
                }
            }else {                                             // if it is a word
                word += String.valueOf(str.charAt(i));
            }
        }
        stack.push(word);                                       // last word to inside

        while(!stack.isEmpty()){                                // reversing via stack
            result += stack.pop();
        }

        return result;
    }
}
