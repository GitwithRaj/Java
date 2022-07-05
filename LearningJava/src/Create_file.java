import java.io.File;
import java.io.IOException;

public class Create_file {

	public static void main(String[] args) {
		File f =new File("C:\\Users\\Raj Kumar\\OneDrive\\Desktop\\Java\\LearningJava\\src\\Raj.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("File Successfully Create....!");
			}
			else
			{
				System.out.println("File Already Exist..!");
			}
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}

}
