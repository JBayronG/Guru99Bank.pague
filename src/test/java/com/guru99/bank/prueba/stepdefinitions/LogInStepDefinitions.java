package com.guru99.bank.prueba.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.guru99.bank.pruebas.pages.HomeGuru99BankPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinitions {
	
	WebDriver john;
	HomeGuru99BankPOM  home;
	Hook hook= new Hook();
	
	@Given("que estoy en la pagina de GuruBank")
	public void queEstoyEnLaPaginaDeGuruBank() {
		hook.setUp();
		john=Hook.driver;
		home= new HomeGuru99BankPOM(john);
		john.get("http://demo.guru99.com/V4/index.php");
	 
	}

	@When("ingreso mi usuario y clave")
	public void ingresoMiUsuarioYClave(io.cucumber.datatable.DataTable dataTable) {
		List<String> listaDatos=dataTable.asList();
		home.escribirUsuario(listaDatos.get(0));
		home.escribirPassword(listaDatos.get(1));
		home.clickLogIn();
	
	}

	@Then("deberia ver el texto Welcome To Manager s Page of Guru99 Bank")
	public void deberiaVerElTextoWelcomeToManagerSPageOfGuru99Bank() {
	  home.validarMenagerId();
	  john.quit();
	}

}
