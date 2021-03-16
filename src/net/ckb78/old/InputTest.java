// Import Scanner Class
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);
        // Set scanner locale to US, in order to use point as decimal symbol instead of comma.
        scanner.useLocale(java.util.Locale.US);

        // Get name
        System.out.println("Hello. What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name.");

        /*
        // Get Sex
        System.out.println("Are you (M)ale or (F)emale?");
        char userSex = scanner.next();
        */

        // Get age
        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println(userAge + " is a nice number, " + userName + ".");

        // Get height
        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + " meters tall.");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%.2fm if you are male, and ", averageMaleHeightDifference);
        System.out.format("%.2fm if you are female.", averageFemaleHeightDifference);

    }
}