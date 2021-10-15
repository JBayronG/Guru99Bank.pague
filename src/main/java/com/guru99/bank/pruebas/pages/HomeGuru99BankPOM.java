package com.guru99.bank.pruebas.pages;

public class HomeGuru99BankPOM {
	WebDriver john;
	By txtUser=By.name("uid");
	By txtPass=By.name("password");
	By btnLogin=By.name("btnLogin");
	By linkManager=By.xpath("//td[text()='Manger Id : mngr320459']");
	By paginaNew=By.xpath("//a[contains(text(),'New Customer')]");

	public HomeGuru99BankPOM(WebDriver john2) {
		john= john2;
	}
	
	public void escribirUsuario(String usuario) {
		john.findElement(txtUser).sendKeys(usuario);
	}
	
	public void escribirPassword(String pass) {
		john.findElement(txtPass).sendKeys(pass);
	}
	
	public void clickLogIn() {
		john.findElement(btnLogin).click();
	}
	
	public void validarMenagerId() {
		assertThat(john.findElement(linkManager).isDisplayed(), Matchers.is(true));
	}
	
	public void clickPaginaNew() {
		john.findElement(paginaNew).click();
	}
}
