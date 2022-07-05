
  class Z
{
	private int a=90;
	  protected int show1(){
		return a;
	}
}
class P extends Z
{
	
	protected void show()
	{ int a=30;
		System.out.println(a);
		int c=show1();
		System.out.print(c);
		
	}
} 
public class Super_keyword 
{
	public static void main(String[] args) {
		P r=new P();
		r.show();
   }

}
