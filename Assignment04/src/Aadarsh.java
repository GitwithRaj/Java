import java.util.Scanner;

class Gcd{
	public int gcd(int a,int b) {
		if(a%b==0)
			return b;
		else {
			return gcd(b,a%b);
		}
	}
}
public class Aadarsh {

	public static void main(String[] args) {
		int A[]=new int[5];
		Gcd g=new Gcd();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			A[i]=s.nextInt();
		}int k=0;
        for(int i=0;i<5;i++) {
        	k=g.gcd(k,A[i]);
        }
        System.out.print("The gcd of the array is "+k);
	}

}
