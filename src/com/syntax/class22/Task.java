package com.syntax.class22;

public class Task {
    /*Create 1 class in which create a method that will calculate the area (volume) of
Rectangle
Square
Box*/

    public void area(int height){
        System.out.println("The area of Square is "+height*2);
    }
    public void area(int height,int length){
        System.out.println("The area of Rectangle is "+height*length);
    }
    public void area(int height,int length,int width){
        System.out.println("The area of Box is "+height*length*width);
    }

    public static void main(String[] args) {
        Task task=new Task();
        task.area(6);
        task.area(4,6);
        task.area(2,3,4);
    }

}
