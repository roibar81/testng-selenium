package org.example.basicks;

import org.testng.annotations.*;

public class Annotations1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Initialize Selenium");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Opening Browser");
    }

    @Test
    public void test1(){
        System.out.println("Inside Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Inside Test 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Closing Browser");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Destroy Selenium");
    }
}