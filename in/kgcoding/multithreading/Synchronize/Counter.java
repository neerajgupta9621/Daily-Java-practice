package in.kgcoding.multithreading.Synchronize;

public class Counter {

    private int count ;

    public synchronized void increment() {
        count++;
    }

    public  int getCount() {
        return count;
    }
}
