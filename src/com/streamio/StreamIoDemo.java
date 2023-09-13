//Java Program to read file data using FileReader class
package com.streamio;
import java.io.*;
public class StreamIoDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("FWDemo.txt");
        int i=fr.read();
        
        while(i !=-1) {
        	System.out.print((char)i);
        	i=fr.read();//read next character and re-initialize i variable
        }
        fr.close();
	}

}
