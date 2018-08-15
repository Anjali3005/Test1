package AmazonTest.Ads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class readfile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("‪C:\\Users\\anjalraj\\Documents\\fhj.txt");
		//java.io.FileReader fr=new java.io.FileReader(f);
		BufferedReader br=new BufferedReader(new java.io.FileReader("‪C:\\Users\\anjalraj\\Documents\\fhj.txt"));
		System.out.println(br.readLine());
		
		
		
		
	}

}
