import exterior.Exterior;
import interior.Interior;
public class Q10 {

	public static void main(String[] args) {
		String str[]= {"Swift","Ferrari","Maruti","Toyato","Tata"};
		Exterior e=new Exterior();
		Interior i =new Interior();
		for(int j=0;j<5;j++)
		{  i.int_quality(str[j]);
		e.ext_quality(str[j]);
			if(j%2==0)
			System.out.println(str[j]+" Has color Red");
		else if(j%3==0)
			System.out.println(str[j]+" Has color Black");
		else
			System.out.println(str[j]+" Has color White");	
		}
}

}
