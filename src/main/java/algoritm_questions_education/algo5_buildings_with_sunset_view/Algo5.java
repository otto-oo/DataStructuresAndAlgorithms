package main.java.algoritm_questions_education.algo5_buildings_with_sunset_view;

import java.util.ArrayList;
import java.util.Stack;

public class Algo5 {
    public static void main(String[] args) {
        System.out.println("WEST");
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"WEST").forEach(System.out::println);

        System.out.println("EAST");
        sunsetViews(buildings,"EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if(buildings.length == 0) {
            return result;
        }
        if(direction.equals("WEST")){
            int i = 0;
            stack.push(0);
            result.add(0);                                      // first indicy needs to be inside the result
            while(i+1 < buildings.length){
                if(buildings[stack.peek()] < buildings[i+1]){
                    stack.pop();
                    stack.push(i+1);
                    result.add(i+1);
                    i++;
                }else {
                    i++;
                    continue;
                }
            }
        }else if(direction.equals("EAST")) {
            int i = buildings.length-1;
            stack.push(buildings.length-1);
            result.add(buildings.length-1);                     // first indicy needs to be inside the result
            while(i >= 1){
                if(buildings[stack.peek()] < buildings[i-1]){
                    stack.pop();
                    stack.push(i-1);
                    result.add(0,i-1);          // to be sorted
                    i--;
                }else {
                    i--;
                    continue;
                }
            }
            /*int[] reverseBuildings = new int[buildings.length];     // different approach
            for (int i = 0; i < reverseBuildings.length; i++) {
                reverseBuildings[i] = buildings[buildings.length - i - 1];
            }
            result = sunsetViews(reverseBuildings, "WEST");
            Collections.reverse(result);                            // to be able to sort
            for (int i = 0; i < result.size(); i++){
                result.set(i, (reverseBuildings.length - 1 - result.get(i)));
            }*/
        }
        return result;
    }
}
