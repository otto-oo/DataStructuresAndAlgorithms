package main.java.code_wars.two_joggers;

import java.util.Arrays;

public class TwoJoggers {
    public static void main(String[] args) {
        System.out.println("nbrOfLaps(5,3) = " + Arrays.toString(nbrOfLaps(5, 3)));
        System.out.println("nbrOfLaps(4,6) = " + Arrays.toString(nbrOfLaps(4, 6)));
    }
    public static int[] nbrOfLaps(int first, int second) {
        int[] result = new int[2];
        int i = 1 , j = 1;
        while (i <= second) {
            if (i * first < j * second) {               // whichever less i++
                i++;
            } else if (i * first > j * second) {        // whichever less j++
                j++;
            } else {                                    // else
              result[0] = i;
              result[1] = j;
              break;
            }
        }
        return result;
    }

    // JavaScript Solution
    /*var nbrOfLaps = function (x, y) {
        var result = Array(2).fill(0);
        var i = 1;
        var j = 1;
        while (i <= y)
        {
            if (i * x < j * y)
            {
                // whichever less i++
                i++;
            }
            else if (i * x > j * y)
            {
                // whichever less j++
                j++;
            }
            else
            {
                // else
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        return result;
    }*/
}
