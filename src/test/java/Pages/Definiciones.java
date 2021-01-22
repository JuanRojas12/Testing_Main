package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Definiciones {

	public void abrirBrowser() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Juan Rojas/eclipse-workspace/Prueba_Testing/src/test/resources/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
}
