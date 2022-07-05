//Super Class
class Student{
	int roll,marks;
	String name;
	void input()
	{
		System.out.print("Your name, roll and mark in Physics:");
	}
}
//Sub class
class Raj extends Student{ 
	void disp()
	{
		roll=43;marks=79;name="Raj";
		System.out.print(name+" "+roll+" "+marks);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Raj b=new Raj();
		b.input();
		b.disp();
	}

}
