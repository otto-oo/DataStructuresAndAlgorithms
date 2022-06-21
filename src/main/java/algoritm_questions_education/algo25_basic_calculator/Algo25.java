package main.java.algoritm_questions_education.algo25_basic_calculator;

import java.util.Stack;

public class Algo25 {

    public static void main(String[] args) {

        //String s = " 8-5+3+5 * 2 / 5 + 6 / 3 *6";
        //String s = "3+2*2";
        //String s = " 3/2 ";
        //String s = " 3+5 / 2 ";
        String s = "5-3+2";
        System.out.println(basicCalculator(s));
    }

    public static int basicCalculator(String s){

        int result = 0;
        Stack<String> stack = new Stack<>();
        Stack<String> stackTemp = new Stack<>();
        int temp = 0;
        boolean isDivide = false;
        boolean isMultiply = false;

        for (int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){                             // checking number if it is calculating or not
                if(isDivide){                                               // checking number if it is calculating in divide operation
                    temp = temp / Integer.parseInt(s.valueOf(s.charAt(i)));
                    stack.push(Integer.toString(temp));
                    temp = 0;
                    isDivide = false;
                }else if (isMultiply){                                      // checking number if it is calculating in multiply operation
                    temp = temp * Integer.parseInt(s.valueOf(s.charAt(i)));
                    stack.push(Integer.toString(temp));
                    temp = 0;
                    isMultiply = false;
                }else stack.push(s.valueOf(s.charAt(i)));                   // if it is just number add to stack
            }else if (s.charAt(i)=='+' || s.charAt(i)=='-'){
                stack.push(s.valueOf(s.charAt(i)));
            }else{
                if(s.charAt(i)=='*'){                                       // checking if there is multiply operation, if it is going with multiply first.
                    temp = Integer.parseInt(stack.pop()) * 1;
                    isMultiply = true;
                    continue;
                }else if(s.charAt(i)=='/'){                                 // checking if there is divide operation, if it is going with divide first.
                    temp = Integer.parseInt(stack.pop()) / 1;
                    isDivide = true;
                    continue;
                }
            }
        }

        while(!stack.isEmpty()){                                            // using another stack to reverse stack
            stackTemp.push(stack.pop());
        }

        result = Integer.parseInt(stackTemp.pop());
        while (!stackTemp.isEmpty()){                                       // calculating numbers
            if(stackTemp.peek().equals("+")){
                stackTemp.pop();
                result = result + Integer.parseInt(stackTemp.pop());
            }else if(stackTemp.peek().equals("-")){
                stackTemp.pop();
                result = result - Integer.parseInt(stackTemp.pop());
            }
        }
        return result;
    }
}
