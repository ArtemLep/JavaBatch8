package com.syntax.class28;

import com.syntax.class20.A;

public class PersonTester {

    public static void main(String[] args) {
        Person davit=new Person("Davit","123456789",25,30000);
        /*System.out.println(davit.taxPaid);
        davit.taxPaid=0;  //CE cannot access and modify data
        System.out.println(davit.taxPaid);*/
        davit.setTaxPaid("45641351",-1);
        davit.setTaxPaid("123456789",-1);
        System.out.println(davit.getTaxPaid("45641351"));
        System.out.println(davit.getTaxPaid("123456789"));



    }
}