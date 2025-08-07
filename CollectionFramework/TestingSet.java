package CollectionFramework;

import java.util.*;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();


        System.out.println(set.add("Prashant"));
        System.out.println(set.add("Sanchit"));
        System.out.println(set.add("KG Coding"));
        System.out.println(set);
        System.out.println(set.add("Prashant"));
        System.out.println(set.size());
        Utility.print(set);
        System.out.println(set.contains("Prashant"));
        System.out.println(set.remove("Prashant"));
        Utility.print(set);
        System.out.println(set.remove("Prashant"));

    
    
        // set.add("Apple");
        // set.add("Orange");
        // // set.add("Banana");
        // // set.add("PineApple");
        // // set.add("Apple"); // Duplicate – ignored

        // for (String fruit : set) {
        // System.out.println(fruit);
        // }
        // boolean isAdded = set.add("Apple");
        // System.out.println("Apple added again: " + isAdded);

        // boolean containsOrange = set.contains("Orange");
        // System.out.println("Contains Orange: " + containsOrange);
    }
}
