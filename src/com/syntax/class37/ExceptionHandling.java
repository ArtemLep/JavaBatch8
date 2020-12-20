package com.syntax.class37;

import com.syntax.class36.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {

        Exception exception = new Exception();
        String path = null;
        FileInputStream fileInputStream = new FileInputStream(path);

        String name=null;
        name.length();
    }
}

