package com.myfirstproject;

import org.junit.*;


public class Day03_Annotations {
    /*
       there are 6 JUnit annotationa
       1) @Test : is used to create a test case. All test cases must be void type . we re not expecting to return smt.we create test cases to do assertion
       2) @Before and @After : are used to run before or after EACH @TEST method
               if we run the whole class then before and after method run for each method   but
               if we run jusr one specific test thwn before and after method run only once for that specific method
      3) @BeforeClass and @AfterClass : are used to run before or after EACH CLASS ONLY ONCE
      @Before and @After methods are more common
      4) Ignore : is used to SKIP a test case
       */

      @Before
    public void setUp(){
        System.out.println("This is BEFORE method>>>>>RUNS BEFORE EACH TEST METHOD");
        //  Pre Conditions are put in this @Before method such as SET UP, create driver, maximize window, implicit wait
    }
    @After
    public void tearDown(){
        System.out.println("This is AFTER method>>>>>RUNS AFTER EACH TEST METHOD");
        // After conditions are put in this method such as quit or close, reports generation,....
    }
    @BeforeClass
    public static void setUpClass(){
        System.out.println("This is BEFORE CLASS>>>>>RUNS BEFORE EACH CLASS ONCE");
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("This is AFTER CLASS>>>>>RUNS AFTER EACH CLASS ONCE");
    }

    @Test
    public void test01(){
         System.out.println("this is test case 1");
     }
    @Test
    public void test02(){
        System.out.println("this is test case 2");
    }
    @Test
    public void test03(){
        System.out.println("this is test case 3");
    }
    @Test
    public void test04(){
        System.out.println("this is test case 4");
    }
    @Test @Ignore
    public void test4(){   //testNG framework completely removes that green run button. testNG IS ADVANCED
        System.out.println("This is test case 4");
        System.out.println("@Ignore will make this method SKIPPED");
    }
    @Test
    public void test05(){
        System.out.println("this is test case 5");
    }
    @Test
    public void test06(){
        System.out.println("this is test case 6");
    }

}
