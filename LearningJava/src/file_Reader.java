import java.io.FileReader;
import java.io.IOException;

public class file_Reader {

	public static void main(String[] args) {
		try {
			FileReader r =new FileReader("C:\\Users\\Raj Kumar\\OneDrive\\Desktop\\Raj.txt");
			try {
				int i; 
				while((i=r.read())!=-1) {
					System.out.print((char)i);
				}
			}
			finally {
				r.close();
				System.out.print("\nfile closed");
			}
		}
catch(IOException e)
		{
	e.printStackTrace();
		}
	}

}
