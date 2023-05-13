package personal_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileDownloadTest extends TestBase{
    @Test
    public void downloadTest() throws InterruptedException {
//        https://testcenter.techproeducation.com/index.php?page=file-download
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
//        Download b10 all test cases, code.docx  file
      driver.findElement(By.partialLinkText("b10 all test cases")).click();
Thread.sleep(2000);
//        Then verify if the file downloaded successfully
   //the logic is if the file is exist on my local memort then its been dowloaded
        //first get the path of the file and then assert if it is exist or not  if exist then dowloaded
        String pathFile=System.getProperty("user.home")+"/Downloads/b10 all test cases, code (3).docx";
        Assert.assertTrue(Files.exists(Paths.get(pathFile)));


    }

}
