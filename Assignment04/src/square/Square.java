package square;
public class Square {
  public void area(int side)
  {
	  System.out.println("The area of the square is "+ side*side);
  }
	public static void main(String[] args) {
		Square s =new Square();
		s.area(5);

	}

}
