package com.ReviewClass6;
class Main{
abstract static class Tea {
    String TeaType;

    Tea(int a) {
    }

    void addSugar() {
    }
     static class Lemon extends Tea{

        Lemon(int a) {
            super(a);
        }

        @Override
        void addSugar() {
            super.addSugar();
        }
    }
     static class Chai extends Tea{

        Chai(int a) {
            super(a);
        }

        @Override
        void addSugar() {
            super.addSugar();
        }
    }

    public static void main(String[] args) {
        Tea tea=new Lemon(2);
        Tea chai=new Chai(1);
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
        System.out.println("For Chai Tea we need 1 spoons of sugar");

    }
}}