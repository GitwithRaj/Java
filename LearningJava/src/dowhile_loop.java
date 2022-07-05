import java.util.Scanner;

public class dowhile_loop {

	public static void main(String[] args) {
		int i=1,n;
		System.out.print("Enter the no. whose table is required :");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		do {
			System.out.println(n+"x"+i+"="+n*i);
			++i;
		} 
		while(i<=10);
		
	}

}
