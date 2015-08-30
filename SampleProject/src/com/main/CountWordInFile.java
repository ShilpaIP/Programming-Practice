package com.main;

import java.io.*;

public class CountWordInFile {
	
	public static int countWords(String file) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String line = "";
		int count = 0;
	
		while((line=br.readLine()) != null){
			String[] splitstr = line.split(" ");
			for(String s : splitstr){
				count++;
			}			
		}
		br.close();
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String file = "SampleData.txt";
		int wordCount = 0;
		try {
			wordCount = countWords(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			System.out.println("Total count of words in " + file + " is: " + wordCount);
		}
	}

}
