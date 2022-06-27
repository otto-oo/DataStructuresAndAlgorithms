package main.java.algoritm_questions_education.algo23_balanced_brackets;

import java.util.Stack;

public class Algo23_2 {

    public static void main(String[] args) {

        //String str = "(}[])() 5, ;{cy}(de(o))()()";
        String str = "(})";
        //String str = "(c)";
        //String str = "(([c]))";

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
            }else{
                switch (str.charAt(i)){                                             // check for closings
                    case ')':
                        if (stack.isEmpty()){
                            return false;
                        }else if (stack.peek()=='('){
                            stack.pop();
                            break;
                        }else stack.push(str.charAt(i));
                    case ']':
                        if (stack.isEmpty()){
                            return false;
                        }else if (stack.peek()=='['){
                            stack.pop();
                            break;
                        }else stack.push(str.charAt(i));
                    case '}':
                        if (stack.isEmpty()){
                            return false;
                        }else if (stack.peek()=='{'){
                            stack.pop();
                            break;
                        }else stack.push(str.charAt(i));
                    default:            // check for other characters
                        i++;
                        continue;
                }
                i++;
            }
        }
        return (stack.isEmpty());
    }
}

/*
in while go with all string chars.
if with checking char is opening brackets then push to the stack
if it is closing brackets pop from stack and check with char.
if it is matching with the char then go to the next char,
if it stack is empty return false.
finally, if stack is empty return true.
 */