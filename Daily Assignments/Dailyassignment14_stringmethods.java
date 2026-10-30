package dailyassignments;

public class Dailyassignment14_stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABCD123F5 -> sum the numbers
		
		String str="ABCD123F5";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				int num = Integer.parseInt(str.charAt(i)+"");
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
