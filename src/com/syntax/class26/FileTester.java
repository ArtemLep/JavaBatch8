package com.syntax.class26;

public class FileTester {
    public static void main(String[] args) {
        File j = new JavaFile();
        File w = new WordFile();
        File p = new PdfFile();
        File[] files = new File[3];
        files[0] = j;
        files[1] = w;
        files[2] = p;
        for (File file : files) {
            file.edit();
            file.close();
            file.open();
        }
    }
}