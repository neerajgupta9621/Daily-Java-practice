package in.kgcoding.multithreading.Runnable;

public class TestingRunnable {

    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread 1 is Started");
        Thread t2 = new Thread(p2);
        t2.start();
        t1.join();
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread 2 is Stsrted");
        Thread t3 = new Thread(p3);
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 3 is Started");

        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d ",
                Thread.currentThread().getName(),
                (endTime - startTime));

    }
}
