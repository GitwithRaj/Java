
public class method {

	public static void main(String[] args) {
		
		System.out.print("The sum is "+sum(4,8));
		method m=new method();
		m.Print();
		Print1();
	} 
	 static int sum(int a,int b)
	{
		return a+b;
	}
	 void Print()
	 {
		 System.out.print("\n Hello World ");
	 }
//	 If the word static is not used then we have to make object for that method
      static void Print1() {
    	 System.out.print("\n Hello Raj");
     }
}
