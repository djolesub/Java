package hashSet;
import java.util.*;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> words = new HashSet();
		words.add("Djordje");
		words.add("Djordje");
		words.add("Milena");
		words.add("Milena");
		words.add("Pavle");
		words.add("Pavle");
		words.add("Filip");
		words.add("Filip");
		
		//Foreach loop for iterating
		System.out.printf("Number of words are %d\n",words.size());
		for(String word: words){
			System.out.println(word);
		}
		
		//Iterator
		Iterator i = words.iterator();
		while(i.hasNext()){
			System.out.println("\n"+i.next());
		}
		
	}

}
