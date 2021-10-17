package cucumber.features.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
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
		
		Boolean looged = username.equals("Natan") && password.equals("45678");
		
		Assert.assertTrue(looged);
	}
	
	@When("user enters the username and password credentials 2")
	public void enterLogInData2(DataTable data) {
			
		List<List<String>> row = data.asLists();
		String username = row.get(0).get(0);
		String password = row.get(0).get(1);
		
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
