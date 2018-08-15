package AmazonTest.Ads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
	@Test(dataProvider="passdata")
	public void LoginToOrangeHrm(String username, String password) throws InterruptedException {
		
		String chromepath = "C:\\Users\\anjalraj\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
}
	@DataProvider
	public Object[][] passdata() {
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin";
		
		data[1][0]="Admin";
		data[1][1]="Admin";
		
		
		
		return data;

	}
	

}