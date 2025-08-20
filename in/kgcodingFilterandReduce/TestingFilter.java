package in.kgcodingFilterandReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "cherry", "date");
        System.out.println(fruits.size());
        System.out.println("Printing fruits normally");
        for (String fruit : fruits) {
        System.out.println(fruit);
        }
         // Stream 1 API hai jo collection ke data ko process krne(filter,short,map)
        System.out.println("Printing Fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {

        @Override
        public void accept(String fruit) {
        System.out.println(fruit);
        }
        });

        // Lambda Easy To Write the program
        System.out.println("Printing Fruits Using filter");
        fruits.stream()
                //.filter(fruit -> fruit.endsWith("e"))
                .filter(fruit -> fruit.startsWith("A"))
                //print all the arrayList 
                .forEach(fruit -> System.out.println(fruit));

    }
}
