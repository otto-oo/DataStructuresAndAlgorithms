package main.java.hacker_ranks.count_groups;

import java.util.Arrays;
import java.util.List;

public class CountGroups {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("110", "110", "001");
        System.out.println("countGroups(list) = " + countGroups(list));
    }

    public static int countGroups(List<String> arrayList){
        if (null == arrayList || arrayList.isEmpty()) {
            return 0;
        }
        int count = 0;
        int[][] isConnected = new int[arrayList.size()][arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {                                        // create a 2 dimensional int array and update all values
            String row = arrayList.get(i);                                                  // row = "110" / "110" / "001"
            for (int j = 0; j < row.length(); j++) {
                // isConnected[i][j] = (row.charAt(j) - '0'); //Working
                isConnected[i][j] = Integer.parseInt(Character.toString(row.charAt(j)));
            }
        }

        boolean[] isReached = new boolean[isConnected.length];                              // isReached = {false, false, false}
        for (int i = 0; i < isConnected.length; i++) {
            if (!isReached[i]) {                                                            // isReached[0] = false, !isReached[0] = true
                alignedGroups(isConnected, isReached, i);                                   // i = 0
                count++;
            }
        }
        return count;
    }

    private static void alignedGroups(int[][] isConnected, boolean[] isReached, int v) {
        isReached[v] = true;                                                                // isReached[0] = true -> isReached = {true, false, false}
                                                                                            // v = 0
        for (int i = 0; i < isConnected.length; i++) {                                      // i = 0
            if (isConnected[v][i] == 1 && !isReached[i])                                    // isConnected[0][0] == 1 && !isReached[0] = false
                alignedGroups(isConnected, isReached, i);                                   // isConnected[0][1] == 1 && !isReached[0] = false
        }
    }
}
