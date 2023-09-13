// Java program to display all the files and directories in given path
package com.fileExample;

import java.io.File;
import java.io.IOException;

public class Display_File_Dir {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\navya\\Documents\\workspace-spring-tool-suite-4-4.18.1.RELEASE");
		String[] arr = f.list();

		for (String name : arr) {
			System.out.println(name);
		}
	}

}
