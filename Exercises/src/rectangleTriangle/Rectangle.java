package rectangleTriangle;

public class Rectangle extends Shape{
	//Defining fields 
	private double width;
	private double length;
	
	//Defining constructor 
	public Rectangle(String color,double width,double length){
		super(color);
		this.width = width;
		this.length= length;
	}
	
	public double getArea(){
		return (length * width);
	} 
	
	public String toString(){
		return "Rectangle[width:"+width+" length: "+length+" color "+color;
	}
	
	
	
	
	
	
}
