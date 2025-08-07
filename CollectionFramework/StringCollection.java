package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCollection {
    public static void main(String[] args) {
        List<String> numList = new ArrayList<>();
        numList.add("Apple");
        numList.add("Mango");
        numList.add("Orange");
        numList.add("Pomegranate");
        numList.add("Banana");
        numList.add("Papaya");

        for (String str : numList) {
            System.out.println(str);
        }

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);
    }
}
