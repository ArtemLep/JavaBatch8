package com.syntax.class28;

interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculate Area and calculate Perimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     Test your code*/

    void calculateArea();

    void calculatePerimetr();
}

class Circle implements Shape {

    int radius = 5;

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: = " + area);

    }

    @Override
    public void calculatePerimetr() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}

class Square implements Shape {
int side=5;
    @Override
    public void calculateArea() {
int SquareArea=side*side;
        System.out.println("Area of Square is : " + SquareArea);
    }

    @Override
    public void calculatePerimetr() {
int SquarePerimeter=4*side;
        System.out.println("Perimeter of Square is : " + SquarePerimeter);

    }
}
class main{
    public static void main(String[] args) {
        Shape  shape=new Circle();
        shape.calculateArea();
        shape.calculatePerimetr();

        Shape  shape1=new Square();
        shape1.calculateArea();
        shape1.calculatePerimetr();
    }

}