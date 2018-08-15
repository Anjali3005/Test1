package AmazonTest.Ads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoList {

	public static void main(String[] args) {
		String chromepath = "C:\\Users\\anjalraj\\eclipse-workspace\\Ads\\src\\test\\java\\AmazonTest\\Ads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Select select = new Select(driver.findElement(By.id("day")));
		List<WebElement> elementcount = select.getOptions();
		int size = elementcount.size();
		System.out.println(size);
		for (int i = 0; i <size ; i++) {
			System.out.println(elementcount.get(i).getText());
			
		}

	}

}
