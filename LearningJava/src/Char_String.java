
public class Char_String {
  
	public static void main(String[] args) {
		char c='a';
		String s1= Character.toString(c);
		System.out.println("The String is "+s1);
		String s2 = String.valueOf(c);
		System.out.println("The String is "+s2);
		char ch[]= {'a','b','c','v','l','k','n','K'};
		String s3= String.valueOf(ch);
		System.out.print("s3 value is "+s3);
		String s4= new String(ch);
		System.out.print(" s4 value is "+s4);
		
		
	}

}
