package com.practice.threadspack;
class ThreadWelcomez extends Thread {
    public void run() {
        System.out.println("Welcome");
    }
}

class ThreadKochiz extends Thread {
    public void run() {
        System.out.println("Kochi");
    }
}

class ThreadLuminarz extends Thread {
    public void run() {
        System.out.println("Luminar");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {

        ThreadWelcomez t1 = new ThreadWelcomez();
        ThreadKochiz t2 = new ThreadKochiz();
        ThreadLuminarz t3 = new ThreadLuminarz();

        // set priorities
        t1.setPriority(5);
        t2.setPriority(1);   // MIN_PRIORITY
        t3.setPriority(10);  // MAX_PRIORITY

        // start threads
        t1.start();
        t2.start();
        t3.start();

        // print priorities
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
