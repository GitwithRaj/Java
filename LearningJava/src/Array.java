import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]= {10,20,70,40,50};
//		System.out.print(a[2]+" "+a[3]);
		Arrays.sort(a);
		for(int g:a)
		{
			System.out.print(g+" ");
		}
		int b[]=new int[5];
		System.out.print("\nEnter the Array element:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			b[i]=s.nextInt();
		}
		Arrays.sort(b);
		System.out.print(" Sorted Array elements are:");
		for(int c :b) {
			System.out.print(c+" ");
		}

	}

}
