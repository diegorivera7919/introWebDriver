package homeworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgregarCancion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://songs-by-sinatra.herokuapp.com/");
		//WebElement pageTitle = driver.findElement(By.linkText("Songs By Sinatra"));
		//busco el elemento cuyo xpath es: //h1[contains(text(),'Songs By Sinatra')]
		WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'Songs By Sinatra')]"));
		String txtTitulo = pageTitle.getText();
		if (txtTitulo.contains("Sinatra")){
			System.out.println("El título de la pagina es correcto");
		}else {
			System.out.println("El título de la pagina NO es correcto");
		}
		
		//busco el elemento cuyo xpath es://a[contains(text(),'Songs')]
		WebElement textoCinta = driver.findElement(By.xpath("//a[contains(text(),'Songs')]"));
		String txtCinta = textoCinta.getText();
		if (txtCinta.contains("Songs")){
			System.out.println("El texto de la cinta de navegación es correcto");
		}else {
			System.out.println("El texto de la cinta de navegación NO es correcto");
		}
		
		//busco el elemento cuyo xpath es://p[contains(text(),'Welcome')]
		WebElement msgBienvenida = driver.findElement(By.xpath("//p[contains(text(),'Welcome')]"));
		String txtMsgBienve = msgBienvenida.getText();
		if (txtMsgBienve.contains("Welcome")){
			System.out.println("El texto de Bienvenida es correcto");
		}else {
			System.out.println("El texto de Bienvenida NO es correcto");
		}
		
		//Verificar se encuentre link de Log in
		WebElement linkLogin = driver.findElement(By.partialLinkText("log in"));
		if (linkLogin != null && linkLogin.isDisplayed()){
			System.out.println("El link de log in se muestra correctamente");
		}else {
			System.out.println("El link de log in NO se muestra correctamente");
			driver.quit();
			System.exit(-1);
		}
		
		//Damos clic en link log in
		linkLogin.click();
		
		
		
		//driver.quit();

	}

}
