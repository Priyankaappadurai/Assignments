package weeklyassignments;

class bankaccount
{
  String accountholder;
  double balance;
  
  bankaccount(String accountholder, double balance)
  {
	  this.accountholder = accountholder;
	  this.balance = balance;  
  }
   
  void withdraw(double amount)
  {
	  
	  
	  System.out.println("Account Holder: " + accountholder + "\nCurrent Balance: " +balance + 
			  "\nWithdrawal Amount: " + amount);
  
	  try
		{	
			if(amount<0)
			{
				 throw new Exception("Enter valid amount");	 
		}
			
			if(amount>balance)
			{
				 throw new Exception("Insufficient balance!");
			}
			
		
			
	  balance = balance-amount;
	  System.out.println("Remaining Balance: "+ balance);

		}
		
	  catch (IllegalArgumentException e) 
	  {
          System.out.println(e.getMessage());
      }
      catch (Exception e)
	  {
          System.out.println(e.getMessage());
	  }
	  
		finally
		{
			System.out.println("Transaction process completed");
		}
  }
  
}

public class WeeklyAssignments5_bankaccount_Exceptionhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccount BA = new bankaccount("Rahul", 10000);
		BA.withdraw(15000);
		

	}

}
