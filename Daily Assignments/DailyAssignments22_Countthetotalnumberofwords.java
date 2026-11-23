package dailyassignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/*Count Words in a File
Create a file named paragraph.txt containing the following text:
Java is a programming language.
Java supports object oriented programming.
File handling is an important concept in Java.


Write a program to:
- Read the complete file.
- Count the total number of words.
- Display the word count. */ 


public class DailyAssignments22_Countthetotalnumberofwords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\good\\Desktop\\paragraph.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
	    int wordcount =0;
		  while((str=br.readLine())!=null)
		  {
		    System.out.println(str);
		  
		  
		  //Count the words
		  int words = str.split(" ").length;
		  System.out.println(words);
		 wordcount = wordcount+words;
		  }
		System.out.println("\n Total Word count: " + wordcount);
		br.close(); 
    
	}

}
