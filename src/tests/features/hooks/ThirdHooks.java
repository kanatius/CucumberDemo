package tests.features.hooks;

import javax.swing.JOptionPane;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThirdHooks {
	
	@Before("@LoginTest") //para rodar em todos os testes � s� tirar os parentesis
    public void beforeScenario(){
        JOptionPane.showInputDialog("Voc� est� entrando no cen�rio teste de login");
    }	
	
	@After("@LoginTest") //para rodar em todos os testes � s� tirar os parentesis
    public void afterScenario(){
		JOptionPane.showInputDialog("Voc� est� saindo do cen�rio teste de login");
    }
	
}

 

