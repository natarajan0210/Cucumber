package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class SelectHotelStep extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Description
	 */
	@Then("User should select the hotel and continue after successfully search")
	public void userShouldSelectTheHotelAndContinueAfterSuccessfullySearch() {
		pom.getSelectHotelPage().selectHotel();
	}

	/**
	 * @Description
	 * @param expectedMessage
	 */
	@Then("User should verify successfully select hotel get message {string}")
	public void userShouldVerifySuccessfullySelectHotelGetMessage(String expectedMessage) {
		Assert.assertEquals("Verify", expectedMessage, getText(pom.getBookHotelPage().getTxtBookingAHotel()));
	}

	/**
	 * @Description
	 */
	@Then("User should without select the hotel and continue after successfully search")
	public void userShouldWithoutSelectTheHotelAndContinueAfterSuccessfullySearch() {
		pom.getSelectHotelPage().withoutSelectHotel();
	}

	/**
	 * @Description
	 * @param expectedErrorMessage
	 */
	@Then("User should verify after continue get error message {string}")
	public void userShouldVerifyAfterContinueGetErrorMessage(String expectedErrorMessage) {
		Assert.assertEquals("verify", expectedErrorMessage, getText(pom.getSelectHotelPage().getTxtPlsSelectHotel()));
	}
}
