package main.java.interview_examples.oracle;

import java.util.HashMap;
import java.util.Map;

/*

You have ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun") for days.

k is an integer

You should implement given String day after k days.

Return String of day..

 */

public class Days {
    public static void main(String[] args) {
        System.out.println("days(\"Wed\", 10) = " + days("Wed", 10));
    }

    public static String days(String day, int k){
        int numberOfDay = daysMap().get(day);
        k = (k + numberOfDay) % 7;
        for (Map.Entry<String, Integer> entry: daysMap().entrySet()) {
            if (entry.getValue().equals(k)){
                day = entry.getKey();
                break;
            }
        }
        return day;
    }

    private static Map<String, Integer> daysMap(){
        Map<String, Integer> daysMap = new HashMap<>();
        daysMap.put("Mon", 0);
        daysMap.put("Tue", 1);
        daysMap.put("Wed", 2);
        daysMap.put("Thu", 3);
        daysMap.put("Fri", 4);
        daysMap.put("Sat", 5);
        daysMap.put("Sun", 6);
        return daysMap;
    }
}
