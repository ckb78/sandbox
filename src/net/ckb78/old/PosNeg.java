package net.ckb78.old;/*
Positive and negative numbers
Use the keyboard to enter three integers. Display the number of positive numbers and the number of negative numbers in the original set, in the following form:
"Number of negative numbers: a" and "Number of positive numbers: b", where a and b are the unknowns.

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) throws Exception {
        //write your code here
        List<Integer> intList = new ArrayList<>();
        int negNums = 0, posNums = 0;
        for (int i = 0; i < 3; i++) {
            intList.add(new Scanner(System.in).nextInt());
        }

        for (Integer integer: intList) {
            if (integer > 0)
                posNums++;
            else if (integer < 0)
                negNums++;
        }

        System.out.println("Number of negative numbers: " + negNums + "\nNumber of positive numbers: " + posNums);
    }
}