package cucumber.features.steps;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		features={"src\\cucumber\\features"},
		plugin = {"pretty", "summary"}
)
public class Runner {

}
