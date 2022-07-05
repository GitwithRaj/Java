import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		try {
			FileWriter f =new FileWriter("C:\\Users\\Raj Kumar\\OneDrive\\Desktop\\Raj.txt");
			try {
				f.write("Java is a best programming language .I start learning java  for my project ");
			}
			finally
			{
				f.close();
			}
			System.out.print("Successfully data wrote in the file ");
		} 
catch(IOException e) {
	e.printStackTrace();
}
	}

}
