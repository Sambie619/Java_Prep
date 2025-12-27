package com.practice.oops;
class Employeee{
    protected String name;
    protected int id;
    protected double baseSalary;

    Employeee(String name,int id,double baseSalary){
        this.name=name;
        this.id=id;
        this.baseSalary=baseSalary;
    }
    // Method to be overridden (Runtime Polymorphism)
    double calculateSalary() {
        return baseSalary;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Developer extends Employeee{// Child class 1
   protected double bonus; 
   Developer(String name,int id,double baseSalary,double bonus){
    super(name,id,baseSalary);
    this.bonus=bonus;
   }
   @Override
   double calculateSalary() {// Overriding method
        return baseSalary+bonus;
    }
}
// Child class 2
class Manager extends Employeee{

    private double incentive;

    Manager(String name, int id, double baseSalary, double incentive) {
        super(name, id, baseSalary);
        this.incentive = incentive;
    }

    // Overriding method
    @Override
    double calculateSalary() {
        return baseSalary + incentive + 5000; // manager allowance
    }
}
// Child class 3
class Intern extends Employeee{

    Intern(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }
    // Overriding method
    @Override
    double calculateSalary() {
        return baseSalary *0.5; // manager allowance
    }
}

public class InheriPolyDMDisp {
    public static void main(String[] args) {
        // Parent reference, child objects (KEY LINE)
        Employeee e1=new Developer("Sabin", 1, 35000, 2500);
        Employeee e2=new Manager("Mohd", 2, 60000, 1000);
        Employeee e3=new Intern("Yasin", 3, 35000);
        Employeee[]employees ={e1,e2,e3};
        for(Employeee e:employees){
            e.displayDetails();
            System.out.println("Final Salary : "+e.calculateSalary());
            System.out.println("===================================");
        }
    }
}
