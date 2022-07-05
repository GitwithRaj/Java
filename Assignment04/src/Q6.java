import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int A[]= {2,4,1,5,7};
		int n;
		System.out.print("Enter the no.");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		try {
			for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
		}
		catch(Exception e) {
			System.out.print("\nIndex 5 out of bounds for length 5");
		}

	}

}
