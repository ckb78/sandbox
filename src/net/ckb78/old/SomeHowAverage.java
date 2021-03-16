package net.ckb78.old;/*
Somehow average
Use the keyboard to enter three numbers, and then display the middle number.
In other words, not the largest and not the smallest.
If all the numbers are equal, display any one of them.

Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The program should display the middle number of the three numbers.
4. If all the numbers are equal, display any one of them.
5. If two of the three numbers are equal, display either of the two.
*/

import java.io.*;

public class SomeHowAverage {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine()), b = Integer.parseInt(bufferedReader.readLine()), c = Integer.parseInt(bufferedReader.readLine()), midnum = a;
        if ((b < a && b > c) || (b > a && b < c))
            midnum = b;
        else if ((c < a && c > b) || (c > a && c < b))
            midnum = c;
        else if ((b == c))
            midnum = c;
        System.out.println(midnum);
    }
}