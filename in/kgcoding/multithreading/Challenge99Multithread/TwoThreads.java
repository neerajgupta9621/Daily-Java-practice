package in.kgcoding.multithreading.Challenge99Multithread;

public class TwoThreads extends Thread {
    private final int threadNumber;

    public TwoThreads(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) Hello From Thread-%d\n",(i+1), threadNumber);
        }
    }
}
