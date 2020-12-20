package com.syntax.class01;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        Set<Map.Entry<String, String>> setEntry = map.entrySet();

        String value;
        for (Map.Entry<String, String> entry : setEntry) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
        System.out.println("HashMap After Remove :");
        map.remove("ONE");
        map.remove("FOUR");
        for (Map.Entry<String, String> entry1: setEntry) {
            System.out.println(entry1.getKey()+ " : "+entry1.getValue() );
        };

    }
}