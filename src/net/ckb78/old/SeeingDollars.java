package net.ckb78.old;/*
Seeing dollars in your future
Use a while loop to display a 10x10 square of dollar signs.
Don't separate the symbols in each line.

*/

import java.io.*;

public class SeeingDollars {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 0, j;
        while (i < 10) {
            j = 0;
            while (j < 10){
                    System.out.print("$");
                j++;
            }
            i++;
            if (i < 10)
                System.out.print("\n");
        }
    }
}