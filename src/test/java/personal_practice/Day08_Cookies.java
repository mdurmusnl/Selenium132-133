package personal_practice;

import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day08_Cookies extends TestBase{
    @Test
    public void cookiesTest() throws InterruptedException {
        //   -Go to amazon and automate the tasks:
        driver.get("https://www.amazon.com");

        //      1. Find the total number of cookies
           Set<Cookie > allCookies=driver.manage().getCookies();//
        int numOfCookies=allCookies.size();

        //       2. Print all cookies
           for(Cookie eachCookie: allCookies){
               System.out.println("Cookie -->"+ eachCookie);
               System.out.println("Cookies value-->"+eachCookie.getValue());
               System.out.println("Cookies name-->"+eachCookie.getName());
               System.out.println("Cookies Expire-->"+eachCookie.getExpiry());
               System.out.println("Cookies Domain-->"+eachCookie.getDomain());
           }


        //        3. Get the cookies by their name
        //entering the cookie name, returns the entire cookie

        //Cookie by name : i18n-prefs=USD; expires=Thu, 09 May 2024 02:31:32 CEST; path=/; domain=.amazon.com; sameSite=Lax

        //        4. Add new cookie   -->in order  to add new cookie we must create a cookie by Cookie class




        //        5. Delete a cookie by name


        //        6. Delete all the cookies




    }
}
