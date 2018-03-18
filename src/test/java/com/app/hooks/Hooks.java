package com.app.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.app.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	WebDriver driver = Driver.getDriver();
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		Driver.closeDriver();
	}
}
