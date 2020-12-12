package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task5 {
    public static void main (String[] args) {
        String[] arrayCity = {"Rabbat", "Algiers", "Casablanca", "Taiwan", "Madrid", "Paris", "Adissabeba", "San francisco"};
        Map<String, Integer> map = new TreeMap<>( );
        for (int i = 0; i < arrayCity.length; i++) {
            map.put ( arrayCity[i], arrayCity[i].length ( ) );
        }
        System.out.println ( map );
        Set<Map.Entry<String, Integer>> set = map.entrySet ( );
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator ( );
        while (iterator.hasNext ( )) {
            Map.Entry<String, Integer> element = iterator.next ( );
            if (element.getValue ( ) >= 7) {
                iterator.remove ( );
            }
        }
        System.out.println (map );
    }
}
