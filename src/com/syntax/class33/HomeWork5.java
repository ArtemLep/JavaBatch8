package com.syntax.class33;

import java.util.*;

public class HomeWork5 {
    /*Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/
    public static void main(String[] args) {
        Map<String,Integer>NameSalry=new HashMap<>();
        NameSalry.put("Artem",3000);
        NameSalry.put("Den",3500);
        NameSalry.put("Anna",4000);
        NameSalry.put("Jack",6000);
        NameSalry.put("Ali",8800);
        int max = Collections.max(NameSalry.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : NameSalry.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
                System.out.println("The Highest salary has: "+entry);

            }

        }
    }
}
