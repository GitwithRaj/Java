 abstract class Monster{
	 String Monster1_Vampire1;
	 String Monster2_Vampire2;
	 String Monster3_Werewolf1;
	 String Monster4_Werewolf2;
	 String Monster5_Zombies1;
	 String Monster6_Zombies2;
	 
 }
 class Vampire extends Monster
 { 
  public String dispV1() {
	 Monster1_Vampire1="Vampire1_Aadrash";
	return Monster1_Vampire1;
 }
public String dispV2() {
	 Monster2_Vampire2="Vampire2_Aryan";
	 return Monster2_Vampire2;
 }
 }
class Werewolf extends Monster{
	 public String dispW1() {
		Monster3_Werewolf1="Werewolf1_Raj";
	 return Monster3_Werewolf1;
	}
	public String dispW2() {
		Monster4_Werewolf2="Werewolf2_Aadesh";
	 return Monster4_Werewolf2;
	}
	
 }
class Zombies extends Monster {
	public String dispZ1() {
		Monster5_Zombies1="Zombies1_Devanshu";
	 return Monster5_Zombies1;
	}
	public String dispZ2() {
		Monster6_Zombies2="Zombies2_Thataghata";
	 return Monster6_Zombies2;
	}
	}

public class Q11 {

	public static void main(String[] args) {
		int i;
		Vampire v=new Vampire();
		Werewolf w=new Werewolf();
		Zombies z=new Zombies();
		String M[]=new String[6];
		M[0]=v.dispV1();
        M[1]=v.dispV2();
        M[2]=w.dispW1();
        M[3]=w.dispW2();
        M[4]=z.dispZ1();
        M[5]=z.dispZ2();
        for(i=0;i<6;i++) {
        	System.out.println("Monster no. "+i+" is "+M[i]);
        }
	}

}
