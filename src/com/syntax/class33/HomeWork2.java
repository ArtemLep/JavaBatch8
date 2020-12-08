package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {

        TreeMap<String, String> Countries = new TreeMap<>();
        Countries.put("USA", "Washington");
        Countries.put("Ukraine", "Kiev");
        Countries.put("Italy", "Rome");
        Countries.put("Canada", "Ottawa");
        Countries.put("Belarus", "Minsk");

        for (String country : Countries.keySet()) {
            System.out.println(country);
        }
        for (String cities : Countries.values()) {
            System.out.println(cities);
        }
        System.out.println("+++++++++++++++++++ITERATOR++++++++++++++++++");
        Iterator<Map.Entry<String, String>> CountryCities = Countries.entrySet().iterator();
        while (CountryCities.hasNext()) {
            System.out.println(CountryCities.next());
        }
        Iterator<String> Countr = Countries.keySet().iterator();
        while (Countr.hasNext()) {
            System.out.println(Countr.next());
        }
        Iterator<String> citis = Countries.values().iterator();
        while (citis.hasNext()) {
            System.out.println(citis.next());
        }
    }
}