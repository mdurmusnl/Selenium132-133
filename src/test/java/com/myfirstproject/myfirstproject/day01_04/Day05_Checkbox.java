package com.myfirstproject.myfirstproject.day01_04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05_Checkbox {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
    }


    @Test

    public void checkboxTest(){  //first locate the element then do whatever u want to do
 //then click on checkbox1 if box is not selected
   //locating the element by xpath
      WebElement checkbox1= driver.findElement(By.xpath("//input[@id='box1']"));
boolean isCheckbox1Selected= checkbox1.isSelected();
      if(!isCheckbox1Selected){    //if not selected then click
          checkbox1.click();
      }

//then click on checkbox2 if box is not selected   --> (short way of typing follow below)
     if( !driver.findElement(By.xpath("//[@id='box2']")).isSelected()){   //again it means if checkbox is not selected then click on it
         driver.findElement(By.xpath("//[@id='box2']")).click();
     }

//then verift if checkbox1 is checked
        Assert.assertTrue(checkbox1.isSelected());  //PASS if checkbox1 us selected FAILS if checkbox1 is not selected


    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
