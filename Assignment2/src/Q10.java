abstract class Airplane{
	int Serial_Number;
	int Capacity;	
}
class B747 extends Airplane{
	public String toString() {
		Serial_Number=1;
		Capacity=105;
		return " Airplane B747 Serial_Nmuber is "+Serial_Number+" and the capacity is "+Capacity;
	}
}
class B757 extends Airplane{
	public String toString() {
		Serial_Number=2;
		Capacity=110;
		return " Airplane B757 Serial_Nmuber is "+Serial_Number+" and the capacity is "+Capacity;
	}
}
class B767 extends Airplane{
	public String toString() {
		Serial_Number=3;
		Capacity=115;
		return " Airplane B767 Serial_Nmuber is "+Serial_Number+" and the capacity is "+Capacity;
	}
}
public class Q10 {

	public static void main(String[] args) {
		B747 b1=new B747();
		B757 b2=new B757();
		B767 b3=new B767();
  System.out.println(b1);
  System.out.println(b2);
  System.out.println(b3);
	}

}
