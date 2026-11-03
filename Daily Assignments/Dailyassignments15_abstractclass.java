package dailyassignments;

abstract class Employee
{
	int employeeid;
	String employeename;
	
	Employee(int employeeid, String employeename)
	{
		this.employeeid= employeeid;
		this.employeename = employeename;
	}
	abstract void calculateSalary();
	abstract void displayDetails();
}

class FullTimeEmployee extends Employee
{
	int monthlysalary;
	
	FullTimeEmployee(int employeeid, String employeename,int monthlysalary) 
	{
		super(employeeid,employeename);
		this.monthlysalary= monthlysalary;
	}
	
	 void calculateSalary()
	{
		
		System.out.println(monthlysalary);
	}
	
	void displayDetails()
	{
		
		System.out.println("Full Time Employee:\n" +"Employee ID: " +employeeid + "\n" +"Employee Name: " + employeename + "\n" + 
		"Monthly Salary: ₹" +monthlysalary);
	}
} 

class PartTimeEmployee extends Employee
{
	 int  hoursWorked;
	 int hourlyRate;
	 int cal;
	
	 PartTimeEmployee(int employeeid, String employeename,int hoursWorked, int hourlyRate) 
	 {
	    super(employeeid,employeename); 
		this.hoursWorked= hoursWorked;
		this.hourlyRate= hourlyRate;
	 }
	 
	 void calculateSalary()
		{
		   cal=hoursWorked*hourlyRate;
		   System.out.println("Calculated Salary: ₹" +cal);
		}
	 
	 void displayDetails()
	 {
		 System.out.println("Part Time Employee\n" +"Employee ID: " +employeeid + "\n" +"Employee Name: " +
	 employeename + "\n" + "Hours Worked: " + hoursWorked + 
	 "\nHourly Rate:" +  hourlyRate);
	 }
}

  
public class Dailyassignments15_abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee FE = new FullTimeEmployee(101,"Rahul",50000);
		FE.displayDetails();
		System.out.println();
		PartTimeEmployee PE = new PartTimeEmployee(102,"Amit",80,300);
		PE.displayDetails();
		PE.calculateSalary();
		
		

	}

}
