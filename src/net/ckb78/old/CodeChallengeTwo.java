// Udemy Coding Challenge 2

import java.util.Scanner;
import java.lang.Math;

public class CodeChallengeTwo {
    public static void main(String[] args) {
        nameAndAge();
        restaurantBill();
    }

    // Exercise one.
     public static void nameAndAge(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();
        int charactersInName = firstName.length();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();
         double moneyNeeded = Math.ceil(money) - money;

        System.out.println();
        System.out.println("Your name is " + firstName + " and you've lived " + age + " years.");
        System.out.println("In another " + age + " years, you'll be " + (age * 2) + " years old.");
        System.out.println("Your name has " + charactersInName + " characters in it.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
    }

    // Exercise two
    public static void restaurantBill(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n*** Restaurant Bill Calculator ***\n");

        System.out.print("Enter bill total: £");
        double bill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;
        System.out.format("A bill of £%.2f split between " + people + " people comes to approximately £%.2f each", bill, eachPay);

    }
}
