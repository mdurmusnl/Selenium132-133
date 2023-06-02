package com.myfirstproject.myfirstproject.day15ReadExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ReadExcel {  //we wont need driver so no need to extent TestBase class
/*
Import the apache poi dependency in your pom file
Create resources directory under java folder(right click on java and create the folder)
Add the excel file on the resources folder
Create a new package: excelautomation
Create a new class : ReadExcel
Create a new test method : readExcel()

 */
        @Test
   public void readExcelTest() throws IOException {
 //  Store the path of the  file in a string
       String path= "resources/Capitals.xlsx";
 //   Open the file
       FileInputStream fis=new FileInputStream(path);  //to read a file
//  Open the workbook using fileinputstream
       Workbook workbook= WorkbookFactory.create(fis);
//Open the first worksheet   // we can get the excel sheet by name or by index
       Sheet sheet1= workbook.getSheet("Sheet1");  //getting shet1 by name
          //  Sheet sheet1= workbook.getSheetAt(0);  //getting shet1 by index

//Go to first row
     Row row1=   sheet1.getRow(0); //This returns a row object

 //Go to first cell on that first row and print
      Cell cell1=  row1.getCell(0);  //this returns a cell object  -->r1C1=cell1=ro1 cell1
       System.out.println(cell1);  //its Country   first row first column
                                //to get first row second column  u gwt firt row second cell
//Go to second cell on that first row and print
      Cell r1C2=row1.getCell(1);
            System.out.println(r1C2);
 //Go to 2nd row first cell  and assert if the data equal to USA
        Row row2= sheet1.getRow(1);
        Cell r2C1=row2.getCell(0);
            System.out.println(r2C1);//USA
            System.out.println(r2C1.toString().toLowerCase()); //usa //we can convert it into a String to manipulate
     assertEquals("USA",r2C1.getStringCellValue());

//Go to 3rd row 2nd cell-chain the row and cell
        Cell r3C2=sheet1.getRow(2).getCell(1);

 //Find the number of row
            int totalRowNum=sheet1.getLastRowNum()+1;// here index start with 0  //11   by java4
//my way :) is
      Iterator<Row> m=  sheet1.rowIterator();
      int size=0;
      while (m.hasNext()){
          m.next();
          size++;
      }
            System.out.println(size);  //11


  //Find the number of used row
        int numOfUsedRow= sheet1.getPhysicalNumberOfRows();//index start with 1
            System.out.println(numOfUsedRow);
  //Print country, capital key value pairs as map object
            String country;
            String capital;
            Map<String,String> myMap=new HashMap<>();
            for(int i=1;i<size;i++){
                country =sheet1.getRow(i).getCell(0).toString();
                capital =sheet1.getRow(i).getCell(1).toString();
                myMap.put(country, capital);
            }
            System.out.println(myMap);   //{Greece=Athens, Canada=Ottowa, USA=D.C, Turkey=Ankara, Norway=Oslo,
            // Japan=Tokya, England=London,  Italy=Rome, France=Paris, Germany=Berlin}
   }



}
