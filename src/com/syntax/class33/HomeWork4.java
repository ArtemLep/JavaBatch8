package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork4 {
    /*Create a Map from array of cities that will sort keys in alphabetical order.
     As a key store the name of the city and as a value store the length of the city
     (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
If any city name is more than 7 characters remove that city . */
    public static void main(String[] args) {
        Map<String,Integer>cities=new TreeMap<>();
        cities.put("New York", 1);
        cities.put("New Jersey",5);
        cities.put("Moscow", 7);
        cities.put("Connecticut", 9);
        cities.put("Delaware",13);
        Iterator<Integer>val =cities.values().iterator();
        while (val.hasNext()){
            if(val.next()>7){
                val.remove();
            }

        }
        System.out.println(cities.keySet());
    }
}
