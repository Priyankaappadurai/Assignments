package weeklyassignments;

public class WeeklyAssignment2_EvenandOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to print all even numbers
		and odd numbers between 1 and 20 using a loop.*/
		
		System.out.println("Even Numbers:");
		for(int num=1; num<=20;num++)
	
		if(num%2==0)
		System.out.print(num + " ");
		
		System.out.println("\n\nOdd Numbers:");
		for(int num1=1; num1<=20;num1++)
			if(num1%2 !=0)
				System.out.print(num1 + " ");
		
		
			
		

	}

}
