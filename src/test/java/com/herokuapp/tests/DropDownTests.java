package com.herokuapp.tests;

import com.herokuapp.pages.DropDownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase{
    @BeforeMethod
    public void preconditon(){
        new HomePage(driver).dropDownLink();
    }

    @Test
    public void selectOptions(){
        new DropDownPage(driver).clickOnSelectOptions("Option 1")
                .verifyText("Option 1");
    }
}
