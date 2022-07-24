package com.runner;

import org.junit.AfterClass;    
import org.junit.runner.RunWith;

import com.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * @Description 
 * @Created By 09/07/2021 
 * @author Naveen
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@Login or @Search or @Select or @Book or @Cancel"}, snippets= SnippetType.CAMELCASE, plugin= {"pretty", "json:target/cucumber.json"}, dryRun= false, features= {"src\\test\\resources"}, glue= {"com.stepdefinition"})
public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
	
		Reporting.generatesJVMReport("C:\\Users\\Naveen\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\cucumber.json");
	
	
	}
	
}
