package com.ReviewClass7;

public class EncapsulationDemo {
    private String empName="John";
    private int empAge=30;
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }

}
class Main{
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.getEmpName();
        encapsulationDemo.getEmpAge();
        System.out.println("Employee Name: "+ encapsulationDemo.getEmpName());
        System.out.println("Employee Age: "+ encapsulationDemo.getEmpAge());

    }
}


