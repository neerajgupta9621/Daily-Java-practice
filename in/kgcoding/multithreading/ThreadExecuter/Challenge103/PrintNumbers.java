package in.kgcoding.multithreading.ThreadExecuter.Challenge103;

public class PrintNumbers implements Runnable {

    @Override
    public void run() {
        // Print task
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number is %d\n", i + 1);
        }
    }
}
