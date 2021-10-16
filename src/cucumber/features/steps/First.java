package cucumber.features.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(publish = false)
public class First {

	@Given("^User navigates to the Home Page$")
	public void navigatesToTheHomePage() {
		System.out.println("Navegando para a home page");
	}
	
	@When("^User Enters the Signup Details$")
	public void userEntersTheSignupDetails() {
		System.out.println("Inserindo os dados de Log in");
	}
	
	
	@Then("^User Logged In to EDU$")
	public void userLoggedInToEDU(){
		System.out.println("Usuário logado");
	}
	
}
