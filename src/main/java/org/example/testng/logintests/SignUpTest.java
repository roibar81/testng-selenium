package org.example.testng.logintests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Start Test Sign Up Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Finish Test Sign Up Class");
    }
    @Test
    public void signUpViaEmail(){
        System.out.println("Sign Up via Email");
    }
    @Test
    public void signUpViaFacebook(){
        System.out.println("Sign Up via Facebook");
    }
    @Test
    public void signUpViaTwitter(){
        System.out.println("Sign Up via Twitter");
    }
}
