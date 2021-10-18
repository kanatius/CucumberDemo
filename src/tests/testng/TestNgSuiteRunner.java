package tests.testng;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
//		tags = "(@tag2 and (@pass or @fail)) or @LoginTest",
		tags = "@LoginTest",
		monochrome=true
)
public class TestNgSuiteRunner extends AbstractTestNGCucumberTests{

}
