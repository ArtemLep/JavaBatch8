package com.syntax.class19;

public class Employee {
    int age;
    String name;
    char grade;

    Employee() {
        System.out.println("I will be called everytime you create an object of this class");
    }

    Employee(int ageValue, String nameValue, char characterValue) {
        System.out.println("I am not a useless constructor i am initializing you fields");

        if (ageValue > 60 | ageValue < 18) {
            System.out.println("you should not be working please retire or wait to be 18 years old");
        } else {
            age = ageValue;

        }

        if (nameValue.length() > 25) {
            System.out.println("Please use short names like Aladin");

        } else {
            name = nameValue;
            grade = characterValue;
        }
    }

    void print() {
        System.out.println("Number " + age + " name " + name + " character " + grade);
    }

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.age = 200;
        employee1.name = "Davit";
        employee1.grade = 'M';
        System.out.println(employee1.age);
//======================================================================================================
        Employee employee2 =
                new Employee(5,
                        "Vlad",
                        'A');
        System.out.println(employee2.age);


    }
}

