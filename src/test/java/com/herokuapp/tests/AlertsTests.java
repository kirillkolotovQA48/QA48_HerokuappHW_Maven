package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
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
        new AlertsPage(driver).comfirmAlert()
                .verifyResaltAlert("You successfully clicked an alert");

    }
    @Test
    public void clickForJsConfirm(){
        new AlertsPage(driver).confirmActionOnAlert("OK")
                .verifyResaltAlert("Ok");
    }

    @Test
    public void clickForJsPromt(){
        new AlertsPage(driver).sandPromtOnAlert("Check")
                .verifyResaltAlert("Check");
    }

    @Test
    public void clickForJsPromptCancel(){
        new AlertsPage(driver).sandPromtOnAlert(null)
                .verifyResaltAlert("null");
    }
}
