package net.ckb78.old;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    // Check balance method
    public void checkBalance(){
        System.out.println();
        System.out.println("Hello!\nYour balance is " + balance);
    }

    // Deposit method
    public void deposit(int amountToDeposit){
        System.out.println();
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit + ".");
    }

    // Withdraw method
    public int withdraw(int amountToWithdraw){
        System.out.println();
        int newBalance = balance - amountToWithdraw;
        balance = newBalance;
        System.out.println("You just withdrew " + amountToWithdraw + ".");
        return amountToWithdraw;
    }

    // toString method
    //public String toString(){
    // System.out.println();
    // return "This is a savings account with a balance of " + balance + ".";
    // }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        //System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Withdrawing:
        //int afterWithdraw = savings.balance - 300;
        //savings.balance = afterWithdraw;
        //System.out.println("You just withdrew "+300);
        savings.withdraw(300);

        //Check balance:
        //System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Deposit:
        // int afterDeposit = savings.balance + 600;
        // savings.balance = afterDeposit;
        // System.out.println("You just deposited "+600);
        savings.deposit(600);

        //Check balance:
        //System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        //Deposit:
        // int afterDeposit = savings.balance + 600;
        // savings.balance = afterDeposit;
        // System.out.println("You just deposited "+600);
        savings.deposit(600);

        //Check balance:
        //System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();

        System.out.print(savings);
    }
}
