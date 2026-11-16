package weeklyassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeeklyAssignments5_StudentMarksCalculator_Exceptionhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 subjects marks");
		int marks[] = new int[5];
		int total=0;
		float avg=0;
	    for(int i=0;i<5;i++)
		{
			System.out.println("Enter Subject"+(i+1)+ "\tMark:");
			marks[i] = sc.nextInt();
            total=total+marks[i];
            avg = total/5;
		}
	    System.out.println();
        System.out.println("Total Marks: " +total);
		System.out.println("Average Marks: " +avg);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input! Please enter integer marks");
		}
	            
	    finally
      	{
		System.out.println("Marks calculation process completed");
	    }

	}
}


