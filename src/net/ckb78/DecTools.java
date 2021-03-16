package net.ckb78;

public class DecTools {

    /*
    Determine the total number of digits in the integer (n>=0) given as input to the function.
    For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.
    All inputs will be valid.
     */

    public static void main(String[] args) {
        System.out.println(digits(12345612347L));
    }

    public static int digits(long n) {
        return ("" + n).length();
    }
}
