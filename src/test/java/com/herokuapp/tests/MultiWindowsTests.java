package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiWindowsTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).multipleWindowsLink();
    }

    @Test
    public void openingNewWindow(){
        new MultipleWindowsPage(driver).openingWindow(1)
                .verifyNewWindow("New Window");

    }

}
