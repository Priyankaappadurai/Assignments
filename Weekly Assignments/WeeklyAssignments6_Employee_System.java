package weeklyassignments;

import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}

public class WeeklyAssignments6_Employee_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = Arrays.asList(
			    new Employee("Rahul", "IT", 60000),
			    new Employee("Priya", "HR", 45000),
			    new Employee("Amit", "IT", 75000),
			    new Employee("Neha", "Finance", 55000),
			    new Employee("Karan", "IT", 60000),
			    new Employee("Simran", "HR", 50000),
			    new Employee("Rohit", "Finance", 75000),
			    new Employee("Ankit", "IT", 40000));
		
//Question 1 – Filter + forEach()   Find all employees whose salary is greater than 50,000 and print their names.
		System.out.println("Whose salary is greater than 50,000:");
		list.stream().filter(e->e.getSalary()>50000).forEach(e1->System.out.println(e1.getName()));
		

//Question 2 – Filter + map()   Find all employees working in the IT department and display only their names.
		System.out.println("\nEmployess Working in IT Department:");
		list.stream().filter(e->e.getDepartment()=="IT").map(Employee::getName).forEach(s->System.out.println(s));
		

//Question 3 – sorted() Sort all employees by salary in ascending order and print employee names along with their salaries.
		
		System.out.println("\nSorting by salary in ascending order");
		list.stream().sorted((a,b)->a.getSalary()-b.getSalary()).forEach((s->System.out.println(s.getName() + "-" + s.getSalary())));
	
//Question 4 – map() + distinct() + sorted()
	//Extract all employee salaries, remove duplicate salaries, and print the unique salaries in ascending order.
		
		System.out.println("Extract all employee salaries, remove duplicate salaries, and print the unique salaries in ascending order");
    list.stream().map(Employee::getSalary).distinct().sorted().forEach(s->System.out.println(s));
		
		
//Question 5 – filter() + map() + distinct() + sorted()  Find employees whose salary is greater than or equal to 50,000. 
//Extract their department names, remove duplicate departments, and print the department names in alphabetical order.
		
    System.out.println("\nExtract their department names, remove duplicate departments, and print the department names in alphabetical order:");
    
    list.stream().filter(e->e.getSalary()>=50000).map(Employee::getDepartment).distinct().sorted().forEach(s->System.out.println(s));
   
		
		
		
		
		
	}

}
