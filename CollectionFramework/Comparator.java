package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion", "Tiger", "Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }

    public static void sortInDescending(List<String> StringList) {
        Collections.sort(StringList, new java.util.Comparator<String>() {

            public int compare(String s, String t1) {
                if (s.equals(t1)) {
                    return 0;
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }
}
