package tests;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		tags = "@LoginTest",
		glue = {"cucumber.features.steps"},
		features={"src\\cucumber\\features"}
)
public class TestNgSuiteRunner extends AbstractTestNGCucumberTests{

}
