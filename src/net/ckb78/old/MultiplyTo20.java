package net.ckb78.old;

// Task: Find out if any two numbers in an array multiplies to 20.

public class MultiplyTo20 {
    public static void main(String[] args) {

        int[] nums = {2, 4, 1, 6, 5, 40, -1, 10, 19, 13, 11, 9, 20};

        for(int i = 0; i < nums.length; i++){
            for (int j = nums.length -1; i < j; j--) {
                if(nums[i] * nums[j] == 20){
                    System.out.println(nums[i] + " * " +  nums[j] + " = 20.");

                }
            }
        }
    }
}
