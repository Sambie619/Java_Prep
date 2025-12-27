package com.practice.threadspack;

public class ThreadDemo extends Thread {
    // run() is the entry point of thread
    public void run() {
        // code that runs in separate thread
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {

        // create thread object
        ThreadDemo thread = new ThreadDemo();

        // start() creates new thread and calls run()
        thread.start();

        // this runs in main thread
        System.out.println("This code is outside of the thread");
    }
}
