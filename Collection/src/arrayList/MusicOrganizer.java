package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class MusicOrganizer {
	//Fields
	private String name;
	private ArrayList<String> songs; 
	
	//Constructors
	public MusicOrganizer(){
		this.name = "Unknown";
		this.songs = new ArrayList<String>(10);
	} 
	
	public MusicOrganizer(String name,int size){
		this.name = name;
		this.songs = new ArrayList<String>(size);
	}
	
	//Getters and Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<String> songs) {
		this.songs = songs;
	}
	
	//Methods 
	
	public void addSong(String song){
		songs.add(song);
	}
	
	public void deleteSong(String song){
		for(String s:songs){
			if(s.equals(song)){
				songs.remove(songs.indexOf(s));
			}
		}
	} 
	
	public int getNumberOfSongs(){
		return songs.size();
	} 
	
	public void songInPlayer(String song){
		for(String s:songs){
			if(s.equals(song)){
				System.out.println("Its in player");
				break;
			}
			else {
				System.out.println("Song doesn't exist");
			}
		}
	
	}
	
	public void printSongs(){
		for(String s:songs){
			System.out.println(s);
		}
	} 
	
	//Sort ArrayList 
	
	public void sortSongs(){
		Collections.sort(songs);
	}
	
	
	
	
	
}
