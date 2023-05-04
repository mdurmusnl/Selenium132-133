package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_xpath_css {
    /*
    test case
    create a class: locators
    when
         user goes to : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    And
          enter username
    And enter password
    and click on submit button
    Then
         verify the login button is succesfull
         then logut the app
         then verify the logout is succesfull

     */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void  loginTest(){
//username
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
//password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
//login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
    @Test
    public void loginTest2(){
//username
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
//password
        driver.findElement(By.cssSelector("input[typ  e='password']")).sendKeys("admin123");
//login button
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
