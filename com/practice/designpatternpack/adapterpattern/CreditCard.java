package designpatternpack.adapterpattern;

public interface CreditCard {
    String getCreditCard();
}

//Target Interface (What client expects)
//this code adapts bankdetails into CreditCard ,without modifying 
//existing bankdetails code
//Adapter Pattern is used when a client expects a specific interface 
// or format, but the existing class provides similar functionality 
// with a different interface, and the adapter converts it 
// without changing existing code.