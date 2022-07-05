class KB implements Runnable{
	public void run() {
		for(int i=0;i<5;i++)
		{
		   System.out.println("Child Thread");
		}
	}
}
public class Multithreading02 {

	public static void main(String[] args) {
		KB c =new KB();
		Thread t=new Thread(c);
		t.start();
		for(int i=0;i<5;i++)
		{
		   System.out.println("Main Thread");
		}

	}

}
