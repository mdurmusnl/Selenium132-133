package com.myfirstproject.Day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import personal_practice.TestBase;

public class Dynamic_xpath extends TestBase {


    @Test
    public void dynamicXpath(){
//do login the page using dynmaic xpaxth
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  //locating username : admin elelemnt and doing assertion
          //  we used -->  //tag[text()='full visible text of the element']  and didnt work     note that full or partial text are both possible
          //then we used  ==>  //p[.='Username Admin']   this is also possible --> //*[.='Username Admin']
       // String userNameText=driver.findElement(By.xpath("//p[text()='Username Admin']")).getText();     -->thhis didnt work so we use another way

        String userNameText=driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
        Assert.assertEquals("Username : Admin",userNameText);
/*as an alternative way
        WebElement userName=driver.findElement(By.xpath("//p[.='Username Admin']")).getText();
        Assert.assertEquals("Username Admin",userName.getText());

     */


        //locate username  and action
    driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
//locate password  and action
        driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("admin123");  //this is also possible  if both exist then we can locate the element
        //driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
//locate log in button and action
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

    }

}
