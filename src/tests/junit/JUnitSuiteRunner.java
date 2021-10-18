package tests.junit;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


//MAKE SURE THAT YOU ARE USING THE LIB org.testng.Assert, OHTERWISE ALL TESTS WILL PASS

@RunWith(Cucumber.class)
@CucumberOptions(
//		tags = "(@tag2 and (@pass or @fail)) or @LoginTest",
		dryRun=false,
		glue = {"tests.junit.features.steps"},
		features={"src\\tests\\junit\\features"},
		plugin={"html:src\\reports\\junitReports\\rep.html","junit:src\\reports\\junitReports\\rep1.xml","json:\\src\\reports\\junitReports\\rep2.json", "pretty", "summary"},
		monochrome=true
)
public class JUnitSuiteRunner {

}
