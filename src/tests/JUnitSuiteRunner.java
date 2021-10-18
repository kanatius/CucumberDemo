package tests;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


//MAKE SURE THAT YOU ARE USING THE LIB org.testng.Assert, OHTERWISE ALL TESTS WILL PASS

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "(@tag2 and (@pass or @fail)) or @LoginTest",
		dryRun=false,
		glue = {"tests.features.steps"},
		features={"src\\tests\\features"},
		plugin={"html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json", "pretty", "summary"},
		monochrome=true
)
public class JUnitSuiteRunner {

}