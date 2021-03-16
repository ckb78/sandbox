public class BottlesOnTheWall {
    public static void main(String[] args){
        for(int i = 99; i > 0; i--){
            String flask = "bottles";
            String flask2 = "bottles";
            if (i == 1){
                flask = "bottle";
            }
            else if (i == 2){
                flask2 = "bottle";
            }
                System.out.println(i + " " + flask + " of beer on the wall.");
                System.out.println(i + " " + flask + " of beer.");
                System.out.println("You take it down, pass it around.");
                System.out.println((i - 1) + " " + flask2 + " of beer on the wall.");
                System.out.println();
        }
    }
}
