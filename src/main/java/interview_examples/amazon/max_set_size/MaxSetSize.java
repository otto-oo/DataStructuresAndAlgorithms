package main.java.interview_examples.amazon.max_set_size;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSetSize {

    public static void main(String[] args) {
        List<Integer> ricebags = Arrays.asList(3,6,4,2,16);
        System.out.println("maxSetSize(ricebags) = " + maxSetSize(ricebags));
    }

    public static int maxSetSize(List<Integer> riceBags) {
        Set<Integer> riceSet = new HashSet<>(riceBags);

        int longestStreak = 1;

        for (int rice : riceSet) {
            int powerOfRice = rice * rice;
            int currentStreak = 1;
            if (riceSet.contains(powerOfRice)) {
                currentStreak++;
                while (riceSet.contains(powerOfRice * powerOfRice)) {
                    currentStreak++;
                    powerOfRice = powerOfRice * powerOfRice * powerOfRice * powerOfRice;
                }
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak == 1 ? -1 : longestStreak;
    }
}
