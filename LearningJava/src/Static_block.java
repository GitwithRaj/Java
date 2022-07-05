
public class Static_block {
	static int b=458;
 static {
	 System.out.print("static block ");//static block not need any object to execute
 }
	public static void main(String[] args) {
		System.out.print(b);
	}
}
