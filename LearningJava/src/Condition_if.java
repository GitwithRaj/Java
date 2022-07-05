import java.util.Scanner;

public class Condition_if {

	public static void main(String[] args) {
		int p;
		System.out.print("Enter Password ");
		Scanner obj=new Scanner(System.in);
		p=obj.nextInt();
		if(p==8917)
		{
			System.out.println("My Name := Raj");
			System.out.println("My Age = 20");
			System.out.println("My Contact NO. = 8917018229");
		}
		else
			{
			System.out.println("Wrong Password !!!");
		}
		
	}

}
