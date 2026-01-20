package designpatternpack.factorypattern;

import java.util.Scanner;

public class GenerateBill {

    public static void main(String[] args) {

        GetPlanFactory planFactory = new GetPlanFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Plans: DOMESTIC, COMMERCIAL, INSTITUTIONAL");
        System.out.print("Enter plan type: ");
        String inputPlan = sc.nextLine().toUpperCase();

        System.out.print("Enter number of units: ");
        int units = sc.nextInt();

        try {
            // Convert String input to Enum
            GetPlanFactory.PlanType planType =
                    GetPlanFactory.PlanType.valueOf(inputPlan);

            // Get plan from factory
            Plan plan = planFactory.getPlan(planType);

            // Calculate bill
            System.out.println(
                "Bill amount for " + planType + " plan (" + units + " units):"
            );
            plan.calculateBill(units);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid plan type entered!");
        }

        sc.close();
    }
}
