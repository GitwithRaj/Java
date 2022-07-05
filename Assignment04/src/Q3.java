import java.util.Scanner;

class Zero{
	void div(int a,int b) {
			try {
				if(b==0)
				{
				a=a/b;
		   }
		else
			{
			System.out.print(a/b);
			}
	
			}
		catch(Exception e)
		{
			System.out.print(" Exception We can't divide any no. by zero");
		}
	}
		
}
public class Q3 {

	public static void main(String[] args) {
		int x,y;
		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter the no. ");
		x=Sc.nextInt();
		y=Sc.nextInt();
		Zero z=new Zero();
	     z.div(x,y);	
	}

}
