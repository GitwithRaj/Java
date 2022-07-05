class S1{
	int s1;
	S1(){
		s1=45;
		
	}
	void disps() {
		String s="Start S1";
		System.out.println(s+":"+s1);
	}	
}
class T1 extends S1{
	int t1;
	T1(){
		t1=34;
		
	}
	void dispt()
	{ String t="Start T1";
		System.out.println(t+":"+t1);
	}
}
class U1 extends T1{
	int u1;
	U1(){
		u1=67;
		
	}
	void dispu() {
		String u="Start U1";
		System.out.print(u+":"+u1);
	}
}

public class Q8 {

	public static void main(String[] args) {
		U1 v=new U1();
		v.disps(); v.dispt(); v.dispu();
		

	}

}
