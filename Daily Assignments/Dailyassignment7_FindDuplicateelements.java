package dailyassignments;

public class Dailyassignment7_FindDuplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Find Duplicate Elements

Write a Java program to identify and print all duplicate elements in an array.
 Each duplicate element should be printed only once.

Input:
{10, 20, 30, 20, 40, 10, 50, 30, 60}

Expected Output:
Duplicate elements: 10 20 30  */ 
			
		int [] arr = {10, 20, 30, 20, 40, 10, 50, 30, 60};
		int duplicate[] = new int[arr.length];
		int index =0;
		int check =0;
	   
		for (int i = 0; i < arr.length-1; i++) 
        	{
        	for (int j=i+1; j < arr.length; j++)
        	{
        		if(arr[j]==arr[i])
        		{
        			for(int k=0; k<duplicate.length;k++)
        			{
        				if(duplicate[k]==arr[i])
        				{
        					check=1;
        					break;
        				}
        			}
        				if(check==0)
        				{
        					duplicate[index]=arr[i];
        					index++;
        				}
        				check=0;
        		}
        	}
        		
        	}
      System.out.println("Duplicate Elements:");
      for(int i=0; i<duplicate.length; i++)
      {
    	  if(duplicate[i]!=0)
    		  System.out.print(duplicate[i]+ " ");
      }
    	  
}
}

