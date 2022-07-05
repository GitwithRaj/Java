interface vechicle{
	String Name="TVS";//public+static+final
	int Speed =100;//public+static+final
	
	void start();//public+abstract
	void stop();//public+abstract
	
}
public class Interface implements vechicle{
	
      @Override
      public void start()
      {
    	 System.out.print("start: Insert key & press start button\n"); 
      } 
      @Override
      public void stop()
      {
    	  System.out.print("stop: Exit key to stop");
      }
	public static void main(String[] args) {
		Interface I=new Interface();
		I.start();
		I.stop();
		
	}

}
