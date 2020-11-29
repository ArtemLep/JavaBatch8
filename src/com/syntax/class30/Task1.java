package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    /*Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String args[]){
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Mersedes");
        cars.add("BMW");
        cars.add("VW");
        cars.add("Cadilac");
        cars.add("Buick");
        System.out.println(cars);


        System.out.println("+++++++++FOR LOOP +++++++++");
        for(String car:cars)
            System.out.println(car);

        System.out.println("++++++++++Using iterator +++++++++++");
        Iterator<String> iterator = cars.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }

    }


