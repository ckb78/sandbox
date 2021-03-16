package net.ckb78.old;/*
Adding

Use the keyboard to enter numbers.
If the user enters -1, display the sum of all entered numbers and end the program.
-1 should be included in the sum.

*/

import java.io.*;

public class AddingMinusOne {
    public static void main(String[] args) throws Exception {
        int sum = 0, num = 0;
        while (num != -1) {
         num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}