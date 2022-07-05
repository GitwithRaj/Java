class Circle{
	
	Circle(double radius)
	{
	  System.out.print("The equation of the circle centered at origin is:");
		System.out.println("X^2+Y^2="+radius*radius);
	}
	Circle(double originx ,double originy,double radius)
	{System.out.print("The equation of the circle centered  not at origin is:");
		System.out.print("X^2+("+-2*originx+"X)+"+originx*originx+ "+Y^2+("+-2*originy+"Y)+"+originy*originy+"="+radius*radius);
	}
}
public class Q4 {

	public static void main(String[] args) {
		Circle c=new Circle(12);
		Circle c1=new Circle(-3,5,12);
	}

}
