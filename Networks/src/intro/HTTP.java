package intro;
import java.net.*;
import java.util.*;

public class HTTP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://www.google.com");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//Display request 
		System.out.println("Request method is: "+conn.getRequestMethod());
		
		//Display response code 
		System.out.println("Response code is: "+conn.getResponseCode()); 
		
		//Display Response Message 
		System.out.println("Response status is: "+conn.getResponseMessage()); 
		
		//Get list of header fields and set of header keys 
		Map<String,List<String>> connMap = conn.getHeaderFields(); 
		Set<String> connField = connMap.keySet();
		
		System.out.println("\nHere is the header: "); 
		for(String f:connField){
			System.out.println("Key: "+f+" Value: "+connMap.get(f));
		}
		
		
		
		
		
		
		
	}

}
