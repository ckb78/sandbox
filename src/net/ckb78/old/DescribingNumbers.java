/* 
Describing numbers

Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
"even single-digit number" - if the number is even and has one digit,
"odd single-digit number" - if the number is odd and has one digit,
"even two-digit number" - if the number is even and has two digits,
"odd two-digit number" - if the number is odd and has two digits,
"even three-digit number" - if the number is even and has three digits,
"odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.

*/

import java.util.Scanner;

public class DescribingNumbers {
    public static void main(String[] args){
        int num = new Scanner(System.in).nextInt();
        int length = new String("" + num).length();

        String evenOdd = (num % 2 == 0) ? "even " : "odd ";
        String digits = "three-digit ";
        if (length != 3)
            digits = (length == 1) ? "single-digit " : "two-digit ";

        if (num <= 999 && num >= 1)
            System.out.println(evenOdd + digits + "number");
    }
}