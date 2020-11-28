package com.syntax.class30;

import com.syntax.class26.Main;

import java.util.ArrayList;

public class Task {
    /*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/
    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        System.out.println(alist.isEmpty());
        System.out.println(alist.contains("Artem"));
        System.out.println(alist.size());
        System.out.println(alist.toString());
    }
}