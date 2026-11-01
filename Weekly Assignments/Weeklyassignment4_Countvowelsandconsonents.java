package weeklyassignments;

import java.util.Scanner;

public class Weeklyassignment4_Countvowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Q1. Count Vowels and Consonants
Write a Java program to count the total number of vowels and consonants in a given string.
Example:
Input:  Programming
Output:
Vowels: 3
Consonants: 8 */
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the data");
	   String str=  sc.next();
	   int vowels = 0;
	   int Consonants = 0;
	   for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);
	   
	   if(ch=='A'|| ch=='a'|| ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||ch=='O'|| ch=='o'||ch=='U'|| ch=='u')
		   
	   {
		  vowels++;
	   }
	   else
		   Consonants++;
	   }
	   System.out.println("Vowels:" +vowels);
	   System.out.println("Consonents" +Consonants );
	   	  		
	}

}
