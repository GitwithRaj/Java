
public class Instance_block {
	Instance_block()
	{
		System.out.print("Learn java");//Default constructor
	}
	{
		System.out.println("Learn Coding");//Instance block execute before default constructor
	}

	public static void main(String[] args) {
		Instance_block r=new Instance_block();
	}
 
}
