package com.practice.oops;
// Address class (nested object)
class Address {
    String city;

    // Parameterized constructor
    Address(String city) {
        this.city = city;  // assign city
    }

    // Copy constructor
    Address(Address a) {
        this.city = a.city; // copy value, not reference
    }
}

// Employee class
class Employee3 {
    String name;
    Address address;

    // Parameterized constructor
    Employee3(String name, Address address) {
        this.name = name;          // assign name
        this.address = address;    // reference assignment (used only initially)
    }

    // Copy constructor
    Employee3(Employee3 e) {
        this.name = e.name;                    // copy primitive / immutable value
        this.address = new Address(e.address); // deep copy of Address object
    }

    // Method to print employee details
    void printDetails() {
        System.out.println("Name   : " + name);
        System.out.println("City   : " + address.city);
        System.out.println("----------------------");
    }
}

// Main class
public class CopyConstructorDemo {
    public static void main(String[] args) {

        // Create Address object
        Address addr = new Address("Bangalore");

        // Create first Employee using normal constructor
        Employee3 emp1 = new Employee3("Sabin", addr);

        // Create second Employee using COPY CONSTRUCTOR
        Employee3 emp2 = new Employee3(emp1);

        // Modify emp2's address
        emp2.address.city = "Chennai";

        // Print both objects
        System.out.println("Employee 1 Details:");
        emp1.printDetails(); // remains unchanged

        System.out.println("Employee 2 Details:");
        emp2.printDetails(); // modified independently
    }
}
