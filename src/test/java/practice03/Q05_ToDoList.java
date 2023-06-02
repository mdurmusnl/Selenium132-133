package practice03;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q05_ToDoList extends TestBase {

    @Test
    public void toDoListTest() {
//        Go to http://webdriveruniversity.com/To-Do-List/index.html
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

//        Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
        List<String> toDoList = new ArrayList<>(Arrays.asList("Prepare breakfast", "Wash the dishes", "Take care of baby", "Help your kid's homework", "Study Selenium", "Sleep"));
        System.out.println("toDoList = " + toDoList);
        WebElement toDoInput = driver.findElement(By.xpath("//input[@type='text']"));

        for (String w : toDoList) {
            waitFor(1);
            toDoInput.sendKeys(w + Keys.ENTER);
        }

        //Rest is homework...   on sunday 21 may   the last exercise   Q05 ToDoList class

//        Strikethrough all todos.
        List<WebElement> StrikethroughList = driver.findElements(By.xpath("//li"));
        for (WebElement w : StrikethroughList) {
            waitFor(1);
            w.click();
        }

//        Delete all todos.
        List<WebElement> deleteList= driver.findElements(By.xpath("//i"));
        for(WebElement w: deleteList){
            waitFor(1);
            w.click();
        }

//        Assert that all todos deleted.
       int numOfDeleteButtonAfterDelete= driver.findElements(By.xpath("//ul//li")).size();
        System.out.println(numOfDeleteButtonAfterDelete);
       // assertTrue(!driver.findElement(By.xpath("//input[@placeholder='Add new todo']")).isDisplayed());
       assertFalse(driver.findElement(By.xpath("//input[@placeholder='Add new todo']")).isDisplayed());


    }
}
