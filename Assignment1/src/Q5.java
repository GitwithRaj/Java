
class B{
	int z;double n; String c;
	B()
	{
		z=200; n=438.83; c="Rajkumar";
	}
	B(int a){
		z=a;
	}
	B(double v,String l)
	{
		n=v; c=l;
	}
}
public class Q5 {
	

	public static void main(String[] args) {
	B r1=new B();
	B r2 =new B(34);
	B r3=new B(45.49,"Rohit");
	System.out.println("Constructor1 :"+r1.z+" "+r1.n+" "+r1.c);
	System.out.println("Constructor2 :"+r2.z+" ");
	System.out.print("Constructor3 :"+r3.n+" "+r3.c);
	}

}
