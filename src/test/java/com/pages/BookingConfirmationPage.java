package com.pages;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class BookingConfirmationPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public String getOrderId() {
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	
	
}
