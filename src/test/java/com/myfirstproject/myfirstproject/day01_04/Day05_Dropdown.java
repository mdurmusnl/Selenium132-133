package com.myfirstproject.myfirstproject.day01_04;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class Day05_Dropdown extends TestBase {

    @Test
    public void selectByIndexTest() throws IOException {
        //go to https://testcenter.techproeducation.com/index.php?page=dropdown
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    //1st create  a method selectByIndexTest and select option 1 using index
               //locating the dropdown
   WebElement dropdown=driver.findElement(By.id("dropdown"));
              //then create a select object
        Select options =new Select(dropdown);
              // use this select object to select your option
        options.selectByIndex(1 );

    }
      @Test
    public void selectByValueTest() throws IOException {
   //2nd  create method selectByValueTest select option 2 by value
          driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
               //locating the dropdown
          WebElement dropdown=driver.findElement(By.id("dropdown"));
              //then create a select object
          Select options =new Select(dropdown);
             // use this select object to select your option
          options.selectByValue("2"); // In the page <option value="2">option 2</option>      the value is "2"

      }
@Test
    public void selectByVisibleTextTest() throws IOException {
    //3rd  create method selectByVisibleTextTest select Option 1 by value
    driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
       //locating the dropdown
    WebElement dropdownElement=driver.findElement(By.id("dropdown"));
      Select options =new Select(dropdownElement);
      options.selectByVisibleText("Option 1");//<option value="1">option 1</option>

}

   @Test
    public void printAllTest() throws IOException, InterruptedException {
    //4th  create a method printAllTest print all dropdwonn value,-->  values of  states--will be a list of a web element

       driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
       WebElement state=driver.findElement(By.id("state"));
       Select options= new Select(state);
       List<WebElement> allStates=options.getOptions(); //we will put all the states values in a list
                                                   // getOptions() method returns a List<WebElement>
       //how to print a single option from the List
   for(WebElement eachState: allStates){
       System.out.println(eachState.getText());
   }
 Thread.sleep(1000);
//5th   verify if the dropdown has Texas
       Assert.assertTrue(state.isSelected());
       boolean isTexasExist=false;
       for(WebElement eachState: allStates){

           if(eachState.getText().equals("Texas")){
               isTexasExist=true;
           }
       }
Assert.assertTrue(isTexasExist);


   }


   @Test
    public void printFirstSelectedOptionTest(){
    //6th  create a method   printFirstSelectedOptionTest  print first selected option
       driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
       WebElement state=driver.findElement(By.id("state"));
       Select options= new Select(state);
       System.out.println(options.getFirstSelectedOption().getText());
       //System.out.println(options.getFirstSelectedOption()); //return a hashcode ,this not the task

       //7th find the size od the dropdown
     //print "expected is not actual" if there are not 3 elements in the dropdown
        int numberOfOption =options.getOptions().size();   // getOptions() returns a list  List<WebElement>
 Assert.assertEquals("expected is not actual",52,numberOfOption);  //it prints if the test failes,   it will fail and it will print the mesaage bc states are 52


   }


}
