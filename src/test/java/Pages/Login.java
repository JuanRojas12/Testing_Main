package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Page_Base;

public class Login{

	public static WebDriver driver;
	
	public static final String Usuario = "opensourcecms" ;
	public static final String Contraseña = "opensourcecms";
	
	public void abrirChrome() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Juan Rojas/eclipse-workspace/Prueba_Testing/src/test/resources/Browser/chromedriver.exe");
		driver = new ChromeDriver();
	
	}

	public void abrirOpensourcecmsURL() throws InterruptedException {
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Thread.sleep(2000);
	}

	public void ingresarCredenciales() {
		driver.findElement(By.id("user_login")).sendKeys(Usuario);
		driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
		
	}
	
	public void precionarclic() {
		driver.findElement(By.id("wp-submit")).click();
		
	}

	public void validaDashboardDesplegado() {
		String finalLogin = driver.getCurrentUrl();
		Assert.assertEquals(finalLogin, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
		
	}

	public void terminado() {
		driver.quit();
		
	}

}
