package net.ckb78.old;

// Task: Create code to find out if a word is a palindrome.

public class Palindrome {
    public static void main(String[] args) {

        // Word to test:
        String word = "onna";

        System.out.println(word + " is a palindrome: " + isPalindrome(word));
    }

    static boolean isPalindrome(String word){
        word = word.toUpperCase();
        boolean retBool = true;
        int fromEnd = word.length() -1;
        int fromStart = 0;

        while(fromStart < fromEnd){
            if(word.charAt(fromEnd) != word.charAt(fromStart)){
                retBool = false;
            }
                fromEnd--;
                fromStart++;
        }
      return retBool;
    }
}
