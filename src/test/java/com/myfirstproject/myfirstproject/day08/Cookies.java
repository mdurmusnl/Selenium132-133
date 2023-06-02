package com.myfirstproject.myfirstproject.day08;

import com.myfirstproject.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Cookies extends TestBase {
    @Test
    public void cookiesTest() throws InterruptedException {
 //   -Go to amazon and automate the tasks:
        driver.get("https://www.amazon.com");

 //      1. Find the total number of cookies
   Set<Cookie> allCookies=driver.manage().getCookies();
    int totalNumberOfCookies=allCookies.size();
        System.out.println(totalNumberOfCookies);
 //       2. Print all cookies
        for (Cookie eachCookie:allCookies) {
            System.out.println("Cookie-->"+eachCookie);
            System.out.println("Cookie value-->"+eachCookie.getValue());//for exm     USD
            System.out.println("Cookie name-->"+eachCookie.getName()); // for exm     i18n-prefs
            System.out.println("Cookie Expire-->"+eachCookie.getExpiry());// for exm  wed May 0818:31:59CDT 2024
            System.out.println("Cookie Domain-->"+eachCookie.getDomain());//for exm  .amazon.com
        }
 //        3. Get the cookies by their name
               //entering the cookie name, returns the entire cookie
        System.out.println("Cookie by name : "+driver.manage().getCookieNamed("i18n-prefs"));
           //Cookie by name : i18n-prefs=USD; expires=Thu, 09 May 2024 02:31:32 CEST; path=/; domain=.amazon.com; sameSite=Lax

 //        4. Add new cookie   -->in order  to add new cookie we must create a cookie by Cookie class
        Cookie myFavoriteCookie=new Cookie("my-cookie","chocolate-chips");// this class  constructor  is overloaded, i just used one which is 2 parameter
          driver.manage().addCookie(myFavoriteCookie);
       Thread.sleep(3000);
       int newTotalNumbrOfCookies=driver.manage().getCookies().size();   //driver.manage().getCookies()returns a Set
        System.out.println(newTotalNumbrOfCookies);

 //        5. Delete a cookie by name
        driver.manage().deleteCookieNamed("i18n-prefs");//this is an amazon cookie we can not delete permenantly   its just temporary delete
        System.out.println("after deleting a cookie "+driver.manage().getCookies().size());
 //        6. Delete all the cookies
driver.manage().deleteAllCookies();
        System.out.println("after deleting all cookies"+ driver.manage().getCookies().size());



    }
}
