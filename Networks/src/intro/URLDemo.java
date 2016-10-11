package intro;
import java.io.IOException;
import java.net.*;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try{
			url = new URL("http://www.limundo.com");
			System.out.println("Information about URL:");
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Path: "+url.getPath());
			System.out.println("Host: "+url.getHost());
			System.out.println("Query: "+url.getQuery());
			
			try {
				url.getContent();
				System.out.println();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		catch(MalformedURLException e){
			e.printStackTrace();
		}
		
		
		
	}

}