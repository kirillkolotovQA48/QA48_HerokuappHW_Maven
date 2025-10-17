package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;

public class FramesTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).nestedFramesPageLink();

    }
}
