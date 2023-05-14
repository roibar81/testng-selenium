package org.example.testng.logintests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Start Test Log In Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Finish Test Log In Class");
    }
    @Test
    public void loginViaEmail(){
        System.out.println("Login via Email");
    }
    @Test
    public void loginViaFacebook(){
        System.out.println("Login via Facebook");
    }
    @Test
    public void loginViaTwitter(){
        System.out.println("Login via Twitter");
    }
}
