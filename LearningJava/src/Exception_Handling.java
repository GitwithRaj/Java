
public class Exception_Handling {

	public static void main(String[] args) {
		System.out.println("Main method is started");
		int a=20,b=0,c;
		try {
		c=a/b;
		System.out.print(c);
		}
		catch(Exception e){
//			System.out.println(e);
			System.out.println("Can't divide by zero");
		}
		System.out.print("Main method is ended");
	}

}
