package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_GetPageSource {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait dynamic wait recommended wait, if needed wait upto 20sec, incase server is sloer then this will make webdriver wait
        driver.manage().window().maximize();
        //thse above steps are mandatory

           // test , ifthe amazon contains "Registry" on the home page
        driver.get("https://www.amazon.com");
        String pageSource=driver.getPageSource();//returns entire html source of the page
        //assertion with if statement for now
 if(pageSource.contains("Registry")){
     System.out.println("PASS");
 }else{
     System.out.println("FAIL");
     System.out.println(pageSource+"does not exist on the page");
 }
 driver.quit();

    }
}
