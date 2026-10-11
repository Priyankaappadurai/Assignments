package weeklyassignments;

public class Weeklyassignment3_FindtheSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*  Q1. Find the Second Largest Element
Write a Java program to find the **second largest distinct element** in an integer array.

**Input:**
`{12, 45, 7, 89, 34, 89, 56}`

**Expected Output:**
`Second largest element: 56`  */
		
		int[] arr = {12, 45, 7, 89, 34, 89, 56};
		int largest = 0;
		int secondlargest = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest=arr[i];
			}
			
			else if(arr[i]<largest && arr[i]> secondlargest)
			{
			secondlargest = arr[i];
			}
		}
		System.out.println("Second largest element: " + secondlargest);

	}

}
