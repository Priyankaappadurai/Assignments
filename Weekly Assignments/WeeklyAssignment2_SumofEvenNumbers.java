package weeklyassignments;

public class WeeklyAssignment2_SumofEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Write a Java program to find the sum of 
		all even numbers between 1 and 50 using a loop.*/
		
	int sum=0;
        
        for(int num=1; num<=50; num++)
		
		if(num%2==0)
			
			sum=sum+num;
			System.out.println("Sum of Even numbers:" +sum);
		
	}

}
