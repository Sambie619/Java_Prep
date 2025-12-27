package com.practice.threadspack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // create thread pool of size 3
        ExecutorService service = Executors.newFixedThreadPool(3);
        // submit tasks
        for (int i = 1; i <= 5; i++) {
            int task = i;
            service.execute(() -> {
                System.out.println("Executing task " + task +
                        " by " + Thread.currentThread().getName());
            });
        }
        service.shutdown(); // stop pool
    }
}
