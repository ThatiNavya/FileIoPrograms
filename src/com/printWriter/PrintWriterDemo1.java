//Writing data to file using PrintWriter objects
package com.printWriter;
import java.io.*;
public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("test.txt");
		pw.write("This is my test file");
		pw.flush();
		pw.close();
	}

}
