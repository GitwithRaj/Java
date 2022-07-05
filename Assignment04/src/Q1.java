class Bank{
	void withDraw(int bal,int withdraw) {
		
			try {
				if(bal-withdraw<=1000) {
				bal=bal/(bal-bal);}
				else
				{
					bal=bal-withdraw;
					System.out.println("The remaining balance is "+bal);
				}
			}
			catch(Exception i) {
				System.out.println("OOPS you can't withdraw minimum bal should be 1000");
			}	
	}
}
public class Q1 {

	public static void main(String[] args) {
		Bank v=new Bank();
		v.withDraw(1000, 1390);
		v.withDraw(2000,300);
		v.withDraw(4000, 1390);
		v.withDraw(2000,3900);
		v.withDraw(10000, 1690);
		v.withDraw(20,300);
	}

}
