package dailyassignments;

public class Dailyassignment4_Butterfly_pattern_Using_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4)Butterfly Pattern
For n = 5:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
		
		for(int row=1; row<=5; row++)
		{
			for(int star = 1; star<=row;star++)
			System.out.print("*");
			
			for(int sp =1; sp<=10-2*row; sp++)
				System.out.print(" ");
			
			for(int start =1; start<=row; start++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int row=1; row<=4; row++)
		{
			for(int star = 1; star<=5-row;star++)
			System.out.print("*");
			
			for(int sp =1; sp<=2*row; sp++)
				System.out.print(" ");
			
			for(int start =1; start<=5-row; start++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
