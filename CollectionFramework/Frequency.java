package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 4, 1, 2, 1, 4, 5, 6, 7, 4, 1, 5);
        int result = Collections.frequency(list, 7);
        System.out.println("Frequency Occurred is: " + result);
        System.out.println("Frequency occurred is: " + Collections.frequency(list, 1));
        System.out.println("Frequency occurred is: " + Collections.frequency(list, 4));
        System.out.println("Frequency occurred is:" + Collections.frequency(list, 5));
    }
}
