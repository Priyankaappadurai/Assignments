package dailyassignments;
/* Sorting and Finding Sum
Problem Statement: Employee Salary Analysis Using Stream API

Create an Employee class with the following two fields:
1. name â€“ String
2. salary â€“ double
Create 3 Employee objects and add them to an ArrayList.
Input
Employee Name	Salary
Rahul	50000
Priya	70000
Amit	60000

Tasks
1. Use Stream API to sort employees by salary in ascending order.
2. Use Stream API to sort employees by salary in descending order.
3. Use Stream API to calculate the total salary of all employees using mapToDouble() and sum().
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Employees1_System
{
	String name;
	double salary;
	
	public Employees1_System(String name, double salary) {
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

public class DailyAssognments21_SteamAPI_EmployeeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees1_System obj1 = new  Employees1_System("Rahul", 50000);
		Employees1_System obj2 = new  Employees1_System("Priya", 70000);
		Employees1_System obj3 = new  Employees1_System("Amit", 60000);
		List<Employees1_System> list = new ArrayList<Employees1_System>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		//Use Stream API to sort employees by salary in ascending order.
		
		System.out.println("Sort employees by salary in ascending order");
		
		list.stream().sorted(Comparator.comparingDouble(Employees1_System::getSalary)).
		forEach(s->System.out.println(s.name + ":" +s.salary));
		
		
		//Use Stream API to sort employees by salary in descending order.
	
       System.out.println("Sort employees by salary in descending order");
		
		list.stream().sorted(Comparator.comparingDouble(Employees1_System::getSalary).reversed()).
		forEach(s->System.out.println(s.name + ":" +s.salary));
		
		//Use Stream API to calculate the total salary of all employees using mapToDouble() and sum().
		
		System.out.println("salary of all employees");
		
		double sum = list.stream().map(Employees1_System::getSalary).mapToDouble(Double::doubleValue).sum();
		System.out.println(sum);
				

	}

}
