package io;
import java.io.*;
public class TextEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter Number of lines you want to write");
		try {
			String[] str = new String[3]; 
			System.out.println("Enter Lines of text or stop to quit!\n");
			for(int i = 0;i<str.length;i++){
				str[i] = bf.readLine();
				if(str[i] == "stop"){
					break;
				}
			}
			System.out.println("Your Text file is:\n");
			for(int i = 0;i<str.length;i++){
				System.out.println(str[i]);
			}
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
