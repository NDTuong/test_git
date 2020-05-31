import java.io.*
import java.util.*
public class WriteReadFile{
	public static void main(String[] args) {
		try{
			File file = new File("Tuong.txt");
			file.createNewFile();

			FileWriter fw = new FileWriter(file);
		} catch (Exception e){
			System.out.println("Error" + e.toString());
		}

	
		
	}
}