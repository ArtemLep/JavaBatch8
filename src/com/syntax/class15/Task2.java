package com.syntax.class15;

public class Task2 {
    public static void main(String[] args) {
        String holliday="Halloween";
        if(holliday.isEmpty()) {
        }else{
            if(holliday.length()%2!=0||holliday.length()>3){
                System.out.println(holliday.substring(0,5)+" M "+holliday.substring(5,9));
            }
        }
    }
}

