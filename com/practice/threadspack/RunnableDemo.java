package com.practice.threadspack;

public class RunnableDemo implements Runnable{
    // thread logic
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {

        // create runnable object
        RunnableDemo threads = new RunnableDemo();

        // pass runnable to Thread constructor
        Thread thread = new Thread(threads);//new 

        // start new thread
        thread.start();//runnable ,waiting ,timed wiating .sleep(123),terminated .run over
        // main thread execution
        System.out.println("This code is outside of the thread");
    }
}
