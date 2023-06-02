package com.myfirstproject.myfirstproject.day16_WriteExcelAndReusableMethods;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
//        Create a new class: WriteExcel
//        Create a new method: writeExcel()
    @Test
    public void writeExcelTest() throws IOException {

//        Store the path of the file as string and open the file
       String path= "resources/Capitals.xlsx";
        FileInputStream fis=new FileInputStream(path);
//        Open the workbook
        Workbook workbook= WorkbookFactory.create(fis);

//        Open the first worksheet
        Sheet sheet1= workbook.getSheet("Sheet1");

//        Go to the first row
              Row row1=sheet1.getRow(0);
   //ALL ABOVE ARE PRE REQUITES

//        Create a cell on the 4th column (3rd index) on the first row
         Cell r1C4=  row1.createCell(3);  //returns a cell

//        Write “POPULATION” on that cell
           r1C4.setCellValue("FAMOUS FOR");

//        Create a cell on the 2nd row 4TH cell(index3), and write Liverty sTATUE
                 Cell r2C4 =sheet1.getRow(1).createCell(3);
                 r2C4.setCellValue("Liberty Statue");

//        Create a cell on the 3rd row 4th cell(index3), and write Eiffel Tower
            sheet1.getRow(2).createCell(3).setCellValue("Eiffel Tower");

//        Create a cell on the 4th row 4th cell(index3), and write London Eye
        sheet1.getRow(3).createCell(3).setCellValue("London Eye");

//        Write and save the workbook
        FileOutputStream fos=new FileOutputStream(path); //to write on a file
         workbook.write(fos);
//        Close the file
        fis.close();
        fos.close();
//        Close the workbook
        workbook.close();
    }
     /*  NOTE :  WE CAN ADD STYLES WITH CELLSTYLE AND FONT OBJECT
        CellStyle style = workbook.createCellStyle();
        style.getBorderBottom();
        Font font = workbook.createFont();
        font.setBold(true);
 */
}
