package arrayList;
import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicOrganizer mu1 = new MusicOrganizer(); 
		mu1.addSong("TNT");
		mu1.addSong("Whole Lotta Rosie");
		mu1.addSong("Dazed and Confused");
		mu1.addSong("Rocker"); 
		
		System.out.println("Number of Songs: "+mu1.getNumberOfSongs()); 
		mu1.songInPlayer("TNT");
		
		System.out.println("List Before Sorting:\n");
		mu1.printSongs();
		System.out.println("List After Sorting:\n");
		mu1.sortSongs(); 
		mu1.printSongs();
		
	}
}
