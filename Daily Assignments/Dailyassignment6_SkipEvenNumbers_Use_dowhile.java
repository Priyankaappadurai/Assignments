package dailyassignments;

public class Dailyassignment6_SkipEvenNumbers_Use_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* 	 Skip Even Numbers
		 Write a Java program to print numbers from 1 to 20 using a do-while loop.
		 Requirements:
		 - Use continue to skip all even numbers.
		 - Print only odd numbers.
		 - Use break to stop the loop when the number becomes greater than 15.
		 Expected Output:
		 1
		 3
		 5
		 7
		 9
		 11
		 13
		 15 */
		
		
		int num =1;
		do
		{	
			if(num%2==0)
		    {
				num++;
				continue;	
			}
			
			System.out.println(num + " ");
			num++;
			
			if(num>15)
			{
				break;
			}		
		}
		while(num<=20);
}
}