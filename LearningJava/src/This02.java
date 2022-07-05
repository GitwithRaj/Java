
public class This02 {
	int a=0;   // instance variable
	This02(int a)  // local variable
	{  
		System.out.println(this.a);
		this.a=a;	
	}
	void show()
	{
		System.out.print(a);
	}
	public static void main(String[] args) {
		This02 r= new This02(343);
				r.show();

	}

}
