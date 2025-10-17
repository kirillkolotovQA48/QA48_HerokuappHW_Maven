package com.herokuapp.tests;

import com.herokuapp.pages.JavaScriptAlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).javaScriptAlertsLink();
    }

    @Test
    public void clickForJsAlert() {
        new JavaScriptAlertsPage(driver).comfirmAlert()
                .verifyResaltAlert("You successfully clicked an alert");

    }
    @Test
    public void clickForJsConfirm(){
        new JavaScriptAlertsPage(driver).confirmActionOnAlert("OK")
                .verifyResaltAlert("Ok");
    }

    @Test
    public void clickForJsPromt(){
        new JavaScriptAlertsPage(driver).sandPromtOnAlert("Check")
                .verifyResaltAlert("Check");
    }

    @Test
    public void clickForJsPromptCancel(){
        new JavaScriptAlertsPage(driver).sandPromtOnAlert(null)
                .verifyResaltAlert("null");
    }
}
