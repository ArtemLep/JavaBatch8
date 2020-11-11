package com.syntax.class21;

public class MoneerClass extends ParentClass {

    void marry() {
        super.marry();
        System.out.printf("I will marry Katrina");
    }

    public static void main(String[] args) {
        MoneerClass moneerClass = new MoneerClass();
        moneerClass.marry();
    }
}
