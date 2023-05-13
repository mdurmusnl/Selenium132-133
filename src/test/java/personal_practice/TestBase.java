package personal_practice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
    //singleton driver
  protected   WebDriver driver;
  @Before
    public void setUp(){
     System.setProperty("webdriver.chrome.driver","src/resourses/drivers/chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();


  }
  @After
    public void tearDown(){

      //driver.quit();
  }
}
