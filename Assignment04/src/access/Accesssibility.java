package access;
public class  Accesssibility {
    protected int b=67;
    public void print() {
    System.out.print(b);
    }
	public static void main(String[] args) {
		Accesssibility a =new Accesssibility();
		a.print();
	}

}
