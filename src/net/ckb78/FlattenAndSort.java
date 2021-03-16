package net.ckb78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlattenAndSort {

    /*
    Challenge:

    Given a two-dimensional array of integers, return the flattened version of the array with all the
    integers in the sorted (ascending) order.

    Example:

    Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
     */
    public static void main(String[] args) {
    int[][] array = {{3, 2, 1}, {4, 5, 6}, {}, {9, 7, 8}};
        System.out.println(Arrays.toString(flattenAndSort(array)));
    }

    public static int[] flattenAndSort(int[][] array) {
        List<Integer> flatList = new ArrayList<>();
        for (int[] arr : array) {
            for (int num : arr) {
                flatList.add(num);
            }
        }
        Collections.sort(flatList);
        int[] retArr = new int[flatList.size()];
        for (int i = 0; i < flatList.size(); i++) {
            retArr[i] = flatList.get(i);
        }
        return retArr;
    }
}
