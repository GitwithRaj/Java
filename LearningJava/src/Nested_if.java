import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		int num1,num2, num3;
		System.out.println("Enter the  three numbers:");
		Scanner s=new Scanner(System.in);
		num1 =s.nextInt();
		num2 =s.nextInt(); 
		num3 =s.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("greater no. is "+num1);
			}
			else {
				System.out.println("greater no. is "+num3);
			}
		}
		else {
			if(num2>num3)
				System.out.println("greater no. is "+num2);
			else
				System.out.println("greater no. is "+num3);
		}
		
	}

}
