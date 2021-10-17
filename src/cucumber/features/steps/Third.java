package cucumber.features.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Third {

	@Given("^user is on PackAndGo login page$")
	public void goToPackAndGoLoginPage() {
		Assert.assertTrue(true);
	}

	@When("user enters the {string} and {string} credentials")
	public void enterLogInData(String username, String password) {
		Assert.assertTrue(username.equals("Natan") && password.equals("45678"));
	}
	
	@When("user enters the {string} and {string} credentials 2")
	public void enterLogInData2(String username, String password) {
		Assert.assertTrue(username.equals("Natan") && password.equals("45678"));
	}

	@Then("^user logged in and checks for Edit Profile$")
	public void goToEditProfilePage() {
		Assert.assertTrue(true);
	}

	@And("^user logout from application$")
	public void logOut() {
		Assert.assertTrue(true);
	}

}
