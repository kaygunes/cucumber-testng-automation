package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.app.pages.CRMDashboardPage;
import com.app.pages.SuiteCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UITestsStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	SuiteCRMLoginPage loginPage = new SuiteCRMLoginPage();
	CRMDashboardPage dashboard = new CRMDashboardPage();
	
	@Given("^I logged into suiteCRM$")
	public void i_logged_into_suiteCRM() {
	  driver.get(ConfigurationReader.getProperty("url"));
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().fullscreen();
	  loginPage.login(ConfigurationReader.getProperty("username"), 
			  ConfigurationReader.getProperty("password"));
	}

	@Then("^CRM name should be SuiteCRM$")
	public void crm_name_should_be_SuiteCRM() {
		assertTrue(driver.getTitle().endsWith("SuiteCRM"));
	}

	@Then("^Modules should be displayed$")
	public void modules_should_be_displayed() {
		assertTrue(dashboard.sales.isDisplayed());
		assertTrue(dashboard.marketing.isDisplayed());
		assertTrue(dashboard.support.isDisplayed());
		assertTrue(dashboard.activities.isDisplayed());
		assertTrue(dashboard.collaboration.isDisplayed());
		assertTrue(dashboard.all.isDisplayed());
	}

	
}