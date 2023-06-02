package com.myfirstproject.myfirstproject.day14;

import com.github.javafaker.Faker;
import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day_14_StaleElementReferenceException extends TestBase {  //when u refresh the page then it happens

    @Test
    public void staleElementReferenceExceptionTest1(){
        driver.get("https://testcenter.techproeducation.com/");
//        and click on CheckBox link
//        Location checkboxes element
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
//        REFRESH
        driver.navigate().refresh();
//        checkboxesLink.click();//StaleElementReferenceException

        driver.findElement(By.linkText("Checkboxes")).click();
    }
    @Test
    public void staleElementReferenceExceptionTest2(){  //we were expecting  staleElementReferenceException  but didnt happen
        driver.get("https://testcenter.techproeducation.com/");
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
        checkboxesLink.click();
        waitFor(5);
        driver.navigate().back();
        waitFor(5);
        checkboxesLink.click();

    }

    @Test
    public void staleElementReferenceExceptionTest3(){
        driver.get("https://www.amazon.com/");
        WebElement registry = driver.findElement(By.xpath("//*[@id='nav-xshop']//a[11]"));
        registry.click();
        waitFor(5);
        driver.navigate().back();
        waitFor(5);
        registry.click(); // staleElementReferenceException
          //solution
        driver.findElement(By.xpath("//*[@id='nav-xshop']//a[11]")).click();//relocate and fix it


    }

    public static class Day_14_NullPointerException {
        Faker faker;

        WebDriver driver;
        @Test
        public void nullPointerExceptionTest(){

            driver.get("https://www.amazon.com");//_NullPointerException   bcs driver is empty


        }
        @Test
        public void nullPointerExceptionTest2(){

            System.out.println(faker.name().lastName());//_NullPointerException   bcs faker is empty



        }

    }
}
