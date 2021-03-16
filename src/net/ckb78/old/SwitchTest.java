package net.ckb78.old;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your answer? Yes/No");
        String answer = scanner.next();

        switch (answer) {
            case "Yes":
                System.out.println("Thank you for being positive.");
                break;
            case "yes":
                System.out.println("Thank you for being positive.");
                break;
            case "YES":
                System.out.println("Thank you for being positive.");
                break;
            case "No":
                System.out.println("Thank you for being negative.");
                break;
            case "no":
                System.out.println("Thank you for being negative.");
                break;
            case "NO":
                System.out.println("Thank you for being negative.");
                break;
            default:
                System.out.println("Invalid Answer");
                break;
                



        }
    }
}
