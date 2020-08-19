package com.capkloss.cucumber.stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Background: Validate the browser");
    }
	
	@When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
		System.out.println("Background: Browser is triggered");
    }

	@Then("^Check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
        System.out.println("Background: Check if browser is displayed");
    }
	
	@Given("User is on NetNabking landing page")
	public void User_is_on_NetNabking_landing_page() throws Throwable {
		System.out.println("^User is on NetNabking landing page$");
	}
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Password not in table: " + strArg1 + " " + strArg2);
    }
	
	@Then("Home page is populated")
	public void home_page_is_populated() throws Throwable {
		System.out.println("^Home page is populated$");
	}
	
	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println("^Cards are displayed$ " + strArg1);
    }
	
	@When("User signs up with following details")
	public void user_signs_up_with_following_details(DataTable dataTable) {
		for (List<String> fields : dataTable.asLists()) {
		   	for (String item : fields) {
		   		System.out.println("ITEM " + item);
		   	}
		 }
	}
	
	@When("^User login in to application with username (.+) and password (.+)$")
    public void user_login_in_to_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username + " " + password);
    }	
	
}
