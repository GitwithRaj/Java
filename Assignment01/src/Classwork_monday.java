
public class Classwork_monday {

	public static void main(String[] args) {
		String str="Monday timing";
		String str2="Thusday Timing";
		String day1 ="Monday";
		String day2 ="Thursday";
		System.out.print("For the month of january \n");
		System.out.print("\t"+day1+"\t\t"+str+"\t\t"+day2+"\t"+str2+"\n");
		for(int i=3;i<=31;i=i+4){
			
			System.out.print("\t"+i+"/01/2022"+"-------> "+"12:00-12:50");
			i=i+3;
			if(i<32)
			System.out.print("\t\t"+i+"/01/2022"+"------> 14:30-15-20\n");
		}
		System.out.print("\n\n\nFor the month of February \n");
		System.out.print("\t"+day1+"\t\t"+str+"\t\t"+day2+"\t"+str2+"\n");
		int k=3;
		System.out.print("\t\t\t\t\t\t"+k+"/02/2022"+"-------> 14:30-15-20\n");
		for(int j=7;j<=28;j=j+4){
			System.out.print("\t"+j+"/01/2022"+"-------> "+"12:00-12:50");
			j=j+3;
			if(j<29)
			System.out.print("\t\t"+j+"/01/2022"+"------> 14:30-15-20\n");
		}
    	}
}
