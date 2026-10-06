package dailyassignments;

public class Dailyassignment4_inverted_right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Inverted Right-Angled Triangle
For n = 5:
*****
****
***
**
*      */
		
		for(int row=5; row>=1;row--)
		{
		
	    for(int j=1; j<=row;j++)
	     {
	 	System.out.print("*");
	
	    }
         System.out.println();
	    }

	}

}
