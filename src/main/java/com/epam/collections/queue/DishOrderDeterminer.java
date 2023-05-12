package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>(numberOfDishes);
        for (int i = 1; i <= numberOfDishes; i++) {
            integerArrayDeque.add(i);
        }
        int counter = 1;
        List<Integer> list = new ArrayList<>();
        while (list.size() != numberOfDishes) {
            if (counter % everyDishNumberToEat == 0) {
                list.add(integerArrayDeque.pollFirst());
            } else {
                int s = integerArrayDeque.pollFirst();
                integerArrayDeque.addLast(s);
            }
            counter++;
        }

        return list;
    }
}
