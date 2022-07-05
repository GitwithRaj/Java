import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n;
		System.out.print("Enter the no.");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		try {
			for(int i=0;i<n;i++)
				System.out.println(a[i]);
			try {
				n++;
				for(int i=0;i<n;i++)
					System.out.println(a[i]);
			}
			catch(Exception e)
			{
				System.out.println("Array out of Index exception in case 2");
			}
		}
		catch(Exception e)
		{
			System.out.println("Array out of Index exception in case 1");
		}
	}
}
