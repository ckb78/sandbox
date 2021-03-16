package net.ckb78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> filteredList = new ArrayList<>();

        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(n -> filteredList.add(n));

        System.out.println(filteredList);
    }
}
