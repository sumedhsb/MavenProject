package baseClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Configurations;

public class Screenshot22 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get(Configurations.appurl);
		driver.manage().window().maximize();
		//source file
		File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//destination file
		File f=new File("C:\\automation\\screenshot\\image2.jpg");
		
		FileHandler.copy(source, f);
		
		
		
		
		
		
	}


}
