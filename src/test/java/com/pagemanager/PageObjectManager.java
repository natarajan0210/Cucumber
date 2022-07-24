package com.pagemanager;

import com.pages.BookHotelPage; 
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class PageObjectManager {
	
	/**
	 * @Description
	 */
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;
	
	/**
	 * @Description
	 * @return
	 */
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage = new LoginPage(): loginPage;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage = new SearchHotelPage(): searchHotelPage;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage = new SelectHotelPage(): selectHotelPage;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage = new BookHotelPage(): bookHotelPage;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)? bookingConfirmationPage = new BookingConfirmationPage(): bookingConfirmationPage;
	}
	
	/**
	 * @Description
	 * @return
	 */
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)? cancelBookingPage = new CancelBookingPage(): cancelBookingPage;
	}
	
}
