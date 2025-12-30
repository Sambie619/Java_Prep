package com.practice.test;

public class BankAccount {
    private double balance;
    BankAccount(double amount){
        balance=amount;
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient  balance!!!");
        }else{
            balance-=amount;
            System.out.println("amount withdrawn..");
        }
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("amount deposited..");
    }

    public void getBalance(){
        System.out.println("balance is : "+balance);
    }
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(1400);
        ba.withdraw(1100);
        ba.deposit(300);
        ba.getBalance();
    }
}
