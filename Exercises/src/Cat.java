
public class Cat extends Animal{
	private int height;
	
	public Cat(String color,String speace,int age,int height){
		super(color, speace, age);
		this.height = height;
	} 
	
	public int getHeight(){
		return height;
		
	}
	
	
}
