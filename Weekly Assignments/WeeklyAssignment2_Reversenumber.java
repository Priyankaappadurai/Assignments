package weeklyassignments;

public class WeeklyAssignment2_Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to reverse a given number using a loop.*/
		

        int num = 12345;
        int reverse = 0;

        for (;num> 0;) 
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

      
            System.out.println(reverse);
        }
		
	}
