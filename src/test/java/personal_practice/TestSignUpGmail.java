package personal_practice;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestSignUpGmail extends TestBase {

    /*

Given
        https://www.gmail.com
When
        User enters url, user needs to be able to sign up
Then
        User presses sign up
And
        User enters name
And
        User enters last name
And
        User enters username
And
        User enters password
And
        User confirms password
And
        User confirms
And
        User enters number
And
        User presses next
And
        User needs to see "Verify your phone number"
And
        If test passed close window

 */
    @Test
    public void signUpGmail() throws InterruptedException {
        driver.get("https://www.gmail.com");
     driver.findElement(By.xpath("//span[.='Create account']")).click();
      //  User enters name
        driver.findElement(By.xpath("//span[.='For my personal use']")).click();
        Faker faker =new Faker();
        String fname=faker.name().firstName();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
   // User enters last name
       String lastname= faker.name().lastName();
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
      String username=faker.name().username();
     String additionalNumbers= faker.number().digits(4);
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username+additionalNumbers);
       String password=faker.internet().password();
     driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(password);
         //User confirms password

        driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(password);
        //driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click(); this and below are same
        driver.findElement(By.xpath("//span[.='Volgende']")).click();
//user enters the number
       driver.findElement(By.xpath("//div[@role='combobox']")).click();
       driver.findElement(By.xpath("(//li[@data-value='nl'])[1]")).click();





       // WebElement selectElement=driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
       //   Thread.sleep(3000);
       //  Select options= new Select(selectElement);
       //   options.selectByVisibleText("Canada (+1)");
       //    Thread.sleep(3000);
       //  driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("4133068037");
       //  driver.findElement(By.xpath("//span[.='Volgende']")).click();

    }

}
