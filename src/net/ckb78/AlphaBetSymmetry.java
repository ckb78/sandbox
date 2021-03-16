package net.ckb78;

import java.util.Arrays;

public class AlphaBetSymmetry {

    /*
    Consider the word "abode". We can see that the letter a is in position 1 and b is in position 2.
    In the alphabet, a and b are also in positions 1 and 2.
    Notice also that d and e in abode occupy the positions they would occupy in the alphabet, which are positions 4 and 5.

    Given an array of words, return an array of the number of letters that occupy their positions in the alphabet for each word.
    For example,

    solve(["abode","ABc","xyzD"]) = [4, 3, 1]
    See test cases for more examples.

    Input will consist of alphabet characters, both uppercase and lowercase. No spaces.

    Good luck!
     */

    public static void main(String[] args) {
        // Should return 6,5,7:
        System.out.println(Arrays.toString(AlphaBetSymmetry.solve(new String[]{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"})));
    }

    public static int[] solve(String[] arr){
        int[] retArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            char[] cArr = arr[i].toLowerCase().toCharArray();
            for (int j = 0; j < cArr.length; j++) {
                if (j == (int)cArr[j] - 97)
                    counter++;
            }
            retArr[i] = counter;
        }
        return retArr;
    }
}
