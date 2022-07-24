package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Description  
 * @author Naveen
 *
 */
public class LoginPage extends BaseClass {
	
	/**
	 * @Description
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class, 'auth_error')]")
	private WebElement txtErrorMessage;

	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getTxtErrorMessage() {
		return txtErrorMessage;
	}
	
	/**
	 * @Description
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		type(getTxtUserName(), userName);
		type(getTxtPassword(), password);
		click(btnLogin);
	}
	
	/**
	 * @Description
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnter(String userName, String password) throws AWTException {
		type(getTxtUserName(), userName);
		type(getTxtPassword(), password);
		
		Robot robot = new Robot();	
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
