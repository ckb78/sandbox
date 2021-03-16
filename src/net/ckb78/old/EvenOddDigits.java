package net.ckb78.old;

import java.io.*;

/* 
Even and odd digits

Use the keyboard to enter a positive number. Determine the number of even digits and odd digits in the entered number.
If a number is divisible by 2 without a remainder (i.e. the remainder is zero), then it is even.
And we'll increase the even digit counter (static variable even) by 1.
Otherwise, the number is odd, so we'll increase the odd digit counter (static variable odd).
Display the following message: "Even: a Odd: b", where a is the number of even digits and b is the number of odd digits.

Example for 4445:
Even: 3 Odd: 1
*/

public class EvenOddDigits {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Integer.parseInt(input.substring(i, i+1));
        }

        for (int number: numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}