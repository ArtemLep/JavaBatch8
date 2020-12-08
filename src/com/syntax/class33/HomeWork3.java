package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWork3 {
    /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {
        HashMap<Integer, String> store = new HashMap<>();
        store.put(111, "TV");
        store.put(222, "Printer");
        store.put(333, "PC");
        store.put(444, "Oven");
        store.put(555, "Iphone");
        Iterator<Map.Entry<Integer, String>> items = store.entrySet().iterator();
        for (Map.Entry<Integer, String> item : store.entrySet()) {
            System.out.println(item);

        }
    }
}

