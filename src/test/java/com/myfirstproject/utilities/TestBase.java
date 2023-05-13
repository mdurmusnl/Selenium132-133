package com.myfirstproject.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase {
   //   WebDriver driver;  //acceess modifier is default
       //singleton driver  means one and onlt one driver just like a car has one  driver inside
    protected static WebDriver driver;  //
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
      driver.quit();
    }

    //create a method to take screenshot of entire page
    public void takeScreenShotOfTheEntirePage() throws IOException {
  //  1. TakeScreenShot class with getScreenShotAs method to capture the screenshot
      File image=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //in cucumber it will be byte  it returns a java file

//   2nd  create a path to save the image (not in the desktop or in dowloads folder)
        //create a date for giving dynamic name otherwise the ss overrides
      String now=  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); //getting local date in this format
         //current folder                          foldername  subfolder name   image name
        String path=System.getProperty("user.dir")+"/test-output/Screenshots/"+now+"image.png";  // we say -->save it here

// 3rs  save the image in the path by java as a file
        FileUtils.copyFile(image,new File(path));//

    }

// this method captures ss of a specific element
//this methos accepts an element and saves the ss of that element in the testoutput folder
    public void takeScreenshotOfThisElement(WebElement element) throws IOException {
      File image=  element.getScreenshotAs(OutputType.FILE);
        String now=  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path=System.getProperty("user.dir")+"/test-output/ElementScreenshots/"+now+"image.png";
        FileUtils.copyFile(image,new File(path));





    }



}



