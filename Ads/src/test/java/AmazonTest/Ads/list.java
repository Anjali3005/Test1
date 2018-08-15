package AmazonTest.Ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {

	public static void main(String[] args) {
		String chromepath = "C:\\Users\\anjalraj\\eclipse-workspace\\Ads\\src\\test\\java\\AmazonTest\\Ads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		
		java.util.List<WebElement> l1 = (List<WebElement>) driver.findElement(By.xpath("//*[contains (@name ,'birthday_day')]"));
		for (int i = 0; i < args.length; i++) {
		String s=l1.get(i).getText();
		System.out.println(s);
		}
        
	}

}
