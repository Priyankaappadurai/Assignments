package dailyassignments;

/*Question : Character Wrapper Class
Write a program using the Character wrapper class to:
1. Check whether the character '7' is a digit.
2. Check whether the character 'A' is a letter.
3. Convert the character 'b' to uppercase.
4. Print the results.
Hint: Use Character.isDigit(), Character.isLetter(), and Character.toUpperCase(). */


public class Dailyassignment13_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char test ='7';
		if(Character.isDigit(test))
			System.out.println("Given data "+ test+ " is a Digit");
		else
			System.out.println("Given data "+ test+ "is not a digit");
		
		char test1 ='A';
		if(Character.isLetter(test1))
			System.out.println("Given data "+ test1+" is a letter");
		else
			System.out.println("Given data "+ test1+" is not a letter");
		
		char test3 ='b';
		test3= Character.toUpperCase(test3);
		System.out.println(test3);
		
		String test4="bold";
		String t = test4.toUpperCase();
		System.out.println(t);
		
		
		

	}

}
