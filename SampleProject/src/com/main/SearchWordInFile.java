package com.main;

import java.io.*;

public class SearchWordInFile {
	
	public static int searchWord(String file, String searchKey) throws FileNotFoundException, IOException  {
		
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String line = "";
		int count = 0;
		
		while((line=br.readLine()) != null){
			String[] splitstr = line.split(" ");
			for(String s : splitstr){
				if(s.equals(searchKey))
					count++;
			}
		}
		br.close();
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String file = "SampleData.txt";
		String wordToBeSearched = "Java";
	
		int searchWrdCount = 0;
		try {
			searchWrdCount = searchWord(file, wordToBeSearched);
		} catch(FileNotFoundException e){
			System.out.println("File Not Found");
		} catch (IOException e) {		
			e.printStackTrace();
		}
		finally{
			System.out.println("Count of word" + " '"+ wordToBeSearched + "'" + " is: " + searchWrdCount);
		}
	}
	
}
