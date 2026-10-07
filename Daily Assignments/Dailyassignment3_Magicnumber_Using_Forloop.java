package dailyassignments;

public class Dailyassignment3_Magicnumber_Using_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a Java program to check whether a number is a Magic Number.
Keep adding the digits until you get a single digit. If the final digit is 1, the number is a Magic Number.
Example:
172 → 1+7+2 = 10 → 1+0 = 1
Sample Output:
Enter a number: 172

Digit Sum = 10
Final Digit = 1

172 is a Magic Number */ 
		
		
		int num=172;
		int sum = 0;
	
		System.out.println("Given number: " + num);
        for (; num >9;)
        {
        	
        	for(;num>0;)
        	{
        		int lastDigit = num%10;
        	    sum= sum+ lastDigit;
        		num = num / 10;
        	}
           num=sum;
           sum=0;
         
        }
        System.out.println("Final value of num:" +num);
        
        if(num == 1)
        System.out.println("Given Number is magic number");
        else 
        	System.out.println("Given number is not magic number");
    
	}

}
