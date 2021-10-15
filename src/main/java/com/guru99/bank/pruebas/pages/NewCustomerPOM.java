package com.guru99.bank.pruebas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPOM {
	WebDriver john2;
	By linkNew=By.xpath("//a[contains(text(),'New Customer')]");
	By txtCustomer=By.name("name");
	By btnMale=By.xpath("//input[@value='m']");
	By txtDate=By.id("dob");
	By txtAddress=By.name("addr");
	By txtCity=By.name("city");
	By txtState=By.name("state");
	By txtPin=By.name("pinno");
	By txtMobile=By.name("telephoneno");
	By txtEmail=By.name("emailid");
	By txtPassword=By.name("password");
	By btnSubmit=By.name("sub");

	
	public  NewCustomerPOM(WebDriver john){
		john2= john;
		
	}
	
	public void clickNew() {
		john2.findElement(linkNew).click();
	}
	
	public void escribirCliente(String cliente) {
		john2.findElement(txtCustomer).sendKeys(cliente);
	}
	
	public void clicSobreTipoDeGenero(String tipoGenero) {
		if(tipoGenero.equals("Male")) {
			john2.findElement(btnMale).click();
		}

	}
	
	public void escribirLaFecha(String date) {
		john2.findElement(txtDate).sendKeys(date);
	}
	
	
	public void escribirDireccion(String direccion) {
		john2.findElement(txtAddress).sendKeys(direccion);
	}
	
	
	public void escribirCiudad(String ciudad) {
		john2.findElement(txtCity).sendKeys(ciudad);
	}
	
	public void escribirEstado(String estado) {
		john2.findElement(txtState).sendKeys(estado);
	}
	
	public void escribirPin(String pin) {
		john2.findElement(txtPin).sendKeys(pin);
	}
	
	public void escribirTelefono(String telefono) {
		john2.findElement(txtMobile).sendKeys(telefono);
	}
	
	public void escribirEmail(String email) {
		john2.findElement(txtEmail).sendKeys(email);
	}
	
	public void escribirClave(String clave) {
		john2.findElement(txtPassword).sendKeys(clave);
	}
	
	public void clickSubmit() {
		john2.findElement(btnSubmit).click();
	}

}
