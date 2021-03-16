package net.ckb78.old;

public class FloydsTriangle {

    public static void main(String[] args) {
          floyds(6);
    }


    public static void floyds(int n){
        int antall;
        int rad;
        int number = 1;

        System.out.println("Floyd's triangle:");
                   for (rad = 1; rad <= n; rad++){
                       for (antall = 1; antall <= rad; antall++){
                           System.out.print(number + " ");
                           number++;
                       }
                   System.out.println(); // neste rad.

                   }


    }

}