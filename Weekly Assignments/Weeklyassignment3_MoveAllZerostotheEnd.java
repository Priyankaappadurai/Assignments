package weeklyassignments;

public class Weeklyassignment3_MoveAllZerostotheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Q2. Move All Zeros to the End
Write a Java program to move all zeros to the end of an array while maintaining the relative order of the non-zero elements.

**Input:**
{0, 5, 0, 3, 8, 0, 2, 9}`

**Expected Output:**
`Array after moving zeros: 5 3 8 2 9 0 0 0` */
		
		int[] arr = {0, 5, 0, 3, 8, 0, 2, 9};
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
	     	}
		}
		System.out.print("Array after moving zeros:" +"\n") ;
		while(index < arr.length) {
			arr[index]=0;
			index++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
