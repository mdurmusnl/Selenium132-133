package practice03;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Q01_Clicks extends TestBase {
     /*
Given
    Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
When
    Click all the buttons
Then
    Assert all buttons clicked
 */
    @Test
    public void clickTest(){
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        driver.findElement(By.id("onblur")).click();  //onblur means click somewhere else beside onblur, we can click the the enxt element
       waitFor(1);
        driver.findElement(By.id("onclick")).click();  //the code does onblur button triggered

        waitFor(1);
        driver.findElement(By.id("onclick")).click();  //the code does onclick button triggered
// the next is onContectmENU button     contextMenu  is right click so we need Actions class
        WebElement onContextMenu=driver.findElement(By.id("oncontextmenu"));
        WebElement onDoubleClick=driver.findElement(By.id("ondoubleclick"));
        WebElement onfocus = driver.findElement(By.id("onfocus"));  //similar to click
        WebElement onkeydown = driver.findElement(By.id("onkeydown")); //press any key on keyboard
        WebElement onkeyup = driver.findElement(By.id("onkeyup"));//keep press and when u release then it is triggrered
        WebElement onkeypress = driver.findElement(By.id("onkeypress"));
        WebElement onmouseover = driver.findElement(By.id("onmouseover"));
        WebElement onmouseleave = driver.findElement(By.id("onmouseleave"));
        WebElement onmousedown = driver.findElement(By.id("onmousedown"));

        Actions  actions = new Actions(driver);      //method chain
        actions.pause(Duration.ofSeconds(1)).contextClick(onContextMenu).
                pause(Duration.ofSeconds(1)).doubleClick(onDoubleClick).
                pause(Duration.ofSeconds(1)).click(onfocus).
                pause(Duration.ofSeconds(1)).click(onkeydown).sendKeys(Keys.SPACE).
                pause(Duration.ofSeconds(1)).click(onkeyup).sendKeys(Keys.SPACE).
                pause(Duration.ofSeconds(1)).click(onkeypress).sendKeys(Keys.SPACE).
                pause(Duration.ofSeconds(1)).moveToElement(onmouseover).
                pause(Duration.ofSeconds(1)).moveToElement(onmouseleave).   //we sould remove the mouse to trigger this button
                pause(Duration.ofSeconds(1)).click(onmousedown). //this next button click triggers the previous button to be triggered
                pause(Duration.ofSeconds(1)).click(onmousedown). //this repetition of this click triggers onmousedown button
                perform();
//        Assert all buttons clicked=
              List<WebElement> allButtons=driver.findElements(By.xpath("//button"));
             int numberOfTriggeredElements = driver.findElements(By.xpath("//p[.='Event Triggered']")).size();
             assertEquals(allButtons.size(), numberOfTriggeredElements);




    }
}
