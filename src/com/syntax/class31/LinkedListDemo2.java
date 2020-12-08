package com.syntax.class31;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static double main(String[] args) {

        LinkedList<Integer> num=new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        double sum = 0;
        for(Integer d : num)
            sum += d;
        return sum;


    }
}
