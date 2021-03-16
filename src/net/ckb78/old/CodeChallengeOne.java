package net.ckb78.old;

public class CodeChallengeOne {
    public static void main(String[] args) {
        System.out.println("SHOPPING LIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free Range\n\t- Bread\n");
        cake();
        countDown();
        sharkWeek();
    }

    public static void cake() {
        System.out.println("The");
        System.out.println("\tCake");
        System.out.println("Is\t\t\tA");
        System.out.println("\tLie.\n");
    }

    public static void countDown() {

        for (int i = 3; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void sharkWeek() {
        System.out.print(3 % 3 + " ");
        System.out.print(4 % 3 + " ");
        System.out.print(5 % 3 + " ");
        System.out.print(6 % 3 + " ");
    }
}
