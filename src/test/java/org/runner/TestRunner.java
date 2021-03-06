package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login.features"},glue="org.stepdef",monochrome=true,
plugin= {"pretty","html:C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Cucumber\\target","json:C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Cucumber\\target\\fb.json"})

public class TestRunner {
	
	
	@AfterClass
	public static void generateReportss() {
		
		Reporting.generateJVMReport("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Cucumber\\target\\fb.json");
		
	}

}
