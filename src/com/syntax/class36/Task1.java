package com.syntax.class36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class36/Info.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");
        System.out.println("The value of browser is " + browser);
        System.out.println("The URL is " + url);
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
    }
}
