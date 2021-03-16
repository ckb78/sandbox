package net.ckb78.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException {

        printIntro();
        gameLoop();

    }
    
    public static void gameLoop() throws InterruptedException {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        Scanner scanner = new Scanner(System.in);
        String result = "ingen";
        while (result.equals("ingen")) {
            // Player turn
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            printGameBoard(gameBoard);
            System.out.print("\nPlasser din brikke i et felt fra 1 til 9: ");
            int playerPos = scanner.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)){
                printGameBoard(gameBoard);
                System.out.print("\nValgt posisjon er allerede tatt! Velg en gyldig posisjon: ");
                playerPos = scanner.nextInt();
            }
            placePiece(gameBoard, playerPos, "player");
            printGameBoard(gameBoard);
            // Check for a winner
            result = checkWinner();
            if (result != "ingen"){
                break;
            }

            // CPU Turn
            System.out.print("\nCPU'en tenker...");
            Random random = new Random();
            TimeUnit.SECONDS.sleep(2); // Simulate cpu "thinking".
            int cpuPos = random.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = random.nextInt(9) + 1;
            }
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);

            // Check for a winner
            result = checkWinner();
            if (result != "ingen"){
                break;
            }
        }
        System.out.println(result);
        TimeUnit.SECONDS.sleep(3);
        printIntro();
    }

    private static void placePiece(char[][] gameBoard, int position, String user) throws InterruptedException {
        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(position);
        }

        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            case 0:
                printInstructions();
                break;
            default:
                System.out.println("Ugyldig valg.");
                break;
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        System.out.print("\n\n");
        for(char[] row: gameBoard){
            for(char c : row){
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }

    private static void printIntro() throws InterruptedException {

            System.out.println("\n\n\n\n\n\n\n      *** Christians Bondesjakk! ***\n");
            System.out.println("             -= Spillmeny =-\n");
            System.out.println("   (S) = Spill en runde bondesjakk.\n");
            System.out.println("   (I) = Les instruksjoner for hvordan spille.\n");
            System.out.println("   (A) = Avslutt spillet. \n\n");
            System.out.print("    Tast inn ditt valg: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice.toUpperCase()){
                case "S":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    gameLoop();
                    break;
                case "I":
                    printInstructions();
                    break;
                case "A":
                    endGame();
                    break;
                default:
                    break;
            }   
    }

    private static void endGame(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n Ha en fin dag! \n\n\n\n");
    }


    private static void printInstructions() throws InterruptedException {

        char[][] positions = {
                {'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'}};
        String valg = "";
            System.out.println("\n\n\n      *** Instruksjoner ***\n");
            System.out.println(" Spilleren og CPUen legger sine brikker på brettet");
            System.out.println(" etter tur. Målet er å få tre på rad.\n");
            System.out.println("    Spillerens brikker   :  X");
            System.out.println("    CPUens brikker       :  O\n");

            System.out.print("Tallverdier for spillbrettets posisjoner:");
            printGameBoard(positions);
            System.out.print("\nTrykk 'm' og enter, for å gå tilbake til menyen...");
            Scanner scanner = new Scanner(System.in);
            valg = scanner.next();
            switch (valg.toLowerCase()) {
                case "m":
                    break;
                default:
            }
        printIntro();
        }

    private static String checkWinner(){
        boolean winner = false;

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List lefCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rigCol = Arrays.asList(3, 6, 9);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(lefCol);
        winning.add(midCol);
        winning.add(rigCol);
        winning.add(diag1);
        winning.add(diag2);

        for (List list: winning) {
            if(playerPositions.containsAll(list)){
                winner = true;
                if (winner == true)
                    return "\nGratulerer! Du vant!";
                break;
            } else if (cpuPositions.containsAll(list)){
                winner = true;
                if (winner == true)
                    return "\nCPUen vant! Bedre lykke neste gang!";
                break;
            } else if (playerPositions.size() + cpuPositions.size() == 9 && winner == false) {
                return "\nUavgjort! Ingen vinner!";
            }
        }
        return "ingen";
    }
}
