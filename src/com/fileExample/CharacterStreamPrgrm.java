package com.fileExample;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamPrgrm {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("FWDemo.txt");
		fw.write("Hi,Good Morning");
		fw.write("\n");
		fw.write("How are you?");
		fw.flush();
		fw.close();

	}

}
