package com.winjigo.tests;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.winjigo.browser.Browser;
import com.winjigo.driver.WebDriverHandler;
import com.winjigo.tests.BaseTest;
import com.winjigo.utilities.PropertiesConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before
    public void setUp() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        config = new PropertiesConfig("resources/config/config.properties");
        webDriverHandler.navigateTo("https://swinji.azurewebsites.net");
        webDriverHandler.maximizeWindow();
    }

    @AfterStep
    public void AfterStep(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.isFailed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
    }

//    @After()
//    public void tearDown() {
//        webDriverHandler.close();
//    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) WebDriverHandler.getWebDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
