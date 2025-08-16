package in.kgcoding.multithreading.Synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try {
            t1.start();
            t2.start(); // t1.join kahta hai ki pahle t1 apna kaam pura kr le uske bad t2 apna kaam
                        // krega
                        // t1 complete // 10000 bar chalega pahle t1 uske bad t2
                        // t2 start // t2 bhi 10000 time chalega dono ko milakr = 20000 time hua
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(" Thread Interrupted: " + e.getLocalizedMessage());
        }
        long endTime = System.currentTimeMillis();

        System.out.printf("Final counter value: %d and time taken: %d" + " (Milisecond)",
                counter.getCount(),
                (endTime - startTime));

    }
}
