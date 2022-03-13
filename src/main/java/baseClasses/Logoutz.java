package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logoutz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(uName));
		
		wait.until(ExpectedConditions.elementToBeClickable(uName));
		
		uName.sendKeys("Tester");
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
		
}
