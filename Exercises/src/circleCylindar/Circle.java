package circleCylindar;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this.radius = 1.0;
		this.color = "red";
	} 
	
	public Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	} 
	
	public Circle(double radius){
		this.radius = radius;
		this.color="red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 
	
	public double getarea(){
		return Math.pow(this.getRadius(), 2) * Math.PI;
	} 
	
	public String toString(){
		return "\"Circle attributes:[radius: "+this.getRadius()+",color: "+this.getColor()+"]\"";
	} 
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	
	
	
	
	
	
}
