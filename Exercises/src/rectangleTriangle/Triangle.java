package rectangleTriangle;

public class Triangle extends Shape{
	//Defining Fields 
	private int base;
	private int height;
	
	//Defining Constructor 
	
	public Triangle(String color,int base,int height){
		super(color);
		this.base = base;
		this.height = height;
	} 
	
	public double getArea(){
		return (base*height/2);
	}  
	
	public String toString(){
		return "Triangle[height:"+height+" base: "+base+" color "+color;
	}
	
	
	
	
	
	
	
}
