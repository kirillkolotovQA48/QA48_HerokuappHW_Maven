package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > a")
    WebElement clicHereLink;
    public MultipleWindowsPage openingWindow(int index) {
        click(clicHereLink);

        List<String> tabClicHere = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabClicHere.get(index));
        return this;
    }

    @FindBy(css = "body > div:nth-of-type(1) > h3")
    WebElement newWindow;
    public MultipleWindowsPage verifyNewWindow(String text) {
        Assert.assertTrue(shouldHaveText(newWindow,text,5));
        return this;
    }
}
