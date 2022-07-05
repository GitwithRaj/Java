import java.util.Scanner;

class Bank
{
	private double bal=5000;
	private int pwd=123;
	
	public void deposit()
	{
		int n,password;
		System.out.println("Enter your amount to deposit ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print("Enter your password ");
		password=s.nextInt();
		if(pwd==password)
		{     bal=bal+n;
			System.out.println("your money is deposited..");
			System.out.print("Your total balance is "+bal);
		}
		else
		{
			System.out.print("Invalid password  ");
		}
	}
	public  void withdraw() {
		int n,password;
		System.out.println("Enter your amount to withdraw ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print("Enter your password ");
		password=s.nextInt();
		if(pwd==password)
		{     bal=bal-n;
			System.out.println("your money is withdrawn..");
			System.out.print("Your total balance is "+bal);
		}
		else
		{
			System.out.print("Invalid password  ");
		}
	}
	public void checkbal() {
		int password;
		System.out.print("Enter your password ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==pwd)
		{
			System.out.print("Your balance is "+bal);
		}
		else {
			System.out.print("Invalid password...");
		}
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		int ch;
		System.out.println("1.Deposit money");
		System.out.println("2.Withdraw money");
		System.out.println("3. Check balance ");
		System.out.print("Enter your choice ");
		Scanner s= new Scanner(System.in);
		ch=s.nextInt();
		Bank b=new Bank();
		switch(ch)
		{
		case 1: b.deposit();
		break;
		case 2: b.withdraw();
		break;
		case 3: b.checkbal();
		break;
		default: 
			System.out.print("Invalid choice...");
		}
	}
}
