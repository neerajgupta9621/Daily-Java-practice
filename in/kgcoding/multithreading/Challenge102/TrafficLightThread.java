package in.kgcoding.multithreading.Challenge102;

import javax.management.RuntimeErrorException;

public class TrafficLightThread extends Thread {
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {

        System.out.printf("%s ACTIVE\n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s INACTIVE\n", color);
    }
}
