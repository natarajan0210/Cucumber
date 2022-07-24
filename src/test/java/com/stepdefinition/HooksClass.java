package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
public class HooksClass extends BaseClass {
	
	/**
	 * @Description
	 * @throws IOException
	 */
	@Before
	public void beforeScenario() throws IOException {
		getDriver("chrome");
		String value = getPropertyFileValue("url");
		maximize();
		loadUrl(value);
		implicitWait(50);
	}
	
	/**
	 * @Description
	 * @param ss
	 */
	@After
	private void afterScenario(Scenario ss) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		byte[] a = screenshot.getScreenshotAs(OutputType.BYTES);
		ss.embed(a, "Every Scenario");
		closeallWindows();
	}
	
	
	
	
}
