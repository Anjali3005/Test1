package AmazonTest.Ads;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alexa {
	@Test
	public void testAlexa() throws InterruptedException {
		// String chromepath = "src\\test\\java\\AmazonTest\\Ads\\chromedriver.exe";
		String chromepath = "C:\\Users\\anjalraj\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//This snippet is for scrolling down window 
		//js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click()", driver.findElement(By.id("nav-your-amazon")));
		js.executeScript("arguments[1].value=arguments[0]", "Anjali",driver.findElement(By.id("ap_email")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}