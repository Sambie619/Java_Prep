package com.practice.oops;

public class SuperKeywordDemo{
    public static void main(String[] args) {
      
    Car c=new Car();
    c.carmeth();
   //super keyword is used to refer to the immediate parent class object.
//It is mainly used to access parent class constructors, variables, and 
// methods when they are hidden by the child class.   
  }
}
class Vehicle{
  String type="Vehicle";
  Vehicle(){
    System.out.println("Inside vehicle cons");
  }
  void vehiclemeth(){
    System.out.println("Inside vehicle meth");
  }
}
class Car extends Vehicle{
  String type="Car";
  Car() {
        // 1️⃣ Calls parent class constructor
        super();
        System.out.println("Inside car cons");
    }
   void carmeth(){
     // 2️⃣ Access parent class variable    super.variable is 
     // used when child hides parent variable
    System.out.println("Parent type: " + super.type);
// Child class variable
        System.out.println("Child type: " + this.type);
    // 3️⃣ Call parent class method
    super.vehiclemeth();//super.method() is used to call overridden methods
    System.out.println("Inside car meth");
    //super cannot be used in static context
  } 
}


