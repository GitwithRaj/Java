
public class A {
	A(){
		
		int a=39;
		int b=21;	
	}
	void avg(int a,int b) {
		int c=(a+b)/2;
		System.out.print("The average of the two no. is "+c);
	}

	public static void main(String[] args) {
		A v=new A();
		v.avg(v.a,v.b);

	}

}
