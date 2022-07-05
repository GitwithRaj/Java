class Vote{
	String Name[]= {"Raj","Pavan","Surya","Vamsi","Aadrash","Dev","Ahmed","Sonu","Monu","Rajat","Divya",
			"Nilam","Rani","Sona","Ajay","Gagan","Hira","Mani","Soham","Jitesh"};
	int Booth_no[]= {1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4};
	int age[]= {18,19,20,21,20,19,32,40,54,43,18,19,20,21,20,19,32,40,54,43};
	String address[]= {"ABC","ACDE","asg","DJD","dus","fhd","hjd","fjdd","DHS","jdws",
			"ABC","ACDE","asg","DJD","dus","fhd","hjd","fjdd","DHS","jdws",};
	
void check(String str,int Booth,int Age,String Address)
{  int flag=0;
   try {	
	  for(int i=0;i<20;i++)
	   {
		   if(str.equals(Name[i]))
		   {
			   flag=1;
			   if(Booth==Booth_no[i])
			  {
				   flag=1;
				   if(Age==age[i]) {
					   flag=1;
					   if(Address.equals(address[i]))
					   { flag=1;
					   break;}
					   
					   else
					   {   flag=4;
					   break;}
				   }
				   else
				   { flag=3;
				   break;}
			   }
			  else
			   { flag=2;
			   break;
			   }
		   }
		   else
			   flag=0;
	   }
	  if(flag==1)
		  System.out.println("Yes the candidate is valid he/she can vote");
	  else
		  System.out.print(1/0);
   }
   catch(Exception e){
		    if(flag==0)
		   System.out.println("The Candidate name is not in the list");
	   else if(flag==2)
		   System.out.println("The Candidate is in the Wrong Booth_no");
	   else if(flag==3)
		   System.out.println("The candidate has wrong age as mention according to the list");
	   else 
		   System.out.println("The candidate has the wrong address he can't vote");
   }
}
}
public class Class_test {

	public static void main(String[] args) {
		Vote v=new Vote();
		v.check("Raj",1,18,"ABC");
		v.check("Rajs",1,18,"ABC");
		v.check("Vamsi",4,18,"ABC");
		v.check("Surya",1,18,"ABC");
	}

}
