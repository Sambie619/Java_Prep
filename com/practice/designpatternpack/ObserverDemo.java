package com.practice.designpatternpack;

import java.util.ArrayList;
import java.util.List;

// Observer
interface Observer {
    void update(String message);
}

// Concrete Observer
class Subscriber implements Observer {

    String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Subject
class Channel {

    List<Observer> subscribers = new ArrayList<>();

    void subscribe(Observer o) {
        subscribers.add(o);
    }

    void notifySubscribers(String message) {
        for (Observer o : subscribers) {
            o.update(message);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.notifySubscribers("New video uploaded!");
    }
}
/*When one object changes, all dependent objects get notified automatically.
Real example
YouTube subscribers
Stock market updates
Notification systems 
Category:Behavioral
Channel = Subject
Subscriber = Observer
When the channel updates, all subscribers get notified.*/
