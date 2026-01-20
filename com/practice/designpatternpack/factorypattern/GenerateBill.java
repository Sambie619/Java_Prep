package designpatternpack.factorypattern;
import java.io.IOException;
import java.util.Scanner;

public class GenerateBill {
	public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of plan: ");
        String planName = sc.nextLine();

        System.out.print("Enter the number of units: ");
        int units = sc.nextInt();

        Plan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);

        sc.close();

    }

}
