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
public class CommonSteps extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Description
	 * @param expectedLoginMessage
	 */
	@Then("User should verify successfully login message {string}")
	public void userShouldVerifySuccessfullyLoginMessage(String expectedLoginMessage) {

//		WebElement element = pom.getSearchHotelPage().getTxtWelcomeMessage();
//		String attribute = element.getAttribute("value");
//		System.out.println(attribute);
//		Assert.assertEquals("verify after login message", expectedLoginMessage, attribute);
		
		Assert.assertEquals("verified", expectedLoginMessage,getAttributeValue(pom.getSearchHotelPage().getTxtWelcomeMessage()));
	}
}
