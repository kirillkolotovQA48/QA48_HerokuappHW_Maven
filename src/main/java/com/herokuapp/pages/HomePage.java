package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > ul > li:nth-of-type(29) > a")
    WebElement javaScriptAlerts;
    public JavaScriptAlertsPage javaScriptAlertsLink() {
        click(javaScriptAlerts);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(css = "#content ul li:nth-of-type(34) a")
    WebElement framesPage;
    public NestedFramesPage nestedFramesPageLink(){
        click(framesPage);
        return new NestedFramesPage(driver);
    }

    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    WebElement multipleWindows;
    public MultipleWindowsPage multipleWindowsLink() {
        click(multipleWindows);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(css = "#content > ul > li:nth-child(11) > a")
    WebElement drop;
    public DropDownPage dropDownLink() {
        click(drop);
        return new DropDownPage(driver);
    }
}
