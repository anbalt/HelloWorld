package src.by.itacademy.hw14.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableTask {
    public CallableTask() {
        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = new ArrayList<>();
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(callable);
            futures.add(future);
        }

        for (Future<String> future : futures) {
            try{
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        executorService.shutdown();
    }

    public static class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Random random = new Random();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                sum += number;
            }
            Thread.sleep(random.nextInt(10000));
            return String.valueOf(sum);
        }
    }

    public static void main(String[] args) {
        new CallableTask();
    }
}
