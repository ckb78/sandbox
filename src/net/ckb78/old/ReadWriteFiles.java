package net.ckb78.old;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFiles {

    public static void main(String[] args) {
        writeAndSaveTextFile();
        readAndPrintTextFile();
        readAndCopyTextFile();
        readAndPrintTextFile();
    }

    public static void writeAndSaveTextFile() {

            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            String text = "";
            String fileName = "";

            System.out.println("*** WRITER:\nPlease enter text to save below. Finish with :Q + Enter\n---------------");
            text = sc.nextLine();
            while (!text.equals(":Q")) {
                sb.append(text + "\n");
                text = sc.nextLine();
            }
            String s = sb.toString();
            System.out.print("Please enter filename of text file to save: ");
            fileName = sc.nextLine();
            try {
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(".\\files\\" + fileName));
                bw.write(s);
                bw.close();
                System.out.println("Saved file to .\\files\\" + fileName + "\n");
            } catch (Exception e) {
                System.out.println("Could not write to file");
            }
        }

    public static void readAndPrintTextFile () {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("*** READER:\nPlease enter filename of text file to read and print: ");
        String filename = sc.next();
        String text;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(".\\files\\" + filename));
            while ((text = br.readLine()) != null) {
                sb.append(text + "\n");
            }
            System.out.println("Loaded file .\\files\\" + filename + "\nContents of file:\n---------------");

        } catch (Exception e) {
            System.out.println("Could not read file!");
        }
        System.out.println(sb.toString());
    }

    private static void readAndCopyTextFile() {
        BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
        String fileFrom = "";
        String fileTo = "";
        try {
            System.out.print("*** COPIER:\nPlease enter filename of file to copy from: ");
            fileFrom = isr.readLine();
            System.out.print("Please enter filename of file to copy to: ");
            fileTo = isr.readLine();
        } catch (IOException e) {
            System.out.println("Input error: " + e);
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(".\\files\\" + fileTo));
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(".\\files\\" + fileFrom));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Copied .\\files\\" + fileFrom + " to .\\files\\" + fileTo + "\n" );
        }catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
