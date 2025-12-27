package com.practice.threadspack;
class Table {
    // synchronized void printTable(int n)
    void printTable(int n) {//syn(this)better coz ctrit sec matram lockya mati
        synchronized(this){//better performance
        for (int i = 1; i <= 5; i++) {
            // printing multiplication
            System.out.println(n * i);
            try {
                Thread.sleep(400); // pause
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  }
    }
}
class MyThreadOne extends Thread {
    Table t;
    MyThreadOne(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}
class MyThreadTwo extends Thread {
    Table t;
    MyThreadTwo(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization {
    public static void main(String args[]) {
        Table obj = new Table(); // single object
        MyThreadOne t1 = new MyThreadOne(obj);
        MyThreadTwo t2 = new MyThreadTwo(obj);
        t1.start();
        t2.start();
    }
}
