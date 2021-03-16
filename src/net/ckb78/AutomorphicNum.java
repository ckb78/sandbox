package net.ckb78;

public class AutomorphicNum {
    /*
    Definition
    A number is called Automorphic number if and only if its square ends in the same digits as the number itself.

    Task
    Given a number determine if it Automorphic or not .
     */
    public static void main(String[] args) {
        System.out.println((autoMorphic(1).equals("Automorphic")) ? "Yep" : "Nope");
        System.out.println((autoMorphic(3).equals("not!!")) ? "Yep" : "Nope");
        System.out.println((autoMorphic(6).equals("Automorphic")) ? "Yep" : "Nope");
        System.out.println((autoMorphic(9).equals("not!!")) ? "Yep" : "Nope");
    }

    public static String autoMorphic(int number) {
        return ((number * number + "").endsWith(number + "")) ? "Automorphic" : "not!!";
    }
}

