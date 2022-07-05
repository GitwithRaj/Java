package circle;
public class Circle {
	public void area(int radius)
	{
		System.out.println("The area of the Circle is "+2*3.14*radius);
	}

	public static void main(String[] args) {
		Circle c=new Circle();
		c.area(6);
	}

}
