package net.ckb78;


/*
Find the sum of the odd numbers within an array, after cubing the initial integers.
The function should return undefined/None/nil/NULL if any of the values aren't numbers.

Note: There are ONLY integers in the JAVA and C# versions of this Kata.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOddCubes {

    public static void main(String[] args) {

        if (cubeOdd(new int[] {1, 2, 3, 4}) == 28)
            System.out.println("Yup!");
        if (cubeOdd(new int[] {-3, -2, 2, 3}) == 0)
            System.out.println("Yup!");

        if (oldSchoolCubeOdd(new int[] {1, 2, 3, 4}) == 28)
            System.out.println("Yup1!");
        if (oldSchoolCubeOdd(new int[] {-3, -2, 2, 3}) == 0)
            System.out.println("Yup2!");
    }

    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .map(num -> num*num*num)
                .sum();
    }

    public static int oldSchoolCubeOdd(int arr[]) {
        int sum = 0;
        for (int num: arr) {
            if ((num*num*num) % 2 != 0)
                sum += (num*num*num);
        }
        return sum;
    }
}
