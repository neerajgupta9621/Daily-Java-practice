package in.kgcoding.multithreading.ThreadExecuter.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import in.kgcoding.multithreading.Runnable.PrintTask;
import in.kgcoding.multithreading.ThraedClass.ThirdTask;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        PrintNumbers tasks = new PrintNumbers();
          service.submit(tasks);
    }
}
