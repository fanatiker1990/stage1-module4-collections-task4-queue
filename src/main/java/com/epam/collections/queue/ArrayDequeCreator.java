package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        integerArrayDeque.add(firstQueue.poll());
        integerArrayDeque.add(firstQueue.poll());
        integerArrayDeque.add(secondQueue.poll());
        integerArrayDeque.add(secondQueue.poll());
        int count = 0;
        while (firstQueue.peek() != null || secondQueue.peek() != null) {
            if (count % 2 == 0) {
                firstQueue.offer(integerArrayDeque.pollLast());
                integerArrayDeque.offer(firstQueue.poll());
                integerArrayDeque.offer(firstQueue.poll());
            } else {
                secondQueue.offer(integerArrayDeque.pollLast());
                integerArrayDeque.offer(secondQueue.poll());
                integerArrayDeque.offer(secondQueue.poll());
            }
            count++;
        }

        return integerArrayDeque;
    }
}
