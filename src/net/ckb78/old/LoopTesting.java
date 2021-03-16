package Ckb.interview.training;

public class LoopTesting {

    public static void main(String[] args) {

        generalLoops(10);

    }

    static void generalLoops(int num){

        int nummer = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(nummer + " ");
                    nummer++;
            }
            System.out.println();

        }

    }

    static void triangle(int num){


    }

    static void rectangle(int num){


    }

    static void reverseTriangle(int num){


    }


}
