interface Resume
{  String Name="Rahman Shastri";
    String Qualification="M-tech in Computer Science at IIT Bombay";
    int Experience=5;
	void Boidata1();
	String Name1="Raj Kumar Prajapati";
	String Displine="Regular Classes ,Complete assignment on time";
	int marks=9;
	void Boidata2();
	
}
 class Teacher implements Resume {
	 @Override
     public void Boidata1()
     {
  	   System.out.println(" Teacher Biodata:\n Name="+Name+"\nQualification ="+ Qualification+"\nExperience in years="+Experience);
     }
   @Override
   public void Boidata2()
   {
	   System.out.print("Students Biodata:\n Name ="+Name1+"\nDispline="+Displine+"\nMarks in CGPA="+marks);
   }

	public static void main(String[] args) {
		
		
       Teacher t=new Teacher();
       t.Boidata1(); t.Boidata2();

}
 }
