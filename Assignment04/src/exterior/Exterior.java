package exterior;
public class Exterior {
	public void ext_quality(String str) {
		System.out.println(str+" looks nice");
		if(str.equals("Swift"))
		System.out.print(str+" Bigger in size");
		else
			System.out.print(str+" Medium in size");
	}
	public static void main(String[] args) {
		Exterior e=new Exterior();
		e.ext_quality("Swift");

	}

}
