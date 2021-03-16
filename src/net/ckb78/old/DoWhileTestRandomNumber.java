package net.ckb78.old;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class DoWhileTestRandomNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rollAgain;

        System.out.println("Welcome to Christian's D6 dice simulator!");

        do {
            int num = ThreadLocalRandom.current().nextInt(1,7);
            System.out.println("You rolled a " + num + ".");
            System.out.println("Roll again? y/n ");
            rollAgain = scanner.next();
        } while (rollAgain.equals("y"));

        // Alternatively, anything other than n returns True
        // } while (!rollAgain.equals("n"));

    }
}
