package main.java.code_wars.array_diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] a = {1,2,2,3,3};
        int[] b = {2, 3};
        System.out.println("a.toString() = " + Arrays.toString(a));
        System.out.println("b.toString() = " + Arrays.toString(b));
        System.out.println("arrayDiff(a, b) = " + Arrays.toString(arrayDiff(a, b)));
        System.out.println("Arrays.toString(arrayDiffWithListRemoveAll(a,b)) = " + Arrays.toString(arrayDiffWithListRemoveAll(a, b)));
        System.out.println("Arrays.toString(arrayDiffWithStreamFilter(a,b)) = " + Arrays.toString(arrayDiffWithStreamFilter(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        ArrayList<Integer> resultList = new ArrayList<>();
        Arrays.sort(b);
        for (int element : a) {
            if (Arrays.binarySearch(b, element) < 0)
                resultList.add(element);
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    public static int[] arrayDiffWithListRemoveAll(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream()
                .mapToInt(e -> e)
                .toArray();
    }

    public static int[] arrayDiffWithStreamFilter(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(each -> !(Arrays.stream(b).boxed().collect(Collectors.toList())).contains(each))
                .toArray();
    }
}
