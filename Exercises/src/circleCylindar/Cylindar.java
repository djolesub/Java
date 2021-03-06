package circleCylindar;

public class Cylindar extends Circle{
	private double height;
	
	//Defining constructor 
	public Cylindar(){
		super();
		this.height = 10;
	}
	
	public Cylindar(double height){
		super();
		this.height = height;
	}
	
	public Cylindar(double height,String color,double radius){
		super(radius,color);
		this.height = height;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	} 
	
	public String toString(){
		return super.toString() +" Height: "+this.getHeight();
	}
	
	public double getArea(){
		return 2*this.getRadius()*this.height*Math.PI + 2*super.getArea();
	} 
	
	
	
	
	
}
