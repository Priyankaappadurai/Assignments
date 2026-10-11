package weeklyassignments;

public class Weeklyassignment3_Findthemissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Find the Missing Number

Write a Java program to find the missing number in an array containing distinct numbers from 1 to 10, with one number missing.

Input:
{1, 2, 3, 5, 6, 7, 8, 9, 10}

Expected Output:
Missing number: 4 */
		
		int[] num = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		
	     int n = num.length+1;

	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;

	        for (int i = 0; i < num.length; i++) 
	        {
	            actualSum = actualSum + num[i];
	        }

	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number: " + missingNumber);
	    }

	}
