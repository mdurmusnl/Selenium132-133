package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

              //create a new class :verify title test
             //navigate to techproeducation.com homepage
            //verify if the page title is "Techpro Education  | Online It Courses & Bootcamps"
        driver.get("https://techproeducation.com");
       String  actualtitle= driver.getTitle(); //returns the title of the page as string
           ////assertion with if statement for now
            if(actualtitle.equals("Techpro Education  | Online It Courses & Bootcamps")){
                System.out.println("PASS");
            }else{
                System.out.println("fail");
                System.out.println("EXPECTED TITLE : Techpro Education  | Online It Courses & Bootcamps");
                System.out.println("actual title :"+ actualtitle);
            }



    }
}
