package hashSet;
import java.util.*;

public class InputReader {
	private Scanner reader;
	
	public InputReader(){
		reader = new Scanner(System.in);
	} 
	
	public HashSet<String> getInput(){
		boolean n = false;
		HashSet<String> wordArray = new HashSet<String>();
		while(!n){
		System.out.print(">");
		String inputLine = reader.nextLine().trim().toLowerCase();
		if(inputLine.equals("stop")){
			n = true;
			break;
		}else {
			String[] words = inputLine.split(" ");
			
			for(String word:words){
				wordArray.add(word);
			}
		}
		
		
		}
		return wordArray;
	}
	
	
	
	
	
}
