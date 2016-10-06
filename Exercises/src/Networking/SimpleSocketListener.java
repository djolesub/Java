package Networking;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketListener {
	ServerSocket server;
	int serverPort = 8888;
	
	//Constructor for alocate ServerSocket listenng at given port 
	
	public SimpleSocketListener(){
		try {
			server = new ServerSocket(serverPort);
			System.out.println("Server Socket "+server);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//Start Listening 
	
	public void startListen(){
		while(true){
			try {
				Socket socket = server.accept();
				System.out.println("Socket: "+socket);
				InputStream in = socket.getInputStream();
				int byteRead;
	            // Block until the client closes the connection (i.e., read() returns -1)
	            while ((byteRead = in.read()) != -1) {
	               System.out.print((char)byteRead);
	            }
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
