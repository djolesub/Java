package io;
import java.io.*;

public class InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\createFile.txt");
			int a = file.read();
			while(a != -1){
				System.out.println((char)a);
				a = file.read();
			}
			
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
