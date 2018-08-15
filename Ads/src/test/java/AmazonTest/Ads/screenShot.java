package AmazonTest.Ads;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {
	

	public static void main(String[] args) {
		String chromepath = "C:\\Users\\anjalraj\\eclipse-workspace\\Ads\\src\\test\\java\\AmazonTest\\Ads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Assign Leave")).click();
		
		
		}
	public void getscreenshot() throws IOException {
	
	WebDriver driver = null;
	File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destinationfile=new File("C:\\Screenshot.png");
	FileUtils.copyFile(sourcefile, destinationfile);
	

	}

	}


