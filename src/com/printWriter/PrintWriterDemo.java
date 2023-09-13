//Writing data to console using PrintWriter object
package com.printWriter;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
        pw.print("hi");
        pw.println("Hello");
        pw.flush();
        pw.close();
	}

}
