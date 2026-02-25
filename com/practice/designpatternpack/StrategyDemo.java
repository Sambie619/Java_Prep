package com.practice.designpatternpack;
// Strategy interface
interface PaymentStrategy1 {
    void pay(int amount);
}

// Concrete strategies
class CreditCardPayment1 implements PaymentStrategy1 {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment1 implements PaymentStrategy1 {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Context class
class PaymentContext {

    PaymentStrategy1 strategy;

    public PaymentContext(PaymentStrategy1 strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        strategy.pay(amount);
    }
}

public class StrategyDemo {
    public static void main(String[] args) {

        PaymentContext p1 = new PaymentContext(new CreditCardPayment1());
        p1.makePayment(500);

        PaymentContext p2 = new PaymentContext(new UpiPayment1());
        p2.makePayment(300);
    }
}
/*Allows changing the algorithm or behavior at runtime.

Real example
Payment methods:
Credit card
UPI
PayPal 
Category:Behavioral*/