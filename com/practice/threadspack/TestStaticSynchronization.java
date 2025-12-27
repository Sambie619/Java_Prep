package com.practice.threadspack;
class Tablez {
    // static synchronized method
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThreadOnez extends Thread {
    public void run() {
        Tablez.printTable(1);
    }
}
class MyThreadTwoz extends Thread {
    public void run() {
        Tablez.printTable(10);
    }
}
class MyThreadThird extends Thread {
    public void run() {
        Tablez.printTable(100);
    }
}
class MyThreadFourth extends Thread {
    public void run() {
        Tablez.printTable(1000);
    }
}

public class TestStaticSynchronization {
    public static void main(String t[]) {
        MyThreadOnez t1 = new MyThreadOnez();
        MyThreadTwoz t2 = new MyThreadTwoz();
        MyThreadThird t3 = new MyThreadThird();
        MyThreadFourth t4 = new MyThreadFourth();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
