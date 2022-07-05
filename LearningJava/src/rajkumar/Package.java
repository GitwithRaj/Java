package rajkumar;
//class B{
//	//When we use private in class B then we can't access the disp method inside package
// void disp() {
//		System.out.println("Hello Rajkumar");
//	}
//}
public class Package {
//private method can only be accessable in the same class
	public void show()
	{
		System.out.print("Helloo Raj");
	}
	public static void main(String[] args) {
		Package p=new Package();
//		B b=new B();
//		b.disp();
		p.show();
            
	}

}
