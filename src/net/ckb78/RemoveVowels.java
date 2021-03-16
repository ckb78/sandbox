package net.ckb78;

public class RemoveVowels {

    public static void main(String[] args) {
        System.out.println(disEmVowel("This website is for losers LOL!"));
    }

    public static String disEmVowel(String str) {
        str = str.replaceAll("[aeiouAEIOU]", "");
        return str;
    }
}
