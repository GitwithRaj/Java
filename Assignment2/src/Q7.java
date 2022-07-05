class G{
int x=86;//hidden variable
}
class H extends G{
	
	 void display() {
	int x=32;
		System.out.print("the hidden value is "+super.x+"\nthe normal value is "+x);
	}
}
public class Q7 {

	public static void main(String[] args) {
		H h=new H();
		h.display();

	}

}
