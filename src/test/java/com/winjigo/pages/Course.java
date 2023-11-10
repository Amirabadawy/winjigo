package com.winjigo.pages;

import com.winjigo.driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Course extends BasePage{

    private final By addCourseButton = By.id("btnListAddCourse");
    private final By courseNameField = By.id("txtCourseName");
    private final By courseGradeField = By.id("courseGrade");
    private final By courseTeacherField = By.id("teacherOnBehalf");
    private final By courseTeacher = By.id("lnkteacherFullName");
    private final By createButton = By.id("btnSaveAsDraftCourse");
    private final By courseTitle = By.id("courseNameView");


    //courseNameView

    public void clickOnAddCourse(){
        findElement(addCourseButton).click();
    }
    public void enterCourseName(String name){
        findElement(courseNameField).sendKeys(name);
    }

    public void selectCourseGrade(){
        Select drop = new Select(findElement(courseGradeField));
       drop.selectByVisibleText("7");
    }

        public void selectCourseTeacher(){
        scrollDown(WebDriverHandler.getWebDriver());
        findElement(courseTeacherField).click();
        findElement(courseTeacher).click();
        }


    public void clickOnCreate(){
        scrollDownToElement(WebDriverHandler.getWebDriver(), createButton);
        findElement(createButton).click();
    }

    public String getCourseTitle() {
       return findElement(courseTitle).getText();
    }
}
