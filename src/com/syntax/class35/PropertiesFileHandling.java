package com.syntax.class35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {
    public static void main(String[] args) throws IOException {
        String baseAddress = System.getProperty("user.dir");
        String fileAddress = baseAddress + "\\" + "ConfigData.properties";
        System.out.println(fileAddress);
        FileInputStream fileInputStream=new FileInputStream(fileAddress);
        Properties properties=new Properties();
        properties.load(fileInputStream);
       String username= properties.getProperty("username");
        System.out.println(username);

        FileOutputStream fileOutputStream=new FileOutputStream(fileAddress);
        properties.setProperty("phoneNumber","123456");
        properties.store(fileOutputStream,"Adding Phone Number");
    }
}



