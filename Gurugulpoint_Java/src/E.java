import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.smartvie.de/registrieren-oder-anmelden?returnurlget=%2ffavoriten");
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("document.getxpath('.//*[@id='LoginUserId']').setAttribute('value', 'new')");

	}

	}
