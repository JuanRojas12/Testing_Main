package Definition_Test;

import Pages.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition_Test_Google {
	
	Login page_google = new Login();
	
	
	@Given("^: El usuario abre google Chrome$")
	public void el_usuario_abre_google_chrome() {
		page_google.abrirChrome();
	
	}

	@When("^: Abre la pagina web opensourcecms$")
	public void abre_la_pagina_web_opensourcecms() throws InterruptedException {
		page_google.abrirOpensourcecmsURL();
	
	}

	@Then("^: El usuario ingresa las credenciales y presiona el boton de iniciar sesion$")
	public void el_usuario_ingresa_las_credenciales_y_presiona_el_boton_de_iniciar_sesion() {
		page_google.ingresarCredenciales();
	
	}
	
	@Then("^: El usuario da clic$")
	public void el_usuario_clic() {
		page_google.precionarclic();
	
	}

	@And("^: El usuario se logea correctamente$")
	public void el_usuario_se_logea_correctamente() {
		page_google.validaDashboardDesplegado();		
	
	}
	
	@And("^: cerrar Login$")
	public void cerrar_login() {
		page_google.terminado();		
	
	}

}
