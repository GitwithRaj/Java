
public class Q2 {
	
	void FPN()
	{
		int i,j,count;
		for(i=100;i<=200;i++)
		{    count=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				     count++;
			}
			if(count==0)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		Q2 p=new Q2();
		System.out.print("The prime no. between 100 and 200 are ");
		p.FPN();

	}

}
