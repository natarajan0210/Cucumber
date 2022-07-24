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
public class BookHotelPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement txtBookingConfirm;
	
	@FindBy(xpath = "(//td[@class='login_title'])[2]")
	private WebElement txtBookingAHotel;
	
	@FindBy(id = "first_name_span")
	private WebElement txtErrorFirstname;
	
	@FindBy(id = "last_name_span")
	private WebElement txtErrorLastname;
	
	@FindBy(id = "address_span")
	private WebElement txtErrorAddress;
	
	@FindBy(id = "cc_num_span")
	private WebElement txtErrorCcNo;

	@FindBy(id = "cc_type_span")
	private WebElement txtErrorErrorCcType;
	
	@FindBy(id = "cc_expiry_span")
	private WebElement txtErrorExpiryDate;
	
	@FindBy(id = "cc_cvv_span")
	private WebElement txtErrorCvv;
	
	@FindBy(id = "first_name")
	private WebElement txtFirstname;
	
	@FindBy(id = "last_name")
	private WebElement txtLastname;

	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtCcnum;
	
	@FindBy(id = "cc_type")
	private WebElement txtCctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement txtExpmon;
	
	@FindBy(id = "cc_exp_year")
	private WebElement txtExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id = "book_now")
	private WebElement clkBooknoow;
	
	public WebElement getTxtBookingAHotel() {
		return txtBookingAHotel;
	}

	public WebElement getTxtBookingConfirm() {
		return txtBookingConfirm;
	}
	
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcnum() {
		return txtCcnum;
	}

	public WebElement getTxtCctype() {
		return txtCctype;
	}

	public WebElement getTxtExpmon() {
		return txtExpmon;
	}

	public WebElement getTxtExpYear() {
		return txtExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getClkBooknow() {
		return clkBooknoow;
	}
	
	public WebElement getTxtErrorFirstname() {
		return txtErrorFirstname;
	}

	public WebElement getTxtErrorLastname() {
		return txtErrorLastname;
	}

	public WebElement getTxtErrorAddress() {
		return txtErrorAddress;
	}

	public WebElement getTxtErrorCcNo() {
		return txtErrorCcNo;
	}

	public WebElement getTxtErrorCcType() {
		return txtErrorErrorCcType;
	}

	public WebElement getTxtErrorExpiryDate() {
		return txtErrorExpiryDate;
	}

	public WebElement getTxtErrorCvv() {
		return txtErrorCvv;
	}

	/**
	 * @Description
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param ccNum
	 * @param ccType
	 * @param expMon
	 * @param expYear
	 * @param cvv
	 */
	public void bookHotel(String firstname, String lastname, String address, String ccNum, String ccType, String expMon, String expYear, String cvv) {
		type(getTxtFirstname(), firstname);
		type(getTxtLastname(), lastname);
		type(getTxtAddress(), address);
		type(getTxtCcnum(), ccNum);
		type(getTxtCctype(), ccType);
		type(getTxtExpmon(), expMon);
		type(getTxtExpYear(), expYear);
		type(getTxtCvv(), cvv);
		click(getClkBooknow());
	}
	
	/**
	 * @Description
	 */
	public void bookHotel() {
		click(getClkBooknow());
	}
}
