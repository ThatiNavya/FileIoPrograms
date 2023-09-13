/*Assignment : Write a java program to display content of given directory.
For filename it should display prefix as File : 
For directory name it should display prefix as Directory :*/
package com.fileExample;

import java.io.File;
import java.io.IOException;

public class DisplayContent {

	public static void main(String... args) throws IOException {

		File f = new File("C:\\Users\\navya");

		String[] arr = f.list();

		for (String name : arr) {

			File f1 = new File(f, name);

			if (f1.isFile()) {
				System.out.println("File :: " + name);
			}

			if (f1.isDirectory()) {
				System.out.println("Directory  :: " + name);
			}
	}

}
}
