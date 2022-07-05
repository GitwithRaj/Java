
public class Q7 {
	Q7(){
		System.out.print("Learn coding  ");
	}
	Q7(int a)
	{
		this();  //this keyword is used to call the upper default constructor 
		System.out.print(a);
	}
	public static void main(String[] args) {

		Q7 r =new Q7(37);

	}

}
