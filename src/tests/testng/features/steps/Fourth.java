package tests.testng.features.steps;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Fourth {


	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		Assert.assertTrue(true);
	}
	
	@When("I fill in {string} with:")
		public void i_fill_in_with(String Elementname, String MessageText) {
		    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Elementname.equals("search"));
		}


}
