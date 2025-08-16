package in.kgcoding.multithreading.Challenge100;

public class ThreadState extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run %s ", Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
