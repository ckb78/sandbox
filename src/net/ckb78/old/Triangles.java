package net.ckb78.old;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        getInput();
    }

    // Metode for input fra bruker.
    static void getInput() {

        int triangler = 0;
        String triangelInput;
        int antallFigurer;
        int printCounter = 0;
        boolean triangleCorrectInput = false;

        Scanner scanner = new Scanner(System.in);
        //Spør om bruker ønsker å skrive ut triangler eller rektangler, og kontrollerer for korrekt input.
        while (triangleCorrectInput == false) {
            System.out.print("Triangler(T) eller rektangler(R)?   T/R: ");
            triangelInput = scanner.next();
            if (triangelInput.toUpperCase().equals("T")) {
                triangler = 1;
                triangleCorrectInput = true;
            } else if (triangelInput.toUpperCase().equals("R")) {
                triangler = 0;
                triangleCorrectInput = true;
            } else {
                System.out.println("Dine valgmuligheter er enten \"R\" eller \"T\".");
            }
        }
        // Tar inn antall figurer som skal skrives ut.
        System.out.print("Hvor mange figurer: ");
        antallFigurer = scanner.nextInt();
        int[] figurSize = new int[antallFigurer];

        //Tar inn størrelsen på de ulike figurene.
        for (int i = 0; i < figurSize.length; i++) {
            System.out.print("Skriv inn størrelse på figur nr. " + (i + 1) + ":");
            figurSize[i] = scanner.nextInt();
        }
        drawFigures(triangler, printCounter, figurSize);
    }

    //Metode for tegning av figurer.
    private static void drawFigures(int triangler, int printCounter, int[] figurSize) {
        int figur;
        boolean negativeNumber;
        for (int i = 0; i < figurSize.length; i++) {
            //printing av figurer
            figur = figurSize[i];
            // sjekk for negativ lengde på figur:
            if (figur < 0) {
                negativeNumber = true;
                figur = (figur * -1);
            } else {
                negativeNumber = false;
            }
            // Oppsett for utskrift av rektangler og negative triangler.
            if ((triangler == 0) || (triangler == 1 && negativeNumber == true)) {
                printCounter = figur;
            }
            // Oppsett for utskrift av positive triangler
            else if (triangler == 1 && negativeNumber == false) {
                printCounter = 1;
            }
            for (int x = 0; x < figur; x++) {
                for (int y = 0; y < printCounter; y++) {
                    System.out.print("*");
                }
                if (triangler == 1 && negativeNumber == true) {
                    printCounter--;
                } else if (triangler == 1 && negativeNumber == false) {
                    printCounter++;
                }
                System.out.println();
            }
        }
    }


}