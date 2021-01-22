package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingMain {

	public static final String Usuario = "opensourcecms" ;
	public static final String Contraseña = "opensourcecms";
	
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Juan Rojas/eclipse-workspace/Prueba_Testing/src/test/resources/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys(Usuario);
		driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
		driver.findElement(By.id("wp-submit")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
		driver.quit();
	}
	
	
	public void crearUsuario() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Juan Rojas/eclipse-workspace/Prueba_Testing/src/test/resources/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys(Usuario);
		driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
		driver.findElement(By.id("wp-submit")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
		Actions acciones = new Actions(driver);
		Thread.sleep(2000);
		acciones.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-users\"]/a/div[3]"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-users\"]/ul/li[3]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("Juan.Rojas");
		driver.findElement(By.id("email")).sendKeys("Juancho._12@hotmail.com");
		driver.findElement(By.id("first_name")).sendKeys("Juan David");
		driver.findElement(By.id("last_name")).sendKeys("Rojas Villarraga");
		driver.findElement(By.xpath("//*[@id=\"createuser\"]/table/tbody/tr[6]/td/button")).click();
		driver.findElement(By.id("createusersub")).click();
		String URLM = driver.getCurrentUrl();
		Assert.assertEquals(URLM, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/users.php?id=9" );
		driver.quit();
	}
	
	


	public void EliminarUsuario() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Juan Rojas/eclipse-workspace/Prueba_Testing/src/test/resources/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys(Usuario);
		driver.findElement(By.id("user_pass")).sendKeys(Contraseña);
		driver.findElement(By.id("wp-submit")).click();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://s1.demo.opensourcecms.com/wordpress/wp-admin/" );
		Actions acciones = new Actions(driver);
		Thread.sleep(2000);
		acciones.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-users\"]/a/div[3]"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-users\"]/ul/li[2]/a")).click();
		acciones.moveToElement(driver.findElement(By.xpath("//*[@id=\"user-8\"]/td[1]"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user-8\"]/td[1]/div/span[2]/a")).click();
		driver.findElement(By.id("submit")).click();
		
		driver.quit();
	}
	
	
    public static void main(String[] args) throws InterruptedException {
	    TestingMain t1 = new TestingMain();
	    
	    t1.login();
	    t1.crearUsuario();
	    t1.EliminarUsuario();

    }
}
