
public class Q1 {
   void fibonacii()
   {
	  int a1,a2,a3;
	  int i;
	  a1=1;a2=1;
	  System.out.print(a1+","+a2);
	  for(i=1;i<14;i++)
	  {
		  a3=a2+a1;
		  System.out.print(","+a3);
		  a1=a2;
		  a2=a3;
	  }
   }
	public static void main(String[] args) {
		
		Q1 f=new Q1();
		System.out.print("The fibonacii series of 15 no. is  ");
		f.fibonacii();
	}

}
