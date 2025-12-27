package com.practice.concurrencyutilities;
import java.util.concurrent.*; // For ExecutorService, Callable, Future, ConcurrentHashMap

public class ConcurrencyExample {
    public static void main(String[] args) {
        // Thread-safe map to store results
        ConcurrentHashMap<String, Integer> resultMap = new ConcurrentHashMap<>();

        // Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Define a Callable task that computes a value
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
                Thread.sleep(100); // Simulate work
            }
            return sum; // Callable returns a result
        };

        try {
            // Submit the task and get a Future
            Future<Integer> future = executor.submit(task);

            // Retrieve the result (blocks until ready)
            Integer result = future.get();

            // Store result in ConcurrentHashMap
            resultMap.put("Sum1to5", result);

            // Print the result
            System.out.println("Computed Result: " + resultMap.get("Sum1to5"));

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
            System.err.println("Task was interrupted.");
        } catch (ExecutionException e) {
            System.err.println("Task threw an exception: " + e.getCause());
        } finally {
            // Always shut down the executor
            executor.shutdown();
        }
    }
}
