package com.stepdefinition;

import java.util.List; 
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class BookHotelStep extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 */
	@Then("User should book the hotel after successfully select hotel using {string}, {string} and {string}")
	public void userShouldBookTheHotelAfterSuccessfullySelectHotelUsingAnd(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		String ccType = map.get("creditCardType");
		String ccNumber = map.get("creditCardNumber");
		String expMon = map.get("expiryMonth");
		String expYear = map.get("expiryYear");
		String cvv = map.get("cvv");
		pom.getBookHotelPage().bookHotel(firstName, lastName, address, ccNumber, ccType, expMon, expYear, cvv);
	}

	/**
	 * @Description
	 * @param expectedMessage
	 */
	@Then("User should verify after successfully book hotel get message {string}")
	public void userShouldVerifyAfterSuccessfullyBookHotelGetMessage(String expectedMessage) {
		Assert.assertEquals("verify", expectedMessage, getText(pom.getBookHotelPage().getTxtBookingConfirm()));
	}

	/**
	 * @Description
	 */
	@Then("User should book the hotel after successfully without filling details")
	public void userShouldBookTheHotelAfterSuccessfullyWithoutFillingDetails() {
		pom.getBookHotelPage().bookHotel();
		
	}

	/**
	 * @Description
	 * @param txtErrorFirstname
	 * @param txtErrorLastname
	 * @param txtErrorAddress
	 * @param txtErrorCcNo
	 * @param txtErrorCctype
	 * @param txtErrorExpiry
	 * @param txtErrorCvvNo
	 */
	@Then("User should after verify book hotel get error message {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldAfterVerifyBookHotelGetErrorMessageAnd(String txtErrorFirstname, String txtErrorLastname, String txtErrorAddress, String txtErrorCcNo, String txtErrorCctype, String txtErrorExpiry, String txtErrorCvvNo) {
		
		Assert.assertEquals("verified", txtErrorFirstname, getText(pom.getBookHotelPage().getTxtErrorFirstname()));
		Assert.assertEquals("verify", txtErrorLastname, getText(pom.getBookHotelPage().getTxtErrorLastname()));
		Assert.assertEquals("verify", txtErrorAddress,  getText(pom.getBookHotelPage().getTxtErrorAddress()));
		Assert.assertEquals("verify", txtErrorCcNo, getText(pom.getBookHotelPage().getTxtErrorCcNo()));
		Assert.assertEquals("verify", txtErrorCctype, getText(pom.getBookHotelPage().getTxtErrorCcType()));
		Assert.assertEquals("verify", txtErrorExpiry, getText(pom.getBookHotelPage().getTxtErrorExpiryDate()));
		Assert.assertEquals("verify", txtErrorCvvNo, getText(pom.getBookHotelPage().getTxtErrorCvv()));
				
	}
}
