package com.syntax.class21;

import com.syntax.class20.C;

public class Shape {
    int radius;

    Shape(int radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius);
    }

    void Calculate() {

        System.out.println("The area of the circle is " + 3.14 * (radius * radius));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.Calculate();
    }
}