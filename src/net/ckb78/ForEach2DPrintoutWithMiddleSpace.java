package net.ckb78;

public class ForEach2DPrintoutWithMiddleSpace {

    public static void main(String[] args) {

        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row: twoD) {
            for (int col: row) {
                if (col != 5)
                    System.out.print((col < 5) ? col + " " : col -1 + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
