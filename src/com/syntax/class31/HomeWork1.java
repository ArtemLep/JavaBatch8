package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork1 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Boston");
        cities.add("Atlanta");
        cities.add("Arlington");
        cities.add("New Jersey");
        cities.add("Atlantic City");
        cities.add("Atlanta");
        System.out.println(cities);

        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

        System.out.println(cities);

    }
}