package com.streamio;

import java.io.*;

public class CommonFiles {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("def.txt"));
        String line;
        String s1="";
        String s2="";
        
        while((line=br1.readLine())!=null) {
        	s1=s1+line;
        }
        while((line=br2.readLine())!=null) {
        	s2=s2+line;
        }
        String[] words1 =s1.split("\\s+");
        String[] words2 =s2.split("\s+");
        System.out.println("common name in abc.txt file and def.txt file is");
		for(String word1:words1) {
			for(String word2:words2) {
				if(word1.trim().equalsIgnoreCase(word2.trim())) {
					System.out.println(word1.trim());
					break;
				}
			}
			
		}
		
	}

}
