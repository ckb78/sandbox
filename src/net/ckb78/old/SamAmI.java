/* 
Sam I Am

*/

import java.util.Arrays;
import java.util.List;

public class SamAmI {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Sam", "I", "Am");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && k != j)
                        System.out.println(words.get(i) + words.get(j) + words.get(k));
                }
            }
        }
    }
}