package com.ReviewClass6;

class MethodsExample2 {

    public static void main(String[] args) {

        printNTime("Please Study ",10);
    }

    static void printNTime(String word, int nTimes) {
        for (int i = 0; i < nTimes ; i++) {
            System.out.println(word);
        }
    }

}