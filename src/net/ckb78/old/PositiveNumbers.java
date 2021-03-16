package net.ckb78.old;/*
Positive number

Use the keyboard to enter three integers. Display the number of positive numbers in the original set.

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            list.add(new Scanner(System.in).nextInt());
        }

        for (Integer i : list) {
            if (i > 0)
                counter++;
        }
        System.out.println(counter);
    }
}
