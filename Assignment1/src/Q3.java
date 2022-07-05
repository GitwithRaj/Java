class circle{
	void perimeter(int r) {
		System.out.println("Perimeter of circle is "+2*3.14*r);
	}
	void area(int r) {
		System.out.println("Area of circle is "+3.14*r*r);
	}
}

public class Q3 {

	public static void main(String[] args) {
		circle r=new circle();
		r.perimeter(7);
		r.area(2);

	}

}

