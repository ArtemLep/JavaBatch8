package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHAndling {

    public static void main(String[] args) throws IOException {


        String path="C:\\Users\\Owner\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\class34\\creentials.properties";

        //creating a connection to file
        FileInputStream fileInputStream=new FileInputStream(path);



        Properties properties=new Properties();
        //Loading the data from file to java program
        properties.load(fileInputStream);
        String username= (String) properties.get("username");
        String password= (String) properties.get("password");

        //getting the values
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}

