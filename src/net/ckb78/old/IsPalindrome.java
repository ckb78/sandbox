public class IsPalindrome {

    public static boolean isPalindrome(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i))
                return false;
        }
        return true;
    }
}