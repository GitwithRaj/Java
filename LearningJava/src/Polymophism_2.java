  /*Runtime Polymporphism */
class Shape{
	void draw()
	{	
		System.out.println("The shape is circle");
}

}
class Square extends Shape{
@Override
	void draw() { 
	super.draw();//to execute the super method
	System.out.print("The shape is Square");
	}
}
public class Polymophism_2 {

	public static void main(String[] args) {
//Shape d= new Square();  we can create object like this also
Square d= new Square();
d.draw();
	}

}
