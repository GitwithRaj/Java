class Object{
	float f;
	String s;	
}
class M extends Object{
	double d;
}
class N extends M{
	
	void display()
	{
	   f=23.89f;
	  s="Raj Kumar Prajapati";
	  d=4598.79;
		System.out.print("float value is "+f+"\nstring value is "+s+"\ndouble value is "+d);
	}
}

public class Q6 {

	public static void main(String[] args) {
		N n=new N();
		n.display();
		

	}

}
