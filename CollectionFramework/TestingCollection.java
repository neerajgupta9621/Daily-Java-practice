package CollectionFramework;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(29);
        numList.add(29);
        numList.add(29);
        numList.add(34);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);

        // Find The Max and Min Number
        int max = Collections.max(numList);
        int min = Collections.min(numList);
        System.out.println("Max Number =: " + max + " Min Number = " + min);

        Collections.sort(numList);
        int index = Collections.binarySearch(numList, 23);
        System.out.println("Index of (value 23): " + index);
        int freq = Collections.frequency(numList, 29);
        System.out.println("Number of reach frequency:" + freq);

        // List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        // unmodifiable.add(87);
    }
}
