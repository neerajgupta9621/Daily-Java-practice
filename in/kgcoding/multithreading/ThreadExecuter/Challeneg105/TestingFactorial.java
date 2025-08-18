package in.kgcoding.multithreading.ThreadExecuter.Challeneg105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFactorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Factorial is: %d", future.get());
            }

            service.shutdown();
            if (!service.awaitTermination(15, TimeUnit.SECONDS)) {
                System.out.println("BOHOT HUA BUS.........");
                service.shutdown();
            }
        }
    }
}