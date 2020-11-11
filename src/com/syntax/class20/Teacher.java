package com.syntax.class20;

public class Teacher {
    /*Write a Java program called Teacher.
    Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
      Test all 4 classes*/
    String name ;
    int YearsExperience;
    Teacher(String name,int YearsExperience){
        this();
    }

    Teacher() {

    }
    public void printTeacher(String name,int YearsExperience){
        System.out.println("I am a Teacher  " + name + " with " + YearsExperience + " years of experience!");

    }
}

class MathTeacher extends Teacher {
    int yearsOld;

    MathTeacher(int yearsOld) {
        this.yearsOld = yearsOld;
        System.out.println("I am MathTeacher ,i am " + yearsOld + " years old");

    }
}

class ChemistryTeacher extends Teacher {
    String Fname;
    String Lname;

    ChemistryTeacher(String Lname, String Fname) {
        System.out.println("I am " + Fname + " " + Lname + " ChemistryTeacher ");

    }
}

class PianoTeacher extends Teacher {
    String nameSchool;

    PianoTeacher(String nameSchool) {
        System.out.println("I am a PianoTeacher in " + nameSchool);

    }
}

class Test {
    public static void main(String[] args) {
        PianoTeacher t1 = new PianoTeacher("Harvard");
        MathTeacher t2 = new MathTeacher(35);
        ChemistryTeacher t3 = new ChemistryTeacher("Snagg", "Sevirus");

    }

}