package net.ckb78.old;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodeChallengeFour {

    public static void main(String[] args) {

        // Exercise one
        System.out.println("\nExercise one:");
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

        // Exercise two
        System.out.println("\nExercise two:");
        int count = 1;
        for(int i = 1; i < 41; i++){

            System.out.println(i);
            if (count == 3){
                System.out.println("Quack!");
                count = 0;
            }
                        count++;
        }

        // Exercise three
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExercise three:\n");
        System.out.print("Please enter password: ");
        String input = scanner.next();
        while(!input.equals("shark50")){
            System.out.println("Invalid password! ");
            System.out.print("Please enter password: ");
            input = scanner.next();
        }
        System.out.println("Access granted!");

        // Exercise four
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // Exercise five
        System.out.println("\nExercise five:\n");
        System.out.println("\n *** Number guessing game! ***\n");
        String play = "y";
        while (play.equals("y")){
            int tries = 10;
            int usedTries = 0;
            int num = ThreadLocalRandom.current().nextInt(1,101);
            int correctGuess = 0;
            System.out.println("I am thinking of a number between 1 and 100.");

            while(tries > 0) {

                System.out.print("\nEnter your guess: ");
                int guess = scanner.nextInt();

                usedTries++;
                    if (guess == num){
                        System.out.format("You guessed correct after %d tries.", usedTries);
                        correctGuess = 1;
                        break;
                    }
                    else{
                        tries--;
                        if(guess > num){
                            System.out.format("The number I am thinking of is lower than %d. ", guess);
                            System.out.format("\nYou have %d tries left to guess the number. ", tries);
                        }
                        else{
                            System.out.format("The number I am thinking of is higher than %d. ", guess);
                            System.out.format("\nYou have %d tries left to guess the number. ", tries);
                        }
                    }
            }
            if (correctGuess == 0) {
                System.out.format("\nThe correct number was %d.", num);
            }

            System.out.println("\n\nDo you want to play again? y/n ");
            play = scanner.next();
        }

    }
}
