package com.app.step_definitions;

import com.app.pages.CRMDashboardPage;
import com.app.pages.SuiteCRMLoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DasboardActions {
	CRMDashboardPage dashboradPage = new CRMDashboardPage();
	
	@When("^I post \"([^\"]*)\"$")
	public void i_post(String note) {
	  dashboradPage.postNote(note);
	}

	@Then("^Post should be diplayed$")
	public void post_should_be_diplayed() {
	}

}
