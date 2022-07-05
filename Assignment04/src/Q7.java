import java.util.Scanner;
class Database {
	String Name[]={"Raj","Sohan","Sonu","Soni","Ravi","Ram","Shayam","Sun","Rinki","Sadhu","Mani",
		"Jatin","Jitesh","Surya","Vamsi","Farook","Vivek","Rawat","Yash","Arya"};
int Roll_No[]= {98,60,70,96,93,94,64,73,84,60,92,72,81,91,83,93,75,87,71,63};
String Branch[]= {"IT","CST","AE","ME","Civil","Mining","Metallurgy","ETC","EE",
	"IT","CST","AE","ME","Civil","Mining","Metallurgy","ETC","EE","IT","IT"};
String Class[]= {"Sem4","Sem2","Sem3","Sem4","Sem5","Sem6","Sem7","Sem8","Sem6","Sem4",
  "Sem1","Sem2","Sem3","Sem4","Sem5","Sem6","Sem7","Sem8","Sem6","Sem4"};
void display(String N) {
	int flag=0;
try {
	for(int i=0;i<20;i++)
  {
	  if(N.equals(Name[i]))
	  {   flag=1;
		  System.out.println("Students data is here");
		  System.out.println("Name ="+Name[i]+"\nBranch="+Branch[i]+"\nClass="+Class[i]+"\n Roll_no="+Roll_No[i]);
	  }
 }
	if(flag==0)
		System.out.print(1/flag);	
}
catch(Exception e) {
	System.out.println("Unknown Object");
}
  }
}
public class Q7 {
	public static void main(String[] args) {
    Database d= new Database();
    String N;
    System.out.print("Enter your String ");
    Scanner scan=new Scanner(System.in);
    N=scan.next();
    d.display(N);
	}
}
