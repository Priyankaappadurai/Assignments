package dailyassignments;

class Student 
{
	int rollNumber;
	String name;
	static String collegeName = "ABC Engineering College";
	static int studentCount = 0;
	
	Student(int rollNumber, String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		studentCount++;
	}
	static void changeCollegeName(String newCollegeName)
	{
		collegeName = newCollegeName;
		System.out.println("College name updated successfully"+ "\n");	
	}
	
	void displayDetails1()
	{
		System.out.println("Roll Number:"+ this.rollNumber+ "\n" +"Student Name:" +this.name+ "\n" + "College Name:" + this.collegeName+ "\n");
	}
	
	
	static void displayStudentCount()
	{
		
		System.out.println("Total number of students:" +studentCount + "\n");
	}

}

public class Dailyassignment11_StudentManagementSystem_statickeyword {
	static
	{
		System.out.println("Student class initialized \n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"Rahul");
		s1.displayDetails1();
		Student s2 = new Student(102,"Priya");
		s2.displayDetails1();
		Student s3 = new Student(103,"Amit");
		s3.displayDetails1();
		Student.displayStudentCount();
		Student.changeCollegeName("XYZ Institute of Technology");
		s1.displayDetails1();
		s2.displayDetails1();
		s3.displayDetails1();
		Student.displayStudentCount();
		
		
		
		
		
	
		

	}

}
