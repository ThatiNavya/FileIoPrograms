//Java Program to read file data using BufferedReader
package com.streamio;
import java.io.*;
public class BufferedReaderDemo {
 public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("FWDemo.txt");
	BufferedReader br = new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
	
}
}
/*Assignment:
 *1. Write a java program to find how many characters,
 *how many words and how many lines available in the file  
 *2.Write a java program to read 2 files data and 
 *write 2 files content into 3rd file  
3.Write a java program to find which are available in 2 files*/