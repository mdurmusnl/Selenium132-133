package com.myfirstproject.day07;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class WindowHandle01MrAhmet extends TestBase {
    @Test
    public void windowHandleTest() throws InterruptedException {
//Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");
//Then user verifies the text : “Opening a new window”
        String page1HeaderText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window", page1HeaderText);
//Then user verifies the title of the page is “The Internet”
        Assert.assertEquals("The Internet", driver.getTitle());

    }
}