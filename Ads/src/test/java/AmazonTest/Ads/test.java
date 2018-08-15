package AmazonTest.Ads;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);    
        String s=scan.nextLine();    
        int i=scan.nextInt();   
        float f=scan.nextFloat();   
        DecimalFormat d= new DecimalFormat("#.00");    
        System.out.println(s);    
        System.out.println(100%10);    
        System.out.println(d.format(f));

	}

}
