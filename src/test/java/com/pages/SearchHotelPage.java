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
public class SearchHotelPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username_show")
	private WebElement txtWelcomeMessage;
	
	@FindBy(id ="location_span")
	private WebElement txtErrorLocation;
	
	@FindBy(id = "checkin_span")
	private WebElement txtMessageCheckInDate;

	@FindBy(id = "checkout_span")
	private WebElement txtMessageChecOutDate;

	@FindBy(id = "location")
	private WebElement dDnLocation;
	
	@FindBy(id = "hotels")
	private WebElement dDnHotels;
	
	@FindBy(id = "room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement dDnRoomNo;
	
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	
	public WebElement getTxtWelcomeMessage() {
		return txtWelcomeMessage;
	}
	
	public WebElement getTxtErrorLocation() {
		return txtErrorLocation;
	}
	
	public WebElement getTxtMessageCheckInDate() {
		return txtMessageCheckInDate;
	}

	public WebElement getTxtMessageChecOutDate() {
		return txtMessageChecOutDate;
	}
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	/**
	 * @Description
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNo
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrensPerRoom
	 */
	public void searchHotels(String location, String hotels, String roomType, String roomNo, String checkInDate, String checkOutDate, String adultsPerRoom, String childrensPerRoom) {
		type(getdDnLocation(), location);
		type(getdDnHotels(), hotels);
		type(getdDnRoomType(), roomType);
		type(getdDnRoomNo(), roomNo);
		txtClear(txtCheckInDate);
		type(getTxtCheckInDate(), checkInDate);
		txtClear(txtCheckOutDate);
		type(getTxtCheckOutDate(), checkOutDate);
		type(getdDnAdultsPerRoom(), adultsPerRoom);
		type(getdDnChildrenPerRoom(), childrensPerRoom);
		click(getBtnSearch());	
	}
	
	/**
	 * @Description
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */
	public void searchHotels(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
		type(getdDnLocation(), location);
		type(getdDnRoomNo(), noOfRooms);
		txtClear(txtCheckInDate);
		type(getTxtCheckInDate(), checkInDate);
		txtClear(txtCheckOutDate);
		type(getTxtCheckOutDate(), checkOutDate);
		type(getdDnAdultsPerRoom(), adultsPerRoom);
		click(getBtnSearch());	
	}
	
	/**
	 * @Description
	 */
	public void searchHotels() {
		click(getBtnSearch());	
	}
	
	
	
}
