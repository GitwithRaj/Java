        /* Method Overloading || Complier time ploymorphism */
class Polu{
	 void add() {
		 int a=10,b=30,c;
		 c=a+b;
		 System.out.println(c);
	 }
	 void add(int a,int b)
	 { 
		 int c;
		 c=a+b;
		 System.out.println(c);
	 }
	 void add(int a,double b)
	 {
		 double c;
		 c=a+b;
		 System.out.println(c);
	 }
}

public class Polymorphism {

	public static void main(String[] args) {
		Polu a=new Polu();
		a.add(); a.add(12,34); a.add(12,78.9);

	}

}
