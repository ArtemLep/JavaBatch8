package com.syntax.class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {

        DaniloParents daniloParents = new Danilo();

        DaniloParents[] familyArray = new DaniloParents[3];
        familyArray[0] = new Danilo();
        familyArray[1] = new Jelena();
        familyArray[2] = new Milos();
        for (DaniloParents dp : familyArray) {
            dp.sleep();
            dp.eat();
        }

        daniloParents = new Jelena();
        daniloParents = new Milos();
        daniloParents.eat();
        daniloParents.sleep();
    }
}
