package personal_practice;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest extends TestBase{
    //we do not use Selenium to check if file exist or not, we can use Java to work with files
    @Test
    public void isExist(){
//        Pick a file on your desktop
       String userHome= System.getProperty("user.home");

       String pathOfFlower=userHome+"\\OneDrive\\Desktop\\flower.jpg";
//        And verify if that file exist on your computer or not
        Assert.assertTrue(Files.exists(Paths.get(pathOfFlower)));
//        Get the path of home directory

//check if the driver licence file exist in my desltop or not


    }

}
