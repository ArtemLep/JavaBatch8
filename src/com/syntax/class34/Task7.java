package com.syntax.class34;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    /*Create the collection that will store single uniques Objects of
//        a String type in which order is preserved.
//        Write a logic to concatenate all string from the collection.
//        Create a collection of integers in which you can keep duplicates.
//        Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        Set<String> objects = new LinkedHashSet<>();
        objects.add("My ");
        objects.add("name ");
        objects.add("is ");
        objects.add("Artem");
        String str = "";
        for(String obj : objects) {
            str += obj;
        }
        System.out.println(str);
    }
}
