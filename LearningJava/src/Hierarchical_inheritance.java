class X{
	void input()
	{
		System.out.print("Enter your name:");
	}
}
class Q extends X{
	void show()
	{
		System.out.print("My name is Raj Kumar\n");
	} 
}
class R extends X{
	void disp(){
		System.out.print("My name is Rohit Prajapati\n");
		
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
Q b=new Q();
R c=new R();
b.input(); b.show(); c.input(); c.disp(); 

	}

}
