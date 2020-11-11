package com.syntax.class21;

public class userClass {
    String name;
    long mobileNumber;

    userClass(String name, long mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.name = name;
    }
}

class useerInfo extends userClass {
    String address;

    useerInfo(String name, long mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void printDetails() {
        System.out.println("My name is " + name + " and my mobile number is " + mobileNumber + ". My address is " + address);
    }

    public static void main(String[] args) {
        useerInfo useerinfo = new useerInfo("Artem", 2223331111l, "Brooklyn, NY");
        useerinfo.printDetails();
    }
}
