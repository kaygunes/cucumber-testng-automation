package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/com/app/feature/",
		glue="com/app/step_definitions"
		)
public class CukesRunner extends AbstractTestNGCucumberTests{

}
