
public class Person {
	

	int age=21;
	int weight= 55;
	String color="light";
	void eat()
	{ 
		System.out.print("I am eating");
	}
		void sleep()
		{
			System.out.print("I am sleeping");
		}
	public static void main(String[] args) {
		Person p= new Person();
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.color);
		p.eat();  p.sleep();
	}
		
	

}
