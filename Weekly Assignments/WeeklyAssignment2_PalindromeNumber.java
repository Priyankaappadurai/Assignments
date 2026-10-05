package weeklyassignments;

public class WeeklyAssignment2_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to check whether
		 a given number is a palindrome using a loop. */
		
		
	        int num = 1221;
	        int original = num;
	        int reverse = 0;

	        for (;num> 0;) 
	        {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }
	        System.out.println("Original number is:" + original);
	        System.out.println("Reverse: " +reverse);

	        if (original == reverse) 
	        {
	            System.out.println(+original + " is a palindrome");
	        }
	        else 
	        {
	            System.out.println(+original + " is not a palindrome");
	        }
	        
	    
	}

}
