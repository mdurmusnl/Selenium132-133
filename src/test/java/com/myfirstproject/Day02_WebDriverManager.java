package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_WebDriverManager {
    public static void main(String[] args) {
    //set up
        //without WebdriverManager
        //earlier we did like this  not recommended
           //  System.setProperty("webdriver.chrome.driver","src/resourses/drivers/chromedriver.exe"); chrome setup
                  //WebDriver driver= new ChromeDriver();
           //   System.setProperty("webdriver.firefox.driver","src/resourses/drivers/firefoxdriver.exe");  firefox setup
               // WebDriver driver= new FirefoxDriver();
 //in our local we have chrome driver in driver package but we sont have firefoxdriver we didnt downloaded it,
         //it can couse path issue

        //with WebDriverManager   no path   better way  recommended
      WebDriverManager.chromedriver().setup();           //chrome setup
        WebDriver driver=new ChromeDriver();            // creating chrome driver
           driver.manage().window().maximize();         //maximazing
        driver.get("https://www.techproeducation.com"); //navigating
/*
        WebDriverManager.firefoxdriver().setup();//chrome setup
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");
*/


    }
}
