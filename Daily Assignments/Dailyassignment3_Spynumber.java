package dailyassignments;

public class Dailyassignment3_Spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to check whether a number is a Spy Number.
A number is a Spy Number if the sum of its digits is equal to the product of its digits.
Example:
1124 → Sum = 1+1+2+4 = 8
Product = 1×1×2×4 = 8
Sample Output:
Enter a number: 1124
Sum of digits = 8
Product of digits = 8
1124 is a Spy Number */
		
		
		int num = 1124;
		int n=num;
		int sum = 0;
		int product = 1;
		
	
		for(;n>0;)
		{
			int lastdigit = n%10;
			n = n/10;
			
			sum = sum + lastdigit;
			product = product * lastdigit;
			
		}
		
		System.out.println("Given number is: " + num);
		
		if(sum == product) 
			
		System.out.println(+num +" is spy number");
		
		else 
	
		System.out.println(+num + " is not a spy number");
	
		}

}
