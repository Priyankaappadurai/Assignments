package dailyassignments;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student5
{
	int RollNo;
	String Name;
	String Course;
	Student5(int RollNo, String Name, String Course)
	{
		this.RollNo = RollNo;
		this.Name = Name;
		this.Course = Course;
	}
	
	void display()
	{
		System.out.println("Student{RollNo='" + RollNo + "', Name='" +Name + "', Course='" +Course +"'}");
	}
	@Override
	public int hashCode() {
		return Objects.hash(RollNo,Name,Course);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student5 other = (Student5) obj;
		return Objects.equals(Course, other.Course) && Objects.equals(Name, other.Name) && RollNo == other.RollNo;
	}
		
}

public class Dailyassignments19_hascode_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student5> set = new HashSet<Student5>();
		
		Student5 s1= new Student5(101,"Rahul","Java");
		Student5 s2= new Student5(102,"Priya","Python");
		Student5 s3= new Student5(101,"Rahul","Java");
		Student5 s4= new Student5(103, "Amit","Java");
		Student5 s5= new Student5(102,"Priya","Java");
		Student5 s6= new Student5(101,"Rahul","Selenium");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6); 
		
		for(Student5 s :set )
		{
			s.display();
		}

		System.out.println();
		System.out.println("Total Students: " + set.size());
	}

}
