import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GjetteSpill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n \t\t\t*** Tallgjettespill ***");

        String play = "j";
        while (play.equals("j")) {
            int tries = 5;
            int usedTries = 0;
            int num = ThreadLocalRandom.current().nextInt(1, 101);
            int correctGuess = 0;
            System.out.println("\n---------------------------------------------------------------------------");
            System.out.format("Jeg tenker på et tall mellom 1 og 100. Du har %d forsøk på å gjette riktig.", tries);

            while (tries > 0) {

                System.out.print("\n\nSkriv inn tallet du tror jeg tenker på: ");
                int guess = scanner.nextInt();

                usedTries++;
                if (guess == num) {
                    System.out.format("Korrekt! Tallet jeg tenkte på var %d! Du gjettet riktig etter %d forsøk.", num, usedTries);
                    correctGuess = 1;
                    break;
                } else {
                    tries--;
                    if (tries > 0) {
                        if (guess > num) {
                            System.out.format("Feil. Tallet jeg tenker på er lavere enn %d. ", guess);
                            System.out.format("\nDu har %d forsøk igjen. ", tries);
                        } else {
                            System.out.format("Feil. Tallet jeg tenker på er høyere enn %d. ", guess);
                            System.out.format("\nDu har %d forsøk igjen. ", tries);
                        }
                    }
                    else{
                        System.out.println("Feil. Du har ingen flere forsøk.");
                    }
                }
            }
            if (correctGuess == 0) {
                System.out.format("\nTallet jeg tenkte på var %d.", num);
            }

            System.out.print("\n\nVil du spille en gang til? j/n: ");
            play = scanner.next();
            int loop = 1;
            while (loop == 1){
                switch (play) {
                    case "J":
                        loop = 0;
                        play = "j";
                        break;
                    case "j":
                        loop = 0;
                        break;
                    case "N":
                        loop = 0;
                        break;
                    case "n":
                        loop = 0;
                        break;
                    default:
                        System.out.print("Du har tastet inn et ugyldig svar. Alterativene er \"j\" og \"n\": ");
                        play = scanner.next();
                }
            }
        }
        System.out.println("\nOK! Ha en fin dag videre. :)");
    }
}



