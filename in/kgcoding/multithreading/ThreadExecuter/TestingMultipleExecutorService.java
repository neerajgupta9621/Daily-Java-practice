package in.kgcoding.multithreading.ThreadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import in.kgcoding.multithreading.Runnable.PrintTask;

public class TestingMultipleExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char) i);
            service.submit(task);

        }

        service.shutdown();
    }
}
