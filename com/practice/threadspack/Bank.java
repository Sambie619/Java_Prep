package com.practice.threadspack;
class Customer {
    int amount = 10000; // initial balance
    // synchronized withdraw method
    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        // insufficient balance
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait(); // releases lock & waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // withdraw money
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }
    // synchronized deposit method
    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount; // add money
        System.out.println("deposit completed...");
        notify(); // wake waiting thread
    }
}

public class Bank{
    public static void main(String args[]) {
        Customer c = new Customer();
        // withdraw thread
        new Thread() {//anonymous class 
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        // deposit thread
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
