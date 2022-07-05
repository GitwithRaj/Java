
public class JavaImmutable {

	public static void main(String[] args) {
		String str="Raj";  //Immutable (Can't change)
		str.concat("kumar");
		System.out.print(str+" ");
		 String str2=str.concat("kumar");
		System.out.print(str2);
	}
 
}
