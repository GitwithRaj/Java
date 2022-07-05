
public class Second {
 
	int a=10; //instance variable
	 static double b=20.6;   //static variable
	public static void main(String[] args) {
		boolean c=true;  //local variable
		
		Second S=new Second();
//		since instance variable cannot be print without making object of the class here class="Second" and  object ="S"
      System.out.println(S.a);
//      while static and local variable need not object 
      System.out.println(b);	
      System.out.println(c);	
      System.out.println(S.a+" "+b+" "+c);	
      
	}

}
