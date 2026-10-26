package dailyassignments;

//task1
class employee
{
	int employeeId;
	String employeeName;
	double salary;

employee(int employeeId,String employeeName, double salary)
{
	this.employeeId = employeeId;
	this.employeeName= employeeName;
	this.salary=salary;
}
void displayDetails()
{
	System.out.println(this.employeeId+ ":" + this.employeeName + ":" + this.salary);
}
}

//task2
class company

{
	  final String COMPANY_NAME = "Tech Solutions Pvt. Ltd.";
	  final int MAX_EMPLOYEES = 100;

  
void display()
{
	System.out.println(COMPANY_NAME + MAX_EMPLOYEES);
}
}

//task3
 /* final */ class employee1
{
	
	
	 /* final */ void calculateBonus()
	{
		System.out.println("Emp Bonus calculated");
	}
	
}
class manager extends employee1
{
	
	void calculateBonus()
	{
		System.out.println("Manager Bonus calculated ");
	}
}

//task4
/* final */ class SecurityPolicy
 {
	 
	 void displayPolicy()
	 {
		 System.out.println("TestA");
	 }
 }
 
 class AdminPolicy extends SecurityPolicy
 {
	 void displayPolicy()
	 {
		 System.out.println("TestB");
	 }
 }

public class Dailyassignments10_EmployeeManagmentSystem {
	public static void main(String[] args) {
		employee emp1 = new employee(101,"Priyanka",10000);
		employee emp2 = new employee(102,"Anand", 12000);
		emp1.displayDetails();
		emp2.displayDetails();
	    company comp = new company();
		//comp.MAX_EMPLOYEES=200;
	    comp.display();
	    manager manager = new manager();
	    manager.calculateBonus();
	    AdminPolicy AP = new AdminPolicy();
	    AP.displayPolicy();
	    	    
		
	}

}
