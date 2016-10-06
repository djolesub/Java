package linkedList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> students = new LinkedList<String>();
		students.add("Djordje Subotic");
		students.add("Pavle Kovacevic");
		students.add("Milena Kovacevic");
		students.add("Filip Sulovic");
		students.add("Darko Selakovic"); 
		
		//Looping trough LinkedList
		System.out.println("Looping Using foreach loop");
		for(String a:students){
			System.out.println(a);
		}
		
		System.out.println("\nLooping Using for loop");
		System.out.println("ID\tFull Name");
		for(int i = 0;i<students.size();i++){
			System.out.print(i+"\t");
			System.out.println(students.get(i));
		}
		
		System.out.println("\nLooping using while loop");
		int n = 0;
		System.out.println("ID\tFull Name");
		while(n < students.size()){
			System.out.print(n+"\t");
			System.out.println(students.get(n));
			n++;
		}
		
		System.out.println("Looping using Iterator");
		Iterator i = students.iterator();
		System.out.println("ID\tFull Name");
		n = 0;
		while(i.hasNext()){
			System.out.print(n+"\t");
			System.out.println(i.next());
			n++;
		}
		
		
		
		
		
		
	}

}