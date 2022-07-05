
public class This03 {
	This03(){
		System.out.print("Learn coding  ");
	}
	This03(int a)
	{
		this();  //this keyword is used to call the upper default constructor
		System.out.print(a);
	}

	public static void main(String[] args) {
		This03 r =new This03(37);

	} 

}
