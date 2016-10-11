package intro;

import java.net.*;
import java.io.*;

public class WhoisSocket {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
	
		//Create socket connected to internic.net ,port 43 
		try(Socket soc = new Socket("whois.internic.net",43)){
			System.out.println(soc.getPort());
			
			InputStream is = soc.getInputStream();
			OutputStream os = soc.getOutputStream();
			
			//Construct Requst 
			String str = (args.length==0 ? "MHProfessional.com":args[0]+"\n");
			byte buf[] = str.getBytes();  
			
			//Send Request 
			os.write(buf); 
			
			//Read and display response 
			
			while((c=is.read()) !=-1){
				System.out.println((char)c);
			}
			
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	
	}

}