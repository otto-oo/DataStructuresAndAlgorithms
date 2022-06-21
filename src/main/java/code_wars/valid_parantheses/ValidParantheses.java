package main.java.code_wars.valid_parantheses;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str = "()())";
        System.out.println("validParentheses(str) = " + validParentheses(str));
    }
    public static boolean validParentheses(String parens) {
        //Put code below
        int index = 0;
        Stack<Character> stack = new Stack();
        while(index < parens.length()){
            if(parens.charAt(index) != ')' && parens.charAt(index) != '('){
                index++;
                continue;
            }
            if (parens.charAt(0) == ')'){                            // if first char is ")" return 0;
                return false;
            }
            if (parens.charAt(index) == '('){                        // if char is "(", always push to stack
                stack.push(parens.charAt(index));
                index++;
                continue;
            }else if (parens.charAt(index) == ')'){                  // if char is ")"
                if (stack.empty()){                             // check if stack is empty
                    return false;                                   // so return 0
                }else if (stack.pop()=='('){
                    index++;
                    continue;
                }
            }
            index++;
        }
        return stack.empty();
    }
}
