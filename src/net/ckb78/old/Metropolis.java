package net.ckb78.old;

import java.util.Scanner; public class Metropolis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: "); String name = scanner.next();
        System.out.println("Is " + name + " a capital ('true' or 'false')?");
        boolean capital = scanner.nextBoolean();
        System.out.println("What are the number of inhabitants in " + name + "?");
        int inhabitants = scanner.nextInt();
        System.out.println("Tax revenue per inhabitant:"); double tax = scanner.nextDouble();
        double totalTax = 200000 * tax;

        if(capital && inhabitants > 100000) {
            System.out.println(name + " is a metropolis, since it is a capital " +
                    "and has " + inhabitants + " inhabitants.");
        }

        else if(inhabitants > 200000 && totalTax >= 1000000000.0) {
            System.out.println(name + " is a metropolis, since it has "
                    + inhabitants + " inhabitants, and has a total tax revenue of " + totalTax + " per year.");
        }

        else {
            System.out.println(name + " is not a metropolis.");
        }
    }
}