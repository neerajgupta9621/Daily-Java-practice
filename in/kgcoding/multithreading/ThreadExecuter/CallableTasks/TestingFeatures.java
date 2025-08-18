package in.kgcoding.multithreading.ThreadExecuter.CallableTasks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFeatures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName satyam = new FetchName("Satyam");
        FetchName rahul = new FetchName("Rahul");
        FetchName mala = new FetchName("Mala");
        FetchName mahi = new FetchName("Mahi");
        FetchName sumit = new FetchName("Sumit");
        FetchName nikhil = new FetchName("Nikhil");

        Future<String> name1 = service.submit(satyam);
        Future<String> name2 = service.submit(rahul);
        Future<String> name3 = service.submit(mala);
        Future<String> name4 = service.submit(mahi);
        Future<String> name5 = service.submit(sumit);
        Future<String> name6 = service.submit(nikhil);

        System.out.printf("\n Full Name is: %s", name1.get());
        System.out.printf("\n Full Name is: %s", name2.get());
        System.out.printf("\n Full Name is: %s", name3.get());
        System.out.printf("\n Full Name is: %s", name4.get());
        System.out.printf("\n Full Name is: %s", name5.get());
        System.out.printf("\n Full Name is: %s", name6.get());
        service.shutdown();
    }
}
