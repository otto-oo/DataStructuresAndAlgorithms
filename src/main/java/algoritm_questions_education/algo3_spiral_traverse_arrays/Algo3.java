package main.java.algoritm_questions_education.algo3_spiral_traverse_arrays;

import java.util.ArrayList;
import java.util.List;

public class Algo3 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7},};

        System.out.println("spiralTraverse(array) = " + spiralTraverse(array));
    }

    // O(n) time | O(n) space - where n is the total number of elements in the array
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        spiralFill(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }

    public static void spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol, ArrayList<Integer> result) {
        if (startRow > endRow || startCol > endCol) {
            return; // termination
        }
        for (int col = startCol; col <= endCol; col++) {
            result.add(array[startRow][col]);
        }
        for (int row = startRow + 1; row <= endRow; row++) {
            result.add(array[row][endCol]);
        }
        for (int col = endCol - 1; col >= startCol; col--) {
            if (startRow == endRow) break;
                result.add(array[endRow][col]);
        }
        for (int row = endRow - 1; row >= startRow + 1; row--) {
            if (startCol == endCol) break;
                result.add(array[row][startCol]);
        }
        //calling method recursively again
            spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
        }
}
