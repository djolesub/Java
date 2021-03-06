package inputOutput;
import java.io.*;
public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\createFile.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			while(bis.available() > 0){
				System.out.println((char)bis.read());
			}
		}
		catch(FileNotFoundException fnfe){
			System.out.println("File not found "+fnfe);
		}
		catch(IOException ioe){
			System.out.println("IO Exception: "+ioe);
		}
		finally {
			try {
				if(bis != null && fis!=null){
					fis.close();
					bis.close();
				}
			}
			catch(IOException ioe){
				System.out.println("Error in input Stream"+ioe);
			}
			
		}
		
		
		
	}

}
