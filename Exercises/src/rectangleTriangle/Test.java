package rectangleTriangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Objects 
		Rectangle rect1 = new Rectangle("red",150,100);
		Rectangle rect2 = new Rectangle("blue",15,10);
		
		Triangle tr1 = new Triangle("yellow",200,100);
		Triangle tr2 = new Triangle("green",25,15); 
		
		//getArea() Doesent work,dont know what is problem
		System.out.println("Rectange 1 area: "+rect1.getArea());
		System.out.println("Triangle 1 area: "+tr1.getArea()); 
		
		System.out.println("Rectangle 1 info:");
		System.out.println(rect1.toString());
		
		System.out.println("Triangle 1 info:");
		System.out.println(tr1.toString());
		
		
		
		
	}

}