package tests.features.hooks;

import javax.swing.JOptionPane;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThirdHooks {
	
	@Before("@LoginTest") //para rodar em todos os testes é só tirar os parentesis
    public void beforeScenario(){
        JOptionPane.showInputDialog("Você está entrando no cenário teste de login");
    }	
	
	@After("@LoginTest") //para rodar em todos os testes é só tirar os parentesis
    public void afterScenario(){
		JOptionPane.showInputDialog("Você está saindo do cenário teste de login");
    }
	
}

 

