package com.syntax.class13;

public class DogAttribute {
    public static void main(String[] args) {
        Dog Frenchie = new Dog();
        Frenchie.breed = "Frenchie";
        Frenchie.color = "Pale";
        Frenchie.name = "ArchiBald";
        Frenchie.paws = 4;
        Frenchie.size = "Medium";
        Frenchie.old = 3;
        Frenchie.bark();
        Frenchie.KnownCommands();
        Frenchie.play();
    }
}
