package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "dropdown")
    WebElement dropdown;
    public DropDownPage clickOnSelectOptions(String text) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);

        return this;
    }

    public DropDownPage verifyText(String text) {
        String SelectedOption1 = new Select(dropdown)
                .getFirstSelectedOption()
                .getText();
        Assert.assertTrue(shouldHaveText(dropdown, SelectedOption1,5));
        return this;
    }
}
