package personal_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Tb {
    protected WebDriver driver;
    @Before
    public void setpu(){
       System.setProperty("webdriver.chrome.driver","src/resourses/drivers/chromedriver.exe");
       driver= new ChromeDriver();
       driver.manage().window().maximize();

    }
}
