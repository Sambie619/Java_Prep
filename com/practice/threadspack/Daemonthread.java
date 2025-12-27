package com.practice.threadspack;

public class Daemonthread extends Thread{9ki
    public Daemonthread(String name) {
        super(name);
    }

    public void run() {

        // check daemon status
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {

        Daemonthread thread1 = new Daemonthread("thread1");
        Daemonthread thread2 = new Daemonthread("thread2");

        // set daemon
        thread1.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
