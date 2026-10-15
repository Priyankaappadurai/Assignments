package dailyassignments;

/*Question : Calculate the Area of Different Shapes
Write a Java program to demonstrate polymorphism 
Requirements:

1. Overload the calculateArea(int radius) method for circle 
2. Overload the calculateArea(int length,int breadth) method for rectangle 
Formulas:
- Circle: Area = 3.14 Ã— radius Ã— radius
- Rectangle: Area = length Ã— breadth
Sample Input:
Enter radius of circle: 5
Enter length of rectangle: 8
Enter breadth of rectangle: 4


Expected Output:
Area of Circle: 78.5
Area of Rectangle: 32.0
*/

 public class Dailyassignment9_Polymorphism {
	
	 static float circle(int radius)
	 {
	 return 3.14f*(radius*radius);
     } 
	 
     static float rectangle(int length, int breadth)
     {
     return length*breadth;
     }
		 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Area of Circle:" + circle(5));
	 System.out.println("Area of Rectangle:" + rectangle(8,4));
	
	 
		
		
		
		
		
		
		

	}

}
