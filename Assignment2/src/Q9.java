abstract class Fruit{
	 String Fruit_name;
	 String Fruit_color;
	}
class Apple extends Fruit{
   
		public String toString()
		{
			Fruit_name="Apple";
		    Fruit_color="Red";
			return "Fruit_Name is "+Fruit_name+" and Friut_Color is "+Fruit_color;
		}
	
}
class Banana extends Fruit
{
	
		public String toString()
		{ 
			Fruit_name="Banana";
		   Fruit_color="Yellow";
			return "Fruit_Name is "+Fruit_name+" and Friut_Color is "+Fruit_color;
		}
			
}
class Orange extends Fruit{
	
		public String toString()
		{ 
			Fruit_name="Orange"; 
	    	Fruit_color="Orange";
	 		return "Fruit_Name is "+Fruit_name+" and Friut_Color is "+Fruit_color;
		}
	
}
class Strawberry extends Fruit
{    
		public String toString()
		{	Fruit_name="Strawberry";
	      	Fruit_color="Red";
			return "Fruit_Name is "+Fruit_name+" and Friut_Color is "+Fruit_color;
		}
	
}
public class Q9 {

	public static void main(String[] args) {
		Apple a=new Apple();
		Banana b=new Banana();
		Orange o=new Orange();
		Strawberry s=new Strawberry();
		System.out.println(a);
		System.out.println(b);
		System.out.println(o);
		System.out.println(s);

	}

}
