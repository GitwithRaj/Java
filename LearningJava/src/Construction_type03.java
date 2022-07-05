//	copy construction
class K
{
	int a; String b;
	K(){
		a=20; b="Learn java";
		System.out.println(a+" "+ b);
	}
	K(K ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+ b);
	}
}
public class Construction_type03 {

	public static void main(String[] args) {
		 
		K r=new K();
		K p=new K(r);
	}

}
