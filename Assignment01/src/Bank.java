
public class Bank {
  void withdrawBal(int withdraw,int bal)
  {
	  if(bal-withdraw<1000)
	  {	  try
	  {
			 bal= withdraw/(bal-bal);
	  }
	  catch(Exception e) {
		  System.out.println("Oops You should have minimum balance 1000");
	  }
	  }
	  else
	  {
		  bal=bal-withdraw;
		  System.out.println("The remaining balance is "+bal);
	  }
  }
  
  public static void main(String[] args) {
    Bank b=new Bank();
    b.withdrawBal(2000, 5000);
    b.withdrawBal(2000, 1500);
    b.withdrawBal(3400,6000);
    b.withdrawBal(2000, 3000);
    b.withdrawBal(2000, 10500);
    b.withdrawBal(6000,6000);
    
    
		
	}

}
