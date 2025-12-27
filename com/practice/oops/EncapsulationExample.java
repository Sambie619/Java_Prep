package com.practice.oops;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance>=0){
            balance=initialBalance;
        }else{
            balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }
    // Public method to DEPOSIT money
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount of Rs."+amount+" deposited.Balance="+balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
     // Public method to WITHDRAW money
     public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount of Rs."+amount+" withdrawn.Balance="+balance);
        }else if(amount>balance){
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Withdrawal amount must be positive.");
        }
     }
}
public class EncapsulationExample{
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(1000);
        //ba.deposit(500);
        //ba.withdraw(300);
        //ba.withdraw(2000);
        //ba.deposit(-5000);
    }
}
