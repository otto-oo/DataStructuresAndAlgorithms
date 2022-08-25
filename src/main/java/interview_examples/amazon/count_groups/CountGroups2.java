package main.java.interview_examples.amazon.count_groups;

import java.util.Arrays;
import java.util.List;

public class CountGroups2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("110", "110", "001");
        System.out.println("countGroups(list) = " + countGroups(list));
    }

    public static int countGroups(List<String> arrayList){
        if (null == arrayList || arrayList.isEmpty()) {
            return 0;
        }
        int count = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            String row = arrayList.get(i);
            for (int j = 0; j < i; j++){


            }
        }
        return count;
    }

}
