package com.syntax.class28;
interface ParentInterface{
    void parentMethod();
}
class   ChildInterface implements ParentInterface{

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

}
class Main {
    public static void main(String[] args) {
        ChildInterface childInterface=new ChildInterface();
        childInterface.parentMethod();
        childInterface.childMethod();
    }
}
