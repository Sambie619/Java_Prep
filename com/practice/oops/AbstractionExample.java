package com.practice.oops;
abstract class Payment{// Abstract class
    abstract void pay(double amount);// Abstract method (no body)
    // Concrete method (optional but realistic)
    void paymentStarted() {
        System.out.println("Payment process started...");
    }
}
// Card payment implementation
class CardPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid " + amount + " using Credit/Debit Card");
    }
}
// UPI payment implementation
class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class AbstractionExample{
    public static void main(String[] args) {
        Payment payment;//par ref
        payment=new CardPayment();//pointing to child obj
        payment.paymentStarted();//base class method 
        payment.pay(2345.667);//dynamic method dispatch,this pay is of CardPayment
        payment=new UPIPayment();//pointing to child obj
        payment.paymentStarted();//base class method
        payment.pay(2345.667);//dynamic method dispatch,this pay is of UPIPayment


    }
}
