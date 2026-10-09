package dailyassignments;

public class Dailyassignment6_Menu_Based_Operation_Use_switchanddowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Menu-Based Operation
Write a Java program where the following variables are already given:
int choice = 3;
int a = 20;
int b = 5;

Use a do-while loop and switch-case to perform the operation based on choice.
- 1 â†’ Addition
- 2 â†’ Subtraction
- 3 â†’ Multiplication
- 4 â†’ Division
- 5 â†’ Exit
- Use break after executing each case.
- The loop should continue until choice becomes 5.
Expected Output:
Multiplication = 100
		
		*/
		int choice = 3;
		int a = 20;
		int b = 5;
do
		{
	switch (choice)
	{ 
	
	case 1: System.out.println("Addition = " +(a+b));break;
	case 2: System.out.println("Subraction = " + (a-b));break;
	case 3: System.out.println("Multiplication = " + (a*b));break;
	case 4: System.out.println("division = " + (a/b) );break;
	case 5: System.out.println("Exit");
	}
	
	choice++;
	break;
		}
while (choice<=5);
	
	}
}
		
	


