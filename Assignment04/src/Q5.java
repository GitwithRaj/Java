import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	String str[]= {"Raj","kumar",null,"pra","ja","pati","kal","bal","lal","bv"};
//		String str1[]=new String[10];
//		System.out.print("Enter your string");
//		Scanner x= new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			str1[i]=x.next();
//		}
		for(int i=0;i<10;i++)
		{
			try {  
				if(str[i]!=null)
				System.out.println(str[i]);	
				else
					System.out.print(2/0);
			}
			catch(Exception e)
			{
				System.out.println("Exception there is null string");
				break;
			}
		}
	}

}
