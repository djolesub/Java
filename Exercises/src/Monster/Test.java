package Monster;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring instances of superclass substituded by subclasses 
		
		Monster m1 = new FireMonster();
		Monster m2 = new WatterMonster();
		Monster m3 = new StoneMonster(); 
		
		System.out.println("m1 Attacking: "+m1.attack());
		System.out.println("m2 Attacking: "+m2.attack());
		System.out.println("m3 Attacking: "+m3.attack());
		
		
	}

}
