package com.stepdefinition;

import java.awt.AWTException;   
import java.io.IOException;

import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class LoginPageStep extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Description 
	 * @throws IOException
	 */
	@Given("User is on the Adactinhotel page")
	public void userIsOnTheAdactinhotelPage() throws IOException {
		
	}
	
	/**
	 * @Description
	 * @param userName
	 * @param password
	 */
	@When("User should perform login {string}, {string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginPage().login(userName, password);
	}
	
	/**
	 * @Description
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */
	@When("User should perform login with Enter Key {string}, {string}")
	public void userShouldPerformLoginWithEnterKey(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);
	}
	
	/**
	 * @Description				
	 * @param expectedErrorMessage
	 */
	@Then("User should verify after login get error message {string}")
	public void userShouldVerifyAfterLoginGetErrorMessage(String expectedErrorMessage) {
		String text = getText(pom.getLoginPage().getTxtErrorMessage());
		Assert.assertTrue(text.contains(expectedErrorMessage), "verified");
	}
	

}
