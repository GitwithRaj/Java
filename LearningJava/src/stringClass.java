
public class stringClass {

	public static void main(String[] args) {
		
		String str ="Rajkumar";
//		int l=str.length();
//		System.out.print(str.toUpperCase());
//		System.out.print(str.toLowerCase());
		String str2= new String("Rajkumar");
       
//		It check the string and the place where to store so here str
//		store inside heap memory in String Constant Pool(SCP),whereas str2 store in normal in 
//		heap memory so return not equal
		if(str==str2) 
		{
			System.out.print("Equal\n");
		}
		else
		{
			System.out.print("Not equal\n");
		}
		
//		It check only the string so give equal output
		if(str.equals(str2))
		{
			System.out.print("Equal\n");
		}
		else
		{
			System.out.print("Not equal\n");
		}
	}

}
