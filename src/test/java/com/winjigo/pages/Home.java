package com.winjigo.pages;

import org.openqa.selenium.By;

public class Home extends BasePage{

    private final By courseButton = By.id("btnMyCoursesList");

    public void clickOnCourse(){
        findElement(courseButton).click();
    }

}
