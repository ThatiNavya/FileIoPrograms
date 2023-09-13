package com.streamio;

import java.io.*;

public class FileMerging {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		FileReader fr = new FileReader("file1.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader("file2.txt"));

		line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		pw.flush();

		br.close();
		pw.close();

		System.out.println("Merged file1.txt and file2.txt into file3.txt");
	}
}
