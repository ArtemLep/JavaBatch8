package com.syntax.class20;


/*Write program to inherit class A that has method printF which is static
and call or reuse that method into class B
 */
class A1 {

    public static void printF() {
        System.out.println("Inside static method of superclass");
    }
}

class B1{
    public static void main(String[] args) {
        A1 a = new A1();
        a.printF();
    }
}