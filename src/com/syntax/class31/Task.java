package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    /*Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 50; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer> integerIterator = numbers.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() % 5 == 0) {
                integerIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
