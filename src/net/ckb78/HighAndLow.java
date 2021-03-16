package net.ckb78;

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */

import java.util.Arrays;
import java.util.List;

public class HighAndLow {

    public static void main(String[] args) {

        if (oldSchoolHighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4").equals("42 -9"))
            System.out.println("Yup.");
        else
            System.out.println("Nope.");

        if (modernHighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4").equals("42 -9"))
            System.out.println("Yup.");
        else
            System.out.println("Nope.");
    }

    public static String oldSchoolHighAndLow(String numbers) {
        List<String> numList = Arrays.asList(numbers.split(" "));
        int highest = Integer.parseInt(numList.get(0)), lowest = Integer.parseInt(numList.get(0));
        for (String num : numList) {
            if (Integer.parseInt(num) > highest)
                highest = Integer.parseInt(num);
            if (Integer.parseInt(num) < lowest)
                lowest = Integer.parseInt(num);
        }
        return highest + " " + lowest;
    }

    public static String modernHighAndLow(String numbers) {
        int highest = Arrays.stream(numbers.split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .max()
                .getAsInt();
        int lowest = Arrays.stream(numbers.split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .min()
                .getAsInt();
        return String.format("%d %d", highest, lowest);
    }
}
