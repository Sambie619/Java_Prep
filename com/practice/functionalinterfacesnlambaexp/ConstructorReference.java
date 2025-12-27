package com.practice.functionalinterfacesnlambaexp;
@FunctionalInterface
interface C{
    Employee getEmployee();
}
@FunctionalInterface
interface D{
    Employee getEmployee(String name,int age);
}
class Employee{
    String name;
    int age;
    Employee(){};//no arg Constructor
    Employee(String name,int age){// parameterized constructor
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("Employee :"+this.name+","+this.age);
    }
}
public class ConstructorReference{
    public static void main(String[] args) {
        //USING LAMBDA
        C c=()->new Employee();
        c.getEmployee().getInfo();
        D d=(name,age)->new Employee(name,age);
        d.getEmployee("Sabin", 22).getInfo();
        // USING METHOD REFERENCE
        C c1=Employee::new;
        c1.getEmployee().getInfo();
        D d1=Employee::new;
        d1.getEmployee("Sambie", 23).getInfo();
    }
}
