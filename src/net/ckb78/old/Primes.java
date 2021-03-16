package Ckb.interview.training;

import java.util.ArrayList;
import java.util.List;

public class Primes {

    public static void main(String[] args) {
        ArrayList<Integer> primes;
        primes = primeNumbers(50);

        /* for (int i = 0; i < primes.size(); i++) {
            System.out.println(primes.get(i));
        }*/
    }

    public static ArrayList<Integer> primeNumbers (int upper) {
        int i = 0;
        int num = 0;
        ArrayList<Integer> primeArr = new ArrayList<>();

        for (i = 1; i <= upper; i++)
        {

            int counter = 0;
            for(num = i; num >= 1; num --){
                if(i % num == 0){
                    counter = counter + 1;
                    System.out.println("i = " + i + ", counter = " + counter);
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeArr.add(i);
            }
        }
        return primeArr;
    }
}
