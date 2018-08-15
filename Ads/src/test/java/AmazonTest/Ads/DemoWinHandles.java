package AmazonTest.Ads;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoWinHandles {
	public static WebDriver driver;
	
	public void Windowhandle(int windowno) {
		int list=3;
		String parent = driver.getWindowHandle();
		//click
		Set < String > allwindows = driver.getWindowHandles();
		
		for (String string : allwindows) {
			if (!string.equals(parent)) {
				
				driver.switchTo().window(string);
			}
		}
		
		
		
		Iterator<String>it=allwindows.iterator();
		int i=1;
		while (it.hasNext() && i<5 ) {
			String Currentwindow = it.next().toString();
			driver.switchTo().window(Currentwindow);
	        String title= driver.getTitle();
	        //System.out.println("Window title is= "+ Mydriver.getTitle());
	        System.out.println("Window Title - " + title);
	        if (i == list) break;
	        i++;
	    }

		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		

	}


