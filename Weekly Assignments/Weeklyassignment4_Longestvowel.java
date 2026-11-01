package weeklyassignments;
/* Q2. Find the Longest Word
Write a Java program to find the longest word in a given sentence.
Example:
Input: Java programming is interesting
Output: programming */

public class Weeklyassignment4_Longestvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java programming is interesting";
		String[]words=str.split(" ");
		String longestword=" ";
		for(int i=0;i<words.length;i++)
		{
			
			if(words[i].length()>longestword.length())
			longestword=words[i];
		}
		System.out.println("Longestword: "+longestword);
	}
	}


