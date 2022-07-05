import java.util.Scanner;

public class String_func {

	public static void main(String[] args) {
		String str;
		char temp;
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(str);
		int l=str.length();
		System.out.println(l);
		String str2=str.substring(2);
		System.out.println(str2);
		str2=str.substring(2,5);
		System.out.println(str2);
		System.out.println(str.charAt(3));
		temp=str.charAt(3);
		str=str.replace(str.charAt(1),str.charAt(3));
		System.out.print(str);
		
	}

}
