package weeklyassignments;

public class WeeklyAssignment2_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to check whether
		 a number is an Armstrong number using loops. */
		
		 int num = 153;
	     int original = num;
	     int sum = 0;

	        for (;num> 0;)
	        {
	            int lastdigit = num % 10;
	            num = num / 10;
	            sum = sum + (lastdigit* lastdigit * lastdigit);
	        }

	        if (original == sum)
	        
	            System.out.println(+sum +" is Armstrong number");
	         else 
	            System.out.println(+sum +" is Not an Armstrong number");
	}
}
	


