package inputOutput;
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\createFile.txt");
			file.renameTo(new File("D:\\createFileRenamed.txt"));
			boolean fvar = file.createNewFile();
			if(fvar) System.out.println("File Created Successfuly");
			else {
				System.out.println("File allready exists");
			}
			
		}
		catch(IOException e){
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
