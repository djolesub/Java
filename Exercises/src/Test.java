
public class Test {

	public static void main(String[] args) {
		Animal an = new Animal("Red","Fox",27);
		System.out.println("Animal 1 data: ");
		System.out.println("Color is: "+an.getColor());
		System.out.println("Age is: "+an.getAge());
		System.out.println("Number of created animals is: "+Animal.getNum());
		System.out.println();
		Animal an1 = new Animal("Yellow","Dog",20);
		System.out.println("Animal 2 data: ");
		System.out.println("Color is: "+an1.getColor());
		System.out.println("Age is: "+an1.age);
		System.out.println("Number of created animals is: "+Animal.getNum());
		System.out.println();
		System.out.println("Class Cat ");
		
		Cat ct = new Cat("Yellow","Tigar",15,1500);
		System.out.println("Cat 1 data: ");
		System.out.println("Color is: "+ct.getColor());
		System.out.println("Age is: "+ct.age);
		System.out.println("Number of created animals is: "+Cat.getNum());
		System.out.println(); 
		int a = 100;
		int b = 5050;
		double c = (double)b/a;
		System.out.println("C je : "+c);
		
		
		
	}

}
