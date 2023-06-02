package com.myfirstproject.myfirstproject.day11;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends TestBase {
/*
https://the-internet.herokuapp.com/tables
Create a class: WebTables
Task 1 : Print the entire table

Task 3 : Print Last row data only
Task 4 : Print column 5 data in the table body
Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
 */
@Test
    public void printTable(){
    driver.get("https://the-internet.herokuapp.com/tables");
    extentTest.pass("***print the entire table***");
//    Task 1 : Print the entire table
    String entireTable= driver.findElement(By.xpath("//table[@id='table1']")).getText();
    System.out.println(entireTable);//this gives the whole table as one body  like a whole bread
//alternatively  we get get each date as a list of Web Elements
    //        ALTERNATIVELY
    List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']//td"));
    for (WebElement eachData : elements){
        System.out.println(eachData.getText());
        extentTest.pass(eachData.getText());
    }                                             //this prints each data one by one

//     get specific indexed elements
    System.out.println("6th data in the table --> "+ elements.get(5).getText());//rember list indexes start from zero


}

//    Task 2 : Print All Rows
    @Test
    public void printAllRows(){
        driver.get("https://the-internet.herokuapp.com/tables");
 List<WebElement> allRows= driver.findElements(By.xpath("//table[@id='table1']//tr"));
     int rowNum=1;
     for(WebElement eachRow:allRows){
         System.out.println(rowNum+  " :"  +eachRow.getText());
         rowNum++;
     }
        System.out.println("2nd row date"+allRows.get(1).getText()); //remmeber list indexes start from 1

//        /Task 3 : Print Last row data only
        System.out.println("2nd row date"+allRows.get(allRows.size()-1).getText());

    }

 //Task 4 : Print column 5 data in the table body
 @Test
 public void printColumns(){
     driver.get("https://the-internet.herokuapp.com/tables");
     List<WebElement> column5Data= driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));

     int colNum=1;
     for(WebElement eachData:column5Data){
        System.out.println(colNum+ " : "+eachData.getText());
        colNum++;
    }




 }




}
