package net.ckb78;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

    public static void main(String[] args) {
        Integer[] one = {0, 0, 0, 1};
        System.out.println((ConvertBinaryArrayToInt(Arrays.asList(one)) == 1) ? "Yay!" : "Nope");
        Integer[] two = {0, 0, 1, 0};
        System.out.println((ConvertBinaryArrayToInt(Arrays.asList(two)) == 2) ? "Yay!" : "Nope");
        Integer[] three = {0, 0, 1, 1};
        System.out.println((ConvertBinaryArrayToInt(Arrays.asList(three)) == 3) ? "Yay!" : "Nope");
        Integer[] four = {0, 1, 0, 0};
        System.out.println((ConvertBinaryArrayToInt(Arrays.asList(four)) == 4) ? "Yay!" : "Nope");
        Integer[] nine = {1, 0, 0, 1};
        System.out.println((ConvertBinaryArrayToInt(Arrays.asList(nine)) == 9) ? "Yay!" : "Nope");
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        Collections.reverse(binary);
        int number = 0, multiplier = 1;
        for (int i = 0; i < binary.size(); i++) {
            number += ((binary.get(i) == 1) ? multiplier : 0);
            multiplier *= 2;
        }
        return number;
    }
}
