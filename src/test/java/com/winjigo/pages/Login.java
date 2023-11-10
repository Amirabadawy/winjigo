package com.winjigo.pages;

import com.winjigo.pages.BasePage;
import org.openqa.selenium.By;

public class Login extends BasePage {

    private final By emailField = By.id("Email");
    private final By passwordField = By.id("inputPassword");

    private final By loginButton = By.id("btnLogin");


    public void enterEmail(String email){
        findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password){
        findElement(passwordField).sendKeys(password);
    }

    public void clickOnLogin(){
        findElement(loginButton).click();
    }
}
