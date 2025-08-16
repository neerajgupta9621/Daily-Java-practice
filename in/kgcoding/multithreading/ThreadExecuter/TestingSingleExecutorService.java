package in.kgcoding.multithreading.ThreadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import in.kgcoding.multithreading.Runnable.PrintTask;

public class TestingSingleExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('$');

        PrintTask task3 = new PrintTask('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
