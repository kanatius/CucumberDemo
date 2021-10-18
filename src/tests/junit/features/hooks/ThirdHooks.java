package tests.junit.features.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThirdHooks {
	
	@Before("@LoginTest") //para rodar em todos os testes � s� tirar os parentesis
    public void beforeScenario(){
        System.out.println("Voc� est� entrando no cen�rio teste de login");
    }	
	
	@After("@LoginTest") //para rodar em todos os testes � s� tirar os parentesis
    public void afterScenario(){
		 System.out.println("Voc� est� saindo do cen�rio teste de login");
    }
	
}

 

