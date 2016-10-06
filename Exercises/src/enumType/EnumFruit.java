package enumType;

enum Fruit{ 
	Kiwi(100),Strawbery(50),Lemon(200),Blueberry(75);
	private int price;
	
	Fruit(int p){
		price = price;
	}
	
	public int getPrice(){
		return price;
	}
}

public class EnumFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fr;
		System.out.println("Kiwi costs: "+Fruit.Kiwi.getPrice());
		
		for(Fruit fruit:Fruit.values()){
			System.out.println(fruit.getPrice());
		}
		
	}

}
