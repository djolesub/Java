import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Vezba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String line;
		try {
			Scanner scan = new Scanner(new File("ja.txt"));
				line = scan.nextLine();
				System.out.println(line);
				scan.close();
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
