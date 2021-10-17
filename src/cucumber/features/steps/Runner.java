package cucumber.features.steps;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		features={"src\\cucumber\\features"},
		plugin={"html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json", "pretty", "summary"}
)
public class Runner {

}
