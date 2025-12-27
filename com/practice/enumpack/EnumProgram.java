package com.practice.enumpack;

import java.util.Scanner;

enum Account{
    SAVINGS,CURRENT,CREDIT;
}
class AccountType{
    Account type;
    AccountType(Account type){
        this.type=type;
    }
    void accountCoverage(){
        switch (type) {
            case SAVINGS:
                System.out.println("Maintain Rs.1000");
                break;
            case CURRENT:
                System.out.println("Maintain Rs.15000");
                break;
            case CREDIT:
                System.out.println("No min Balance.");
                break;
            default:
                break;
        }
    }

}
public class EnumProgram{
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your choice 1.SAVINGS 2.CURRENT 3.CREDIT");
        int choice=sc.nextInt();
        AccountType at=null;
        if(choice==1)at=new AccountType(Account.SAVINGS);
        else if(choice==2)at=new AccountType(Account.CURRENT);
        else if(choice==3)at=new AccountType(Account.CREDIT);
        else System.out.println("Enter a valid choice..");
        at.accountCoverage();
    }
}
}