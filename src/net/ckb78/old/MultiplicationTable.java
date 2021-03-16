package net.ckb78.old;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTableUpTo(10);
    }

	private static void printMultiplicationTableUpTo(int highestNumber) {

        int sum = 0;
        String outPut;
        for (int i = 1; i <=highestNumber ; i++) {
            for (int j = 1; j <=highestNumber ; j++) {
                sum = i * j;
                if (j < highestNumber) {
                    outPut = correctNumberOfSpaces(sum, highestNumber) + sum;
                } else {
                    outPut = correctNumberOfSpaces(sum, highestNumber) + sum + "\n";
                }
                System.out.print(outPut);
            }
        }
    }

    private static String correctNumberOfSpaces(int sum, int highestNumber) {
        String spaces = " ";
        int maxNumberOfDigits = String.valueOf(highestNumber * highestNumber).length();
        int currentNumberOfDigits = String.valueOf(sum).length();
        for (int i = currentNumberOfDigits; i < maxNumberOfDigits; i++) {
            spaces = spaces + " ";
        }
        return spaces;
    }
}