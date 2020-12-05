package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/*Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.*/
public class HomeWork {
    public static void main(String[] args) {
        Set<String> countries=new TreeSet<>();
        countries.add("Russia");
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Canada");
        countries.add("England");
        countries.add("France");
        countries.add("Italy");
        System.out.println(countries);

        System.out.println("++++++++++++++Iterator+++++++++++++");
        Iterator value = countries.iterator();

        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}