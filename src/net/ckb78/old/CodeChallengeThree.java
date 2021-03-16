package net.ckb78.old;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodeChallengeThree {
 int z = 34;

    public static void main(String [] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Do you want to run the number comparison (1) or the guessing game(2)? 1/2 ");
        int choice = userInput.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Please enter a whole number: ");
                int x = userInput.nextInt();
                System.out.print("Please enter another whole number: ");
                int y = userInput.nextInt();

                if (x > y) {
                    System.out.println(x + " is the bigger number.");
                    System.out.println("Difference between " + x + " and " + y + " are " + (x - y) + ".");
                } else if (x < y) {
                    System.out.println(y + " is the bigger number.");
                    System.out.println("Difference between " + y + " and " + x + " are " + (y - x) + ".");
                } else {
                    System.out.println((x + " and " + y + " are equal."));
                }
                 break;
            case 2:
                int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

                System.out.print("Please guess a number between 1 and 5. You have two tries: ");
                int guess = userInput.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Correct at first try!");
                }
                else {
                    System.out.println("Wrong guess. You have one more try. Enter your guess: ");
                    guess = userInput.nextInt();

                    if (guess == randomNumber){
                        System.out.println("Correct! About time!");   }
                     else {
                        System.out.println("Wrong again! Maybe next time.");
                    }
                }
                break;

            default:
                System.out.println("Invalid response.");
        }
    }
}

