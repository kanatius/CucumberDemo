package tests.testng;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		tags = "(@tag2 and (@pass or @fail)) or @LoginTest",
//		tags = "@LoginTest",
		monochrome=true,
		plugin={"html:src\\reports\\testNGReports\\rep.html","junit:src\\reports\\testNGReports\\rep1.xml","json:\\src\\reports\\testNGReports\\rep2.json", "pretty", "summary"}
)
public class TestNgSuiteRunner extends AbstractTestNGCucumberTests{
}
