package Ckb.interview.training;
import java.util.ArrayList;

// Task: Create code that prints out all fibonachi numbers up to 50;

public class Fib {

    public static void main(String[] args) {
        ArrayList<Integer> fibArr = fib(50);

        for(int i = 0; i <= fibArr.size() -1; i++){
            System.out.println(fibArr.get(i));
        }
    }

    static ArrayList<Integer> fib(int num) {
        int num1 = 1, num2 = 1, curNum = 0;
        ArrayList<Integer> retArr = new ArrayList<>();

        retArr.add(curNum);
        retArr.add(num1);
        retArr.add(num2);

        while (curNum < num) {
                curNum = num1 + num2;
                num2 = num1;
                num1 = curNum;
                if (curNum >= num) {
                    break;
                }
            retArr.add(curNum);
        }
        return retArr;
    }
}