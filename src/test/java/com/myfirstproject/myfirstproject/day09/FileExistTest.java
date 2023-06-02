package com.myfirstproject.myfirstproject.day09;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExistTest {
//we do not use Selenium to check if file exist or not, we can use Java to work with files
@Test
public void isExist(){
//        Pick a file on your desktop
//        And verify if that file exist on your computer or not
//        Get the path of home directory
    String userHome = System.getProperty("user.home");
    System.out.println(userHome); // C:User//mdurm
      String pathOfDLicence=userHome+"\\OneDrive\\Desktop\\licence.jpg";
    System.out.println(pathOfDLicence);
//check if the driver licence file exist in my desltop or not
    Assert.assertTrue(Files.exists(Paths.get(pathOfDLicence)));

}


}
