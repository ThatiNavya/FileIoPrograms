package com.fileExample;
import java.io.File;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		 File f1 = new File("navya_file.txt");
		 boolean fstatus =f1.createNewFile();
		 System.out.println(fstatus);
		 
		File f2 = new File("java_file.txt");
		boolean f2status =f2.createNewFile();
		System.out.println(f2status);
		
		File f3=new File("javafile");
		boolean f3status=f3.mkdir();
		System.out.println(f3status);
		 
		boolean f3status1=f3.createNewFile();
		System.out.println(f3status1);//false
		
		File f5 = new File(f3, "textfile.txt");
		boolean f5status=f5.createNewFile();
		System.out.println(f5status);
		 
	}
 
}
