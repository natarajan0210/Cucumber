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
public class SearchHotelStep extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Description
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrensPerRoom
	 */
	@Then("User should search the hotel after successfully Login {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchTheHotelAfterSuccessfullyLoginAnd(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrensPerRoom) {
		pom.getSearchHotelPage().searchHotels(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrensPerRoom);
	}

	/**
	 * @Description
	 * @param expectedMessage
	 */
	@Then("User should after verify successfully search message {string}")
	public void userShouldAfterVerifySuccessfullySearchMessage(String expectedMessage) {
		Assert.assertEquals("verify", expectedMessage, getText(pom.getSelectHotelPage().getTxtSelectAHotel()));
	}

	/**
	 * @Description
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */
	@Then("User should search the hotel after successfully login with  mandatory fields {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchTheHotelAfterSuccessfullyLoginWithMandatoryFieldsAnd(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
		pom.getSearchHotelPage().searchHotels(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	}

	/**
	 * @Description
	 * @param expectedCheckInError
	 * @param expectedCheckOutError
	 */
	@Then("User should after verify search get error message {string} and {string}")
	public void userShouldAfterVerifySearchGetErrorMessageAnd(String expectedCheckInError, String expectedCheckOutError) {
		pom.getSearchHotelPage().searchHotels();
		Assert.assertEquals("verify", expectedCheckInError, getText(pom.getSearchHotelPage().getTxtMessageCheckInDate()));
		Assert.assertEquals("verify", expectedCheckOutError, getText(pom.getSearchHotelPage().getTxtMessageChecOutDate()));
	}

	/**
	 * @Description
	 */
	@Then("User should search the hotel without select details after successfully login")
	public void userShouldSearchTheHotelWithoutSelectDetailsAfterSuccessfullyLogin() {
		pom.getSearchHotelPage().searchHotels();
	}

	/**
	 * @Description
	 * @param expectedErrorMessage
	 */
	@Then("User should verify after search get error message {string}")
	public void userShouldVerifyAfterSearchGetErrorMessage(String expectedErrorMessage) {	
		Assert.assertEquals("verify", expectedErrorMessage, getText(pom.getSearchHotelPage().getTxtErrorLocation()));
	}

}
