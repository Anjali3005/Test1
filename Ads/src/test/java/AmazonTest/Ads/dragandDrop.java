package AmazonTest.Ads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) {
		String chromepath = "C:\\Users\\anjalraj\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("");
		WebElement source =driver.findElement(By.id(""));
		WebElement target =driver.findElement(By.id(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target);
		act.build().perform();
		
	
		

	}

}
