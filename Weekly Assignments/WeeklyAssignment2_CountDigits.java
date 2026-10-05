package weeklyassignments;

public class WeeklyAssignment2_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to count the 
		 number of digits in a given number using a for loop. */
		

    		int num = 987654;
	        int count = 0;

	        for (; num >0;)
	        {
	           num = num / 10;
	            count++;
	        }

	        System.out.println("Number of digits: " + count);
	    }
	}
		

