package dailyassignments;

import java.util.Scanner;

public class Dailyassignment12_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element"+(i+1));
			arr[i]=sc.nextInt();
			sum =sum+arr[i];
				
		}
		System.out.println();
		System.out.println("Sum of the elements: " +sum);
		
		
		
		
		
		
		
		
		

	}

}
