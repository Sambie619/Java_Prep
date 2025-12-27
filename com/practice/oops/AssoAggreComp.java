package com.practice.oops;
// Employee class
class Employee2{
    private String name;

    Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
// Department class (Aggregation)
class Department {
    private String deptName;
    private Employee2 employee; // HAS-A relationship
    //dept illelum emp und
    Department(String deptName, Employee2 employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    void showDetails() {
        System.out.println(employee.getName() + " works in " + deptName);
    }
}
// Company class (Composition)
class Company {
    private String companyName;
    private Department department; // STRONG ownership
    //company undele dept ullu
    Company(String companyName) {
        this.companyName = companyName;

        // Department is CREATED inside Company
        Employee2 emp = new Employee2("Rahul");
        this.department = new Department("IT", emp);
    }

    void display() {
        System.out.println("Company: " + companyName);
        department.showDetails();
    }
}

public class AssoAggreComp {
    public static void main(String[] args) {
        // ASSOCIATION example
        Employee2 emp = new Employee2("Amit");
        Department dept = new Department("HR", emp);
        dept.showDetails();

        System.out.println("------------");

        // COMPOSITION example
        Company company = new Company("Google");
        company.display();
    }
}
