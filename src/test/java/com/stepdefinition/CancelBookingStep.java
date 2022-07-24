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
public class CancelBookingStep extends BaseClass {
	
	/**
	 * @Description
	 */
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Description
	 * @throws InterruptedException
	 */
	@Then("User should cancel generated order id after booking confirmation")
	public void userShouldCancelGeneratedOrderIdAfterBookingConfirmation() throws InterruptedException {
		String orderId = pom.getBookingConfirmationPage().getOrderId();
		pom.getCancelBookingPage().cancelId(orderId);
	}

	/**
	 * @Description
	 * @param expectedCancelMessage
	 */
	@Then("User should verify cancel message after cancelling {string}")
	public void userShouldVerifyCancelMessageAfterCancelling(String expectedCancelMessage) {
		Assert.assertEquals("Verify", expectedCancelMessage, getText(pom.getCancelBookingPage().getTxtMessageAfterCancel()));
	}

	/**
	 * @Description
	 * @param orderNo
	 * @throws InterruptedException
	 */
	@Then("User should cancel existing order id after successfully login {string}")
	public void userShouldCancelExistingOrderIdAfterSuccessfullyLogin(String orderNo) throws InterruptedException {
		pom.getCancelBookingPage().cancelId(orderNo);	
	}
}
