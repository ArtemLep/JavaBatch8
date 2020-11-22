package com.syntax.class27;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/");

    }
}