package com.winjigo.tests.createCourse;

import com.winjigo.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateCourseStepDefs extends BaseTest {

    @Given("login with valid email {string} and valid password {string}")
    public void loginWithValidEmailAndPassword(String email, String password) {
        browser.winjigo.login.enterEmail(email);
        browser.winjigo.login.enterPassword(password);
        browser.winjigo.login.clickOnLogin();
    }

    @When("click on course button in home page")
    public void clickOnCourseIcon(){
        browser.winjigo.home.clickOnCourse();
    }

    @When("click on add course button in course page")
    public void clickOnAddCourseButton(){
        browser.winjigo.course.clickOnAddCourse();
    }

    @When("enter course name {string} in course page")
    public void enterCourseNameButton(String courseName){
        browser.winjigo.course.enterCourseName(courseName);
    }

    @When("select course Grade in course page")
    public void selectCourseGrade(){
        browser.winjigo.course.selectCourseGrade();
    }

    @When("choose course teacher in course page")
    public void chooseCourseTeacher(){
        browser.winjigo.course.selectCourseTeacher();
    }

    @When("click on create button in course page")
    public void clickOnCreateButton(){
        browser.winjigo.course.clickOnCreate();
    }

    @Then("course title should be {string}")
    public void checkTheCourseTitle(String courseName){
        Assert.assertEquals(browser.winjigo.course.getCourseTitle(),courseName);
    }

}
