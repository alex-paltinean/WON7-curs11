package com.fasttrack.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("3rd");

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("Just peeking: " + queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        if (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
