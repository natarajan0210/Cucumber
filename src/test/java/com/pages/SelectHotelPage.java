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
public class SelectHotelPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_span")
	private WebElement txtPlsSelectHotel;
	
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtSelectAHotel;

	@FindBy(id = "radiobutton_0")
	private WebElement selectHotel;

	@FindBy(id = "continue")
	private WebElement clkContinue;
	
	public WebElement getTxtPlsSelectHotel() {
		return txtPlsSelectHotel;
	}
	
	public WebElement getTxtSelectAHotel() {
		return txtSelectAHotel;
	}
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}

	/**
	 * @Description
	 */
	public void selectHotel() {
		click(getSelectHotel());
		click(getClkContinue());
	}
	
	/**
	 * @Description
	 */
	public void withoutSelectHotel() {	
		click(clkContinue);
	}
}
