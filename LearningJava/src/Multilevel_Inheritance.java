//One super class extended by many sub classes
class L{
	int a,b,c;
	void add()
	
	{ 
		a=10;b=5;c=a+b;
		System.out.print("The sum of "+a+" and "+b+" is "+c);
	}
}
class M extends L{ 
	
	void subtraction()
	{  c=a-b;
		System.out.print("\nThe subtraction of "+a+" and "+b+" is "+c);
	}
	
}
class C extends M{
	
	void multiplication()
	{  c=a*b;
		System.out.print("\nThe multiplication of "+a+" and "+b+" is "+c);
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		C v=new C();
		v.add(); v.subtraction(); v.multiplication();

	}

}
