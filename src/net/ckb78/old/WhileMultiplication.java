/* 
Multiplication table

Multiplication table
Use a while loop to display a 10x10 multiplication table.
Separate the numbers using a space.

*/

public class WhileMultiplication {
    public static void main(String[] args) {
        //write your code here
        int row = 1, col;

        while (row < 11) {
            col = 1;
            while (col < 11){

                if (col < 10)
                    System.out.print((row * col) + " ");
                else
                    System.out.print(row * col);
                col++;
            }
            if (row < 10)
                System.out.println();
            row++;
        }
    }
}