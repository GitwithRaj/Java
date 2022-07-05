

public class This {
	void show()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		This r =new This();
		r.show();
		System.out.print(r+" Raj");
		

	}
 
}
