
public class Q6 {

	public static void main(String[] args) {
		System.out.println("The root of the equation 3*x*x+2*x+5=0 ");
	    double x1,x2;
	    x1=-2+Math.sqrt(4-4)/2;
	    x2=-2-Math.sqrt(4-4)/2;
	   if(x1==x2)
	   {
		   System.out.print("Two real and equal roots is "+ x1);
	   }
	   else if(x1<=0 || x1>0)
	   {
		   System.out.print("Two real and different roots are " +x1 +" "+x2);
	   }
	   else {
		   System.out.print("!!!The roots are imaginary!!!");
	   }
	}

}
