package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;

public class HomeWork2 {
    public static void main(String[] args) {


    /*Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
     */
    HashSet<String> students = new HashSet<String>();
        HashSet<Integer> ID = new HashSet<Integer>();
        students.add("Bryan");
        ID.add(123);
        students.add("Scott");
        ID.add(234);
        students.add("James");
        ID.add(345);
        students.add("John");
        ID.add(456);

        Iterator<String> i = students.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        Iterator<Integer> c = ID.iterator();
        while (c.hasNext())
            System.out.println(c.next());
    }
}