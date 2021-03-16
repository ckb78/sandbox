package net.ckb78.old;

import java.util.Scanner;

public class TextCalc {

    static String sumMsg = "0";
    static char operator;

    public static void main(String[] args) {
        calc();
    }

    static void printDisplay(String msg) {
        clearScreen();
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--[ TEXT MODE CALCULATOR ]-----------------------------------[ CKB78 2020 ]-----");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("INSTRUCTIONS:                                                                   ");
        System.out.println();
        System.out.println(" * Input each number or operator one at a time followed by ENTER after each.    ");
        System.out.println(" * Entering a new number after a completed calculation, starts new calculation. ");
        System.out.println(" * Entering an operator after a completed calculation, brings current sum into  ");
        System.out.println("   new calculation.                                                             ");
        System.out.println(" * Last used operator stays active until replaced with new operator, and        ");
        System.out.println("   enables follow-up calculations without entering operator between each number.");
        System.out.println();
        System.out.println(" * Valid decimal symbol is period ('.').                                        ");
        System.out.println();
        System.out.println(" * Valid operators are:                                                         ");
        System.out.println("        (+) add, (-) subtract, (/) divide, (*) multiply, (%) Modulo.            ");
        System.out.println();
        System.out.println(" * (Q) + ENTER to exit program.                                                 ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("STATUS  : " + msg);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("DISPLAY " + operator + " : " + sumMsg);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("INPUT     : ");
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static double addNum(double num1, double num2) {
        return num1 + num2;
    }

    static double subNum(double num1, double num2) {
        return num1 - num2;
    }

    static double mulNum(double num1, double num2) {
        return num1 * num2;
    }

    static double divNum(double num1, double num2) {
        return num1 / num2;
    }

    static double modNum(double num1, double num2) {
        return num1 % num2;
    }

    static void calc() {
        Scanner scanner = new Scanner(System.in);

        // setup work variables;
        double num1, num2, tempNum, sum;
        int curNum;

        String input;
        String msg;
        boolean calculating;
        boolean finCalc;

        // initial values
        calculating = true;
        sum = 0;
        num1 = 0;
        num2 = 0;

        finCalc = false;
        curNum = 1;
        operator = ' ';
        msg = "Awaiting input.";

        while (calculating) {

            // get input;
            while (!finCalc) {
                printDisplay(msg);

                input = scanner.nextLine();

                if (input.equals("+")) {
                    if (curNum == 0) {
                        num1 = sum;
                        curNum = 2;
                        operator = '+';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else if (curNum == 1) {
                        num1 = sum;
                        curNum = 2;
                        operator = '+';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else {
                        operator = '+';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    }
                } else if (input.equals("-")) {
                    if (curNum == 0) {
                        num1 = sum;
                        curNum = 2;
                        operator = '-';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else if (curNum == 1) {
                        num1 = sum;
                        curNum = 2;
                        operator = '-';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else {
                        operator = '-';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    }
                } else if (input.equals("*")) {
                    if (curNum == 0) {
                        num1 = sum;
                        curNum = 2;
                        operator = '*';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else if (curNum == 1) {
                        num1 = sum;
                        curNum = 2;
                        operator = '*';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else {
                        operator = '*';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    }
                } else if (input.equals("/")) {
                    if (curNum == 0) {
                        num1 = sum;
                        curNum = 2;
                        operator = '/';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else if (curNum == 1) {
                        num1 = sum;
                        curNum = 2;
                        operator = '/';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else {
                        operator = '/';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    }

                } else if (input.equals("%")) {
                    if (curNum == 0) {
                        num1 = sum;
                        curNum = 2;
                        operator = '%';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else if (curNum == 1) {
                        num1 = sum;
                        curNum = 2;
                        operator = '%';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    } else {
                        operator = '%';
                        sumMsg = num1 + " " + operator;
                        msg = "Awaiting next input.";
                    }

                } else if (input.toUpperCase().equals("Q")) {
                    msg = "Exiting program.";

                    printDisplay(msg);
                    System.out.println("\n-------------------------------------------------------------------------------");
                    calculating = false;
                    break;

                } else if (input.length() >= 1) {
                    try {
                        tempNum = Double.parseDouble(input);

                        if (curNum == 0) {
                            num1 = tempNum;
                            sum = num1;
                            sumMsg = Double.toString(sum);
                            curNum = 2;
                            msg = "Awaiting next input.";
                        } else if (curNum == 1) {
                            num1 = tempNum;
                            sum = num1;
                            sumMsg = Double.toString(sum);
                            curNum = 2;
                            msg = "Awaiting next input.";
                        } else {
                            num2 = tempNum;
                            msg = "Calculation complete. Awaiting input.";
                            finCalc = true;
                        }
                    } catch (Exception e) {
                        msg = "*ERROR* - Invalid input \"" + input + "\" - Awaiting input.";
                    }
                } else {
                    msg = "Invalid input";
                }
            }

            while (finCalc) {
                if (operator == '+') {
                    sum = addNum(num1, num2);
                    sumMsg = num1 + " + " + num2 + " = " + sum;
                    curNum = 0;
                    finCalc = false;
                } else if (operator == '-') {
                    sum = subNum(num1, num2);
                    sumMsg = num1 + " - " + num2 + " = " + sum;
                    curNum = 0;
                    finCalc = false;
                } else if (operator == '*') {
                    sum = mulNum(num1, num2);
                    sumMsg = num1 + " * " + num2 + " = " + sum;
                    curNum = 0;
                    finCalc = false;
                } else if (operator == '/') {
                    sum = divNum(num1, num2);
                    sumMsg = num1 + " / " + num2 + " = " + sum;
                    curNum = 0;
                    finCalc = false;
                } else if (operator == '%') {
                    sum = modNum(num1, num2);
                    sumMsg = num1 + " % " + num2 + " = " + sum;
                    curNum = 0;
                    finCalc = false;
                } else {
                    msg = "invalid operator";
                    curNum = 0;
                    sumMsg = sum + " ";
                    finCalc = false;
                }
            }
        }
    }
}
