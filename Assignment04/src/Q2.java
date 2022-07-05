import java.util.Scanner;
class substr
{
	void meth(int a,int b,String str)
	{  String str2="",str3="";
	     int i;
			try {
			if(a>=b)
				{
				b=a/0;
				}
		else if(a>=str.length())
		{
			System.out.print(str);
		}
		else if(b>=str.length())
		{   
			for(i=str.length()-1;i>=a-1;i--)
			str2=str2+str.charAt(i);
			for(i=0;i<a-1;i++)
				str3+=str.charAt(i);
			for(i=0;i<str2.length();i++)
				str3+=str2.charAt(i);
			System.out.print(str3);
			
		}
		else
		{
			for(i=b-1;i>=a-1;i--)
				str2=str2+str.charAt(i);
			for(i=0;i<a-1;i++)
				str3+=str.charAt(i);
			for(i=0;i<str2.length();i++)
				str3+=str2.charAt(i);
			for(i=b;i<str.length();i++)
				str3+=str.charAt(i);
			System.out.print(str3);
				
		}
			}
		catch(Exception e)
		{
			System.out.print("  Exception  We can't reverse the string ");
		}
		
	}
}

public class Q2 {

	public static void main(String[] args) {
		int p,q;
		System.out.print("Enter the two no. ");
		Scanner S =new Scanner(System.in);
		p=S.nextInt();
		q=S.nextInt();
		System.out.print("Enter the string ");
		String str;
		str =S.next();
		substr sb= new substr();
		sb.meth(p,q,str);
		
		
		

	}

}
