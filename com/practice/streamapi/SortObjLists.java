package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class SortObjLists {

    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + "}";
        }
    }

    static Employee[] employees = {
            new Employee("John", 50000),
            new Employee("Alice", 60000),
            new Employee("Bob", 45000)
    };

    public static void main(String[] args) {
        Arrays.stream(employees)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}