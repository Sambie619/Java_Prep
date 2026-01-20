package designpatternpack.factorypattern;

abstract class Plan {
	protected double rate;
    public void calculateBill(int units){
        System.out.println(units * rate);
    }

}
//Factory Pattern defines an interface for creating 
// an object, but lets subclasses or a factory class
//  decide which class to instantiate.