package com.syntax.class22;

public class Main {
String school;
    int batch;
    int years;
    String LastDayOfSchool;

    Main() {
    }

    Main(String school,int batch, int years,String LastDayOfSchool) {
        this.school=school;
        this.batch=batch;
        this.years=years;
        this.LastDayOfSchool=LastDayOfSchool;
        System.out.println(school+" ");
    }




    public static void main(String[] args) {
        Main task1 = new Main();
        task1.school="Syntax";
        task1.batch=6;
        task1.years=2020;
        task1.LastDayOfSchool="07/30/2020";
        System.out.println(task1.school+" "+task1.batch+" "+task1.years+" "+task1.LastDayOfSchool);

}	}