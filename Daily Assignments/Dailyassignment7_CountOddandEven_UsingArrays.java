package dailyassignments;

public class Dailyassignment7_CountOddandEven_UsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Q1. Count Even and Odd Numbers

Write a Java program to count how many even and odd numbers are present in an integer array.

Input:
{11, 24, 35, 42, 56, 67, 80, 93}

Expected Output:
Even numbers: 4
Odd numbers: 4

*/
		
		int [] num= {11, 24, 35, 42, 56, 67, 80, 93};
		int evennumbercount = 0 ; 
		int oddnumbercount = 0;
		
		for(int i=0; i<num.length;i++)
		{
			  if (num[i]%2==0) 
	     	  evennumbercount++;
			  else   
	          oddnumbercount++;
			 
		}
		System.out.println("Even numbers: " + +evennumbercount);
		System.out.println("Odd numbers: " + oddnumbercount);
		
		
		
        
       
	}
}

		
		
		
		
		


