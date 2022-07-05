//	Parameterized contructor
class B{

	int y; String q;
	B(int a,int b){
		System.out.println(a+" "+b);
	}
	B(int x,String p)
	{
		y=x; q=p;
	} 
	void show()
	{
		System.out.print(y+" "+q);
	}
}
public class Constructor_type02 {

	public static void main(String[] args) {
		B b=new B(35,58);
		B b1=new B(36,"Rajkumar");
		b1.show();

	}

}
