package net.ckb78;

/*
An ordered sequence of numbers from 1 to N is given. One number might have deleted from it, then the
remaining numbers were mixed. Find the number that was deleted.

Example:
The starting array sequence is [1,2,3,4,5,6,7,8,9]
The mixed array with one deleted number is [3,2,4,6,7,8,1,9]
Your function should return the int 5.

If no number was deleted from the array and no difference with it, your function should return the int 0.
Note: N may be 1 or less (in the latter case, the first array will be []).
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {

    public static void main(String[] args) {

        System.out.println(FindMissingNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8})); // 5
        System.out.println(FindMissingNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3})); // 0
        System.out.println(FindMissingNumber(new int[]{1,2,3,4,5}, new int[]{3,4,1,5})); // 2

        System.out.println(FindMissingNumberComplex(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8})); // 5
        System.out.println(FindMissingNumberComplex(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3})); // 0
        System.out.println(FindMissingNumberComplex(new int[]{1,2,3,4,5}, new int[]{3,4,1,5})); // 2
    }

    public static int FindMissingNumber(int[] arr, int[] mixedArr) {
        return IntStream.of(arr).sum() - IntStream.of(mixedArr).sum();
    }

        public static int FindMissingNumberComplex(int[] arr, int[] mixedArr) {
        if (arr.length > 0 && mixedArr.length > 0) {
            List<Integer> sortedMixed = Arrays.stream(mixedArr).boxed().collect(Collectors.toList());
            Collections.sort(sortedMixed);
            for (int i = 0; i < arr.length; i++) {
                if (i == mixedArr.length) {
                    return arr[i];
                }
                else if (arr[i] != (int)sortedMixed.get(i))
                    return arr[i];
            }
        } else if (arr.length == 1) {
            return arr[0];
        }
        return 0;
    }
}
