package enumType;

enum Car { Mercedes,BMW,Audi,Jugo,Skoda};

public class EnumDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;
		c = Car.Mercedes;
		System.out.println("Car Information are: "+c); 
		
		if(c == Car.Mercedes){
			System.out.println("They are Equal");
		}
		
		switch(c){
		case Mercedes:
			System.out.println("I am merc");
			break;
		case Audi:
			System.out.println("I am audi");
			break;
		case Jugo:
			System.out.println("I am jugo");
			break;
		default:
			System.out.println("Error");
		}
		
		System.out.println("Information about Enum types in Car"); 
		Car[] cars = Car.values();
		for(Car car:cars){
			System.out.println(car);
		}
		System.out.println(Car.valueOf("Jugo"));
	
		
		
		
		
	}

}
