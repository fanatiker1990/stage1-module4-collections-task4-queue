package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> strings = new PriorityQueue<>(Comparator.reverseOrder());
        strings.addAll(firstList);
        strings.addAll(secondList);
        return strings;
    }
}
