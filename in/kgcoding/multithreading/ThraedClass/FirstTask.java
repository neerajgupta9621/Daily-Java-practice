package in.kgcoding.multithreading.ThraedClass;

public class FirstTask extends Thread {
    @Override
    public void run() {
        // first task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d*", i);
        }
        System.out.printf("\n %s * task complete", Thread.currentThread().getName());
    }
}
