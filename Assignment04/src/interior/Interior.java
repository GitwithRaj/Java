package interior;
public class Interior {
  public void int_quality(String str)
  {
	  System.out.println("The name of the car is "+str);
	  if(str.equals("Switf"))
	  { System.out.println(str+" has the best engine quality");
	  System.out.println("Run by Petrol");}
	  else
	  { System.out.println(str+" has the better engine quality");
	  System.out.println("Run by Disel");}
		  
  }
	public static void main(String[] args) {
		Interior i =new Interior();
		i.int_quality("Nano");
	}

}
