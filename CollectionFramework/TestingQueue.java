package CollectionFramework;

import java.util.*;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Amit");
        queue.add("Rahul");
        queue.add("Neha");
        queue.add("Neeraj");
        queue.offer("Vijay");

        Utility.print(queue);
        System.out.println("============================");

        System.out.println(queue.peek());// Peek Queue ka first element return karta hai
        System.out.println(queue.element());

        System.out.println("First Removes: " + queue.remove());
        Utility.print(queue);
        System.out.println("============================");
        System.out.println(queue.poll());// remove the element from head
        Utility.print(queue);
        System.out.println("============================");
        System.out.println(queue);//display the element in list

    }
}
