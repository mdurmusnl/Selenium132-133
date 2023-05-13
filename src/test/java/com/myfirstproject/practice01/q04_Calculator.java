package com.myfirstproject.practice01;

import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class q04_Calculator  {





    // Create chrome driver by using @Before annotation and WebDriverManager
    WebDriver driver;
@Before
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
  @Test
    public void additionTest(){
      // Navigate to  https://testpages.herokuapp.com/styled/index.html
      driver.get("https://testpages.herokuapp.com/styled/index.html");
      // Click on  Calculator under Micro Apps
      driver.findElement(By.id("calculatetest")).click();
      // Type any number in the first input
      driver.findElement(By.id("number1")).sendKeys("4");
      // Type any number in the second input
      driver.findElement(By.id("number2")).sendKeys("6");
      // Click on Calculate
   driver.findElement(By.id("calculate")).click();
      // Get the result
     String result= driver.findElement(By.id("answer")).getText();
      // Verify the result
      assertEquals("10",result);
      // Print the result
      System.out.println(result);


  }
    @Test
    public void multuplicationTest(){
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("4");
        // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("6");


        //select "multiplication" operation fro mthe dropdown box
        //  web element is  : <select id="function" name="function".
         //   <option value="times" > times </option>
        WebElement functionDropDown=driver.findElement(By.id("function"));   //we touch the dropdown box and then we will sleect multiplication operation
        Select select = new Select(functionDropDown);
        select.selectByValue("times");


        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        String result= driver.findElement(By.id("answer")).getText();
        // Verify the result
        assertEquals("24",result);
        // Print the result
        System.out.println(result);


    }
  @After
    public  void tearDown(){
    driver.quit();
  }

}
