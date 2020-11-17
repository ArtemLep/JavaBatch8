package com.syntax.class22;


class Parent {
    void method() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void method() {
        System.out.println("Child method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();
        Child child = new Child();
        child.method();
    }

}