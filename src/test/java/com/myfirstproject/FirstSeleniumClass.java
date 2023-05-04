package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //this is one way to create an automation script
        // we won't use main method later on
        System.setProperty("webdriver.chrome.driver","src/resourses/drivers/chromedriver.exe");
        //create a driver
        WebDriver driver=new ChromeDriver();
        //nevigate to google.com
        driver.get("https://www.techproeducation.com");
    }
}
