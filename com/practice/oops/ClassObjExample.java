package com.practice.oops;
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){//constructor
        this.name=name;//this ref to currobj diff btw isnt var and loc var
        this.id=id;
        this.salary=salary;
    }
    void printDetails(){
        System.out.println("Employee name :"+name+"\nEmployee id :"+id+
            "\nEmployee salary :"+salary);
    }
}
public class ClassObjExample {
    public static void main(String[] args) {
        Employee emp=new Employee("Sabin", 59,35004.43);//create obj
        emp.printDetails();
    }
}
