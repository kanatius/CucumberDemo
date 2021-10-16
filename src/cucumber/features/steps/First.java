package cucumber.features.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {

	@Given("User navigates to the Home Page")
	public void navigatesToTheHomePage() {
		System.out.println("Navegando para a home page");
		
		Assert.assertTrue(true);
	}
	
	@When("User Enters the Signup Details")
	public void userEntersTheSignupDetails() {
		System.out.println("Inserindo os dados de Log in");
		Assert.assertTrue(true);
	}
	
	
	@Then("User Logged In to EDU")
	public void userLoggedInToEDU(){
		System.out.println("Usuário logado");
		Assert.assertTrue(true);
	}
	
}
