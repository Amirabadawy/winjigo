package com.winjigo.tests.createCourse;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/winjigo/tests/createCourse/CreateCourse.feature",
        glue = {"com.winjigo.tests"},
        plugin = {"pretty","html:reports/winjigo-Report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)

public class CreateCourseTestRunner extends AbstractTestNGCucumberTests {
}
