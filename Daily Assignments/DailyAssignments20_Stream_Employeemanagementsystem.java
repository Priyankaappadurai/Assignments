package dailyassignments;

import java.util.*;

class Employee_Sytem
{
	String name;
	double salary;
	public  Employee_Sytem(String name, double salary)
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	
}



public class DailyAssignments20_Stream_Employeemanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee_Sytem obj1 = new  Employee_Sytem("Amit", 45000);
		 Employee_Sytem obj2 = new  Employee_Sytem("Rahul", 65000);
		 Employee_Sytem obj3 = new  Employee_Sytem("Anjali", 75000);
		 Employee_Sytem obj4 = new  Employee_Sytem("Priya", 40000);
		List< Employee_Sytem> list = new ArrayList< Employee_Sytem>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		System.out.println("Employees earning more than 50000:");
		list.stream().filter(e-> e.salary>50000).
		forEach(e1->System.out.println(e1.name+":"+e1.salary));
				
		

	}

}
