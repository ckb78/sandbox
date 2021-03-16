package net.ckb78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class LargestFiveDigitNumber {

    public static void main(String[] args) {
        System.out.println(solve("1234567890")); // 67890
        System.out.println(solveWithStream("1234567890")); // 67890
        System.out.println(solveWithCollections("1234567890")); // 67890
    }

    private static int solveWithCollections(String digits) {
        ArrayList<Integer> fiveDigitNumbers = new ArrayList<>();
        for (int i = 0; i < digits.length()-4 ; i++) {
            fiveDigitNumbers.add(Integer.parseInt(digits.substring(i,i+5)));
        }
        return Collections.max(fiveDigitNumbers);
    }

    private static int solveWithStream(String digits) {
        return IntStream.range(0, digits.length() - 4)
                .mapToObj(i -> digits.substring(i, i + 5))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
    }

    public static int solve(final String digits) {
        ArrayList<Integer> fiveDigitNumbers = new ArrayList<>();
        for(int i = 0; i <digits.length() -4; i++)
            fiveDigitNumbers.add(Integer.parseInt(digits.substring(i, i+5)));
        int largestNumber = 0;
        for(Integer number : fiveDigitNumbers) {
            if (number > largestNumber)
                largestNumber = number;
        }
        return largestNumber;
    }
}