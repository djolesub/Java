package hashMap;
import java.util.*;

public class DetailsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> student = new HashMap<Integer,String>();
		student.put(1,"Djordje");
		student.put(2,"Pavle");
		student.put(3,"Milena");
		student.put(4,"Filip");
		
		System.out.println("All values: "+student.values());
		System.out.println("All values: "+student.keySet());
		System.out.println("All values: "+student.entrySet());
		
	}

}