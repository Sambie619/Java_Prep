package com.practice.threadspack;

public class TestSleepMethod extends Thread{
    public void run() {

        for (int i = 1; i < 5; i++) {

            try {
                // pause thread for 500 ms
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            // print number
            System.out.println(i);
        }
    }

    public static void main(String args[]) {

        // two threads
        TestSleepMethod t1 = new TestSleepMethod();
        TestSleepMethod t2 = new TestSleepMethod();

        t1.start();
        t2.start();
    }
}
