package main.java.algo23_balanced_brackets;

import java.util.Stack;

public class Algo23 {

    public static void main(String[] args) {

        //String str = "([])(){}(())()()";
        //String str = "";
        String str = "c()";
        //String str = "[(])";

        System.out.println("isBalancedBrackets(string) = " + isBalancedBrackets(str));

    }

    public static boolean isBalancedBrackets(String str){

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < str.length()){

            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){ // check for openings
                stack.push(str.charAt(i));
                i++;
                continue;
            }
            if (stack.isEmpty()){                                               // if it is not opening and stack is empty return false;
                return false;
            }
            switch (str.charAt(i)){                                             // check for closings
                case ')':
                    if (stack.pop()=='('){
                        break;
                    }
                case ']':
                    if (stack.pop()=='['){
                        break;
                    }
                case '}':
                    if (stack.pop()=='{'){
                        break;
                    }
                default:
                    i++;
                    continue;
            }

            i++;
        }

        return (stack.isEmpty());
    }
}

/*
in while go with all string chars.
if with checking char is opening brackets then push to the stack
if it is closing brackets pop from stack and check with char.
if it is matching with the char then go to the next char,
if it is not matching return false.
finally, if stack is not empty return false.
 */