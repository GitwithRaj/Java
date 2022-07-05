import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
	String s;
		System.out.print("Enter your string:");
		Scanner u=new Scanner(System.in);
		s=u.next();

		char v[]=s.toCharArray();
		int A=v[0];
		if(A>=65 && A<=91)
			System.out.print("The string is start with uppercase letter \nThe string is "+s);
		else
			System.out.print("!!!Error!!! The String is "+s+" started with lowercase ");
		
		

	}

}
