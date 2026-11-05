package weeklyassignments;

import java.util.Scanner;

/* Q3) Replace a Character in a String
Write a Java program to replace all occurrences of a particular character with another character without using the replace() method.
Example:
Input:
String: banana
Old Character: a
New Character: o

Output: bonono */

public class Weeklyassignment4_replacecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = "";
	    char oldchar = ' ';
	    char newchar = ' ';
	    String result = "";
	    
	    System.out.println("Enter the String:");
	    str=sc.nextLine();
	    
	    System.out.println("Enter Old Character:");
        oldchar = sc.next().charAt(0);

   
        System.out.println("Enter New Character:");
        newchar = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++)	
        {
            if (str.charAt(i) == oldchar) {
                result = result + newchar;
            } 
            else 
            {
                result = result + str.charAt(i);
            }
        }

        System.out.println("Result: " + result);
        	
		
		
	}

}
