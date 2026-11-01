package weeklyassignments;

/*  Find All Substrings of a String
Write a Java program to print all possible non-empty substrings of a given string.
Example:
Input: ABC

Output:
A
AB
ABC
B
BC
C    */

public class WeeklyAssignment4_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
				
		}
		
		
		
	}

}
