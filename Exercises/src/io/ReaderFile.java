package io;
import java.io.*;

public class ReaderFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:\\createFile.txt");
			int a = fr.read();
			while(a !=-1 ){
				System.out.println((char)(a));
				a = fr.read();
			}
		}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
