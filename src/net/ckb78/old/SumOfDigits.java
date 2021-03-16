package net.ckb78.old;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int digits = String.valueOf(number).length();
        String numberString = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < digits ; i++) {
            String charAt = "" + numberString.charAt(i);
            sum = sum + Integer.parseInt(charAt);
        }
        return sum;
    }
}