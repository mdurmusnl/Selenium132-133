package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_VerifyUrlTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //test care
           //navigate to Techproeducation home page
        //verify if google homepage url is "https://www.techproeducation.com"
    driver.get("https://www.techproeducation.com");
   String  actualCurrentUrl=  driver.getCurrentUrl();//returns the existing url as string
//assertion with if statement for now
        if(actualCurrentUrl.equals("https://www.techproeducation.com")){
            System.out.println("PASS");
        }else{
            System.out.println("fail");
            System.out.println("EXPECTED url :"+"https://www.techproeducation.com");
            System.out.println("actual title :"+ actualCurrentUrl);
        }
driver.quit();




    }
}
