package net.ckb78.old;/*
Arithmetic mean

Use the keyboard to enter numbers, and then calculate the arithmetic mean.
If the user enters -1, display the arithmetic mean of all entered numbers and end the program.
-1 should not be included in the calculation.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticMean {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double num = 0, counter = 0, sum = 0;
        while (num != -1) {
            num = Double.parseDouble(reader.readLine());
            if (num != -1) {
                sum = sum + num;
                counter++;
            }
        }
        System.out.println(sum / counter);
    }
}