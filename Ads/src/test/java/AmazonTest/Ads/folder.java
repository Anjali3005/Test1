package AmazonTest.Ads;

import java.io.File;

public class folder {

	public static void main(String[] args) {
		
		String folder="C://anjali";
		File f=new File(folder);
		f.mkdirs();
		System.out.println("file is created");
		f.delete();
		System.out.println("file is deleted");
	}

}
