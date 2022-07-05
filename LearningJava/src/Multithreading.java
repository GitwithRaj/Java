class KA extends Thread{
	
	public void run()
	{  
		try{
			for(int i=0;i<5;i++)
           {
				System.out.println("Hello Rajkumar");
		  Thread.sleep(1000);
		  }
		}
		catch(InterruptedException i){
			
		}
		  
	}
}

public class Multithreading  {

	public static void main(String[] args) throws InterruptedException {
		KA a =new KA();
		a.start();
		 for(int i=0;i<5;i++)
		 {	System.out.println("Hello Raj");
		     Thread.sleep(1000);
		 }

	}

}
