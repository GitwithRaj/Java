import java.util.Scanner;

class Rock{
	int rock1=1;
	int rock2=2;
	int rock3=3;
	int rock4=4;
	int rock5=5;
	int rock6=6;
	int rock7=7;
	int rock8=8;
	int rock9=9;
	int rock10=10;
	int A[]= {rock1,rock2,rock3,rock4,rock5,rock6,rock7,rock8,rock9,rock10};
	
}
public class Q5 {

	public static void main(String[] args) {
		Rock R=new Rock();
		int ch,i,sum=0;
		System.out.print("1.For finding the individual mass\n2. For total mass");
		System.out.print("\nEnter your choice:");
		Scanner s =new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("Enter the rock no. you want");
			i=s.nextInt();
		    System.out.print("Mass of "+R.A[i-1] + "th is "+R.A[i-1]);
		    break;
		case 2:
			for(i=0;i<10;i++)
				sum+=R.A[i];
			System.out.print("The sum of the total masses are :"+sum);
		}
	}

}
