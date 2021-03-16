package net.ckb78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Complete the method which accepts an array of integers, and returns one of the following:

"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one correct answer.
 */

public class IsSortedAndHow {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        int[] b = {4, 3, 2, 1, 0};
        int[] c = {1, 5, 3, 2, 6};
        int[] d = {2, 5, 7, 2, 3, 8, 9, 3, 1, 3, 4, 7, 4, 2, 3, 6, 5};
        int[] e = {16, 13, 12, 11, 9, 8, 7, 3, 3, 2, 2, 2, 2, 1, 1, 0, 0};

        System.out.println(isSortedAndHow(a));
        System.out.println(isSortedAndHow(b));
        System.out.println(isSortedAndHow(c));
        System.out.println(isSortedAndHow(d));
        System.out.println(isSortedAndHow(e));
    }


    public static String isSortedAndHow(int[] array) {
        boolean firstIsSmaller = array[0] < array[array.length - 1];
        List<Integer> integerList = new ArrayList<>();
        for (int i : array)
        {
            integerList.add(i);
        }
        if (!firstIsSmaller) Collections.reverse(integerList);

        for (int i = 0; i < integerList.size(); i++) {
            if (i != integerList.size() -1) {
                if (integerList.get(i) > integerList.get(i+1)){
                    return "no";
                }
            }
        }
        return (firstIsSmaller) ? "yes, ascending" : "yes, descending";
    }
}
