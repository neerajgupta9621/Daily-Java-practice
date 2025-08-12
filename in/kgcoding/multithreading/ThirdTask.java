package in.kgcoding.multithreading;

public class ThirdTask extends Thread {
    @Override
    public void run() {
        // Third task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task complete");
        long endTime = System.currentTimeMillis();
    }
}
