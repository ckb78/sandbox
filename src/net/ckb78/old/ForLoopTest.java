public class ForLoopTest {
    public static void main(String[] args) {
        System.out.println("Counting up to 100 in increments of 2, but will skip 60 and break at 80.");
        for (int i = 2; i <= 100; i = i + 2) {
            if (i == 60) {
                continue;
            }
            if (i >= 81) {
                break;
            }
            System.out.println(i);



        }



    }
}
