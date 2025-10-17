package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > ul > li:nth-of-type(1) > button")
    WebElement clickForJsAlert;
    public AlertsPage comfirmAlert() {
        click(clickForJsAlert);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;
    public AlertsPage verifyResaltAlert(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }

    @FindBy(css = "#content ul li:nth-of-type(2) button")
    WebElement clickForJsComfirm;
    public AlertsPage confirmActionOnAlert(String action) {
        click(clickForJsComfirm);

        if(action !=null && action.equals("OK")){
            driver.switchTo().alert().accept();
        }
        else if(action !=null && action.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }

        return this;
    }

    @FindBy(css = "#content ul li:nth-of-type(3) button")
    WebElement clickForJsPromt;
    public AlertsPage sandPromtOnAlert(String message) {
        click(clickForJsPromt);

        Alert promt = driver.switchTo().alert();

        if (message == null) {
            promt.dismiss();
        } else {
            promt.sendKeys(message);
            promt.accept();
        }
        return this;
    }

}
