package practice03;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Q02_FileUpload extends TestBase {


    @Test
    public void uploadTest(){
//        Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

//        Type "My File" into "Notes about the file" input
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("My File");

            String url = System.getProperty("user.home")+"\\OneDrive\\Desktop\\text.txt";
        System.out.println(url);  //     ul ==>  C:\Users\mdurm\OneDrive\Desktop\text.txt

//        Click "Choose File" button
//        Select the file to upload
       driver.findElement(By.xpath("//input[@type='file']")).sendKeys(url);

//        Click on "Press" button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        Assert that "Your notes on the file were" equals "My File"
        String note=driver.findElement(By.xpath("//blockquote")).getText();
        assertEquals("My File",note);
//        Assert that file Content contains "Hello, I am uploaded file"
         String  fileContent=driver.findElement(By.tagName("pre")).getText();   // this is also possible--> By.xpath("//pre")
     assertEquals("Hello, I am uploaded file",fileContent);

    }
}
