package CollectionFramework;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        // ASCII Value
        pq.add("Apple");// "A"(65)
        pq.add("Banana");// "B"(66)
        pq.add("papaya");// "p"(112)
        pq.add("leamon");// "l"(108)
        pq.add("Pineapple");// "P" (80)
        pq.add("Mango");// "M"(77)
        // UpperCase letters('A','B' etc.) ka ASCII value lowercase('a','b',etc.) se
        // chhota hota hai, isiliye uppercase strings pahle aate hain.

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
    }
}

class MaxPq {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.add(10);
        maxPQ.add(20);
        maxPQ.add(5);
        System.out.println("Max Value: " + maxPQ.poll());
    }
}

class IntegerList {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(8);
        pq.add(10);
        pq.add(13);
        pq.add(20);
        pq.add(30);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}