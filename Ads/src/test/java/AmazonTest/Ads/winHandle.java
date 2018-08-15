package AmazonTest.Ads;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class winHandle {

	public static void main(String[] args) {
		String chromepath = "C:\\Users\\anjalraj\\eclipse-workspace\\Ads\\src\\test\\java\\AmazonTest\\Ads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Gmail")));
		act.contextClick().sendKeys(Keys.ARROW_DOWN).contextClick();
		//act.contextClick().keyDown(Keys.DOWN).click();
		 act.build().perform();

	}

}

