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
public class CancelBookingPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement clkBookItinerary;
	
	@FindBy(id = "order_id_text")
	private WebElement searchOrderId;
	
	@FindBy(id = "search_hotel_id")
	private WebElement clickGo;
		
	@FindBy(xpath = "//input[contains(@type, 'checkbox')]")
	private WebElement selectChecBox;
	
	@FindBy(xpath = "//input[contains(@id, 'btn_id_')]")
	private WebElement btnCancel;
	
	@FindBy(id = "search_result_error")
	private WebElement txtMessageAfterCancel;
	
	public WebElement getClkBookItinerary() {
		return clkBookItinerary;
	}
	
	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getSelectChecBox() {
		return selectChecBox;
	}
	
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public WebElement getTxtMessageAfterCancel() {
		return txtMessageAfterCancel;
	}
	
	/**
	 * @Description
	 * @param orderNo
	 * @throws InterruptedException
	 */
	public void cancelId(String orderNo) throws InterruptedException {	
		click(clkBookItinerary);
		type(getSearchOrderId(), orderNo);
		click(getClickGo());
		click(getSelectChecBox());
		click(getBtnCancel());
		acceptAlert();
	}
}
