//  Private contructor

public class N {

	int a; double b; String c;
	private N()
	 {
		a=40; b=576.97; c="Rohit";
		System.out.println(a+" "+b+" "+c);
	}
	 
	public static void main(String[] args) {
			N r=new N();
		}
}
//if we want to access the private element in another class it will give error
