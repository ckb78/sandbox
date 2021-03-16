package net.ckb78;
import java.util.Arrays;

public class ShortestWord {

    public static void main(String[]args){
        System.out.println(findShort("Bamboozled snoozy whezzed better mornings"));
    }

    public static int findShort(String s) {
        String[] words = s.split(" ");
        String shortestWord = words[0];
        for (String word : words) {
            shortestWord = (word.length() < shortestWord.length()) ? word : shortestWord;
        }
        return shortestWord.length();
    }
}
