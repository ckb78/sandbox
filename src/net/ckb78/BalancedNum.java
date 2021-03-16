package net.ckb78;

public class BalancedNum {
    /*
    Definition
    Balanced number is the number that * The sum of all digits to the left of the middle digit(s) and
    the sum of all digits to the right of the middle digit(s) are equal*.

    Task
    Given a number, Find if it is Balanced or not .
     */

    public static void main(String[] args) {
//         System.out.println(balancedNum(2122502122));
        System.out.println(balancedNum(212252212));
    }

    public static String balancedNum(long number) {
        String num = "" + number;
        int[] sums = {0, 0};
        int sumIndex = 0;
        boolean even = (num.length() % 2 == 0);
        String leftPart = (even) ? num.substring(0, num.length() / 2 - 1) : num.substring(0, num.length() / 2);
        String rightPart = (even) ? num.substring(num.length() / 2 + 1) : num.substring(num.length() / 2 + 1);

        for (String string : new String[]{leftPart, rightPart}) {
            for (int i = 0; i < string.length(); i++) {
                sums[sumIndex] += Integer.parseInt("" + string.charAt(i));
            }
            sumIndex++;
        }
        return (sums[0] == sums[1]) ? "Balanced" : "Not Balanced";
    }
}
