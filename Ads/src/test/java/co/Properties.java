package co;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class Properties {
	@Test
	public void readfile() throws IOException {
	readproperties();
	}

	public static void readproperties() throws IOException {
		java.util.Properties pro=new java.util.Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\anjalraj\\eclipse-workspace\\Ads\\src\\test\\java\\co\\config.properties");
		pro.load(fi);
		System.out.println(pro.getProperty("browser"));;
	} 	
}
