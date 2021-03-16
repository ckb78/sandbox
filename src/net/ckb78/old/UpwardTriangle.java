public class UpwardTriangle {
    public static void main(String[] args) {
        //write your code here
        int cols = 0;

        for (int rows = 0; rows < 10; rows++) {

            for (int i = 0; i <= cols; i++) {
                if (i == cols) {
                    System.out.println(8);
                    break;
                } else {
                    System.out.print(8);
                }
            }

            if (cols < 10) {
                cols++;
            }
        }
    }
}