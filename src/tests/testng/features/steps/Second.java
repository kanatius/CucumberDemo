package tests.testng.features.steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Second {

	
	@Given("Passo 1")
	public void step1() {
		System.out.println("Passo 1");
		Assert.assertTrue(true);
	}
	
	@When("Passo 2")
	public void step2() {
		System.out.println("Passo 1");
		Assert.assertTrue(true);
	}
	
	@And("Passo 3")
	public void step3() {
		System.out.println("Passo 1");
		Assert.assertTrue(true);
	}
	
	@Then("Passo 4")
	public void step4() {
		System.out.println("Passo 1");
		Assert.assertTrue(true);
	}

}
