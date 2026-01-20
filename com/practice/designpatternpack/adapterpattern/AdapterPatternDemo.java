package designpatternpack.adapterpattern;

import java.util.Scanner;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input (Client responsibility)
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        long accNumber = sc.nextLong();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();

        // Step 2: Create Adaptee
        BankDetails bankDetails = new BankDetails();
        bankDetails.setAccHolderName(name);
        bankDetails.setAccNumber(accNumber);
        bankDetails.setBankName(bankName);

        // Step 3: Create Adapter
        CreditCard targetInterface = new BankCustomer(bankDetails);

        // Step 4: Client uses target interface
        System.out.println("\n" + targetInterface.getCreditCard());

        sc.close();
    }
}
