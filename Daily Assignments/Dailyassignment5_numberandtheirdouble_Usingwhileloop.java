package dailyassignments;

public class Dailyassignment5_numberandtheirdouble_Usingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2. Print Numbers and Their Double
Take a number N and print each number from 1 to N along with its double.
Sample Input: N = 5
Output:
1 â†’ 2
2 â†’ 4
3 â†’ 6
4 â†’ 8
5 â†’ 10 */ 
		
		int num = 1;
		while(num<=5)
		{
		 System.out.println("Dobule of "+ num  + " is: " + (num*num));
		   num++;
		}
  
	}

}
