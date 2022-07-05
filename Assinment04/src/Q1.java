class BK {
	void withDraw(int withdraw,int bal)
	{   if(bal-withdraw<=1000)
		{
		try {
				bal=withdraw/(bal-bal);	
		}
		catch(Exception e) {
			System.out.print("Oops you can't withdraw minimum 1000 balance should be in account");
		}
	}
	else
	{
		bal=bal-withdraw;
		System.out.print("The remaining Bal is "+bal);
	}		
	}
}
public class Q1 {

	public static void main(String[] args) {
		BK b =new BK();
		b.withDraw(1000, 1800);

	}

}
