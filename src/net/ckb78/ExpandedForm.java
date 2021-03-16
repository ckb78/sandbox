package net.ckb78;

/*
Write Number in Expanded Form
You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpandedForm {
    public static void main(String[] args) {

        System.out.println((expandedForm(70304).equals("70000 + 300 + 4") ? "Yup!" : "nope!"));
        System.out.println((expandedForm(42).equals("40 + 2") ? "Yup!" : "nope!"));
        System.out.println((expandedForm(12).equals("10 + 2") ? "Yup!" : "nope!"));
        System.out.println((expandedForm(9004000).equals("9000000 + 4000") ? "Yup!" : "nope!"));

        System.out.println((modernExpandedForm(70304).equals("70000 + 300 + 4") ? "Yup!" : "nope!"));
        System.out.println((modernExpandedForm(42).equals("40 + 2") ? "Yup!" : "nope!"));
        System.out.println((modernExpandedForm(12).equals("10 + 2") ? "Yup!" : "nope!"));
        System.out.println((modernExpandedForm(9004000).equals("9000000 + 4000") ? "Yup!" : "nope!"));
    }

    public static String expandedForm(int num) {
        String numStr = ("" + num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            StringBuilder currNum = new StringBuilder();
            currNum.append(Integer.parseInt(numStr.charAt(i) + ""));
            for (int j = 0; j < (numStr.length() -i -1) ; j++) {
                currNum.append("0");
            }
            if (!currNum.toString().startsWith("0"))
            sb.append((i < numStr.length() -1) ? Integer.parseInt(currNum.toString()) + " + " : Integer.parseInt(currNum.toString()));
        }
        String returnString = sb.toString();
        return (returnString.endsWith(" + ")) ? returnString.substring(0, returnString.length() - 3) : returnString;
    }

    public static String modernExpandedForm(int num) {
        return IntStream.range(0, String.valueOf(num).length())
                .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) ) * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
                .filter(x -> !x.equals("0"))
                .collect(Collectors.joining(" + "));
    }
}
