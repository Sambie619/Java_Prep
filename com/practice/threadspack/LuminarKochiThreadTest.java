package com.practice.threadspack;
// Thread printing Kochi
class ThreadKochi extends Thread {

    public void run() {
        while (true) {
            System.out.println("Kochi");
        }
    }
}

// Thread printing Luminar
class ThreadLuminar extends Thread {

    public void run() {
        while (true) {
            System.out.println("Luminar");
        }
    }
}
public class LuminarKochiThreadTest {
    public static void main(String[] args) {

        ThreadLuminar luminar = new ThreadLuminar();
        ThreadKochi kochi = new ThreadKochi();

        // start both threads
        luminar.start();
        kochi.start();
    }
}
