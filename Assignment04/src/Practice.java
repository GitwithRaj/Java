import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String str[]= {"raj","Roshan","Raju"};
		String N;
		System.out.print("Enter your String");
		Scanner scan =new Scanner(System.in);
		N=scan.next();
		int flag=0;
		for(int i=0;i<3;i++)
		{
			if(N.equals(str[i]))
			{
				flag=1;
				System.out.print("YES");
			}
		}
     if(flag==0)
    	 System.out.print(str[2]);
	}

}
