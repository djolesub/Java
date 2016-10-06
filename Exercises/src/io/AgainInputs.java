package io;
import java.io.*;

public class AgainInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream(new File("D:\\createFile.txt"));) {
			
			
			System.out.println("First ten bytes are: ");
			for(int i = 0;i<10;i++){
				int by = fis.read(); 
				System.out.println((char)by);
			}
			System.out.println("Num of aviable bytes is: "+fis.available());
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}

}