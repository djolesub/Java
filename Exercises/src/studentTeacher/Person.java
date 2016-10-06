package studentTeacher;

public class Person {
	//Definingi Fields 
	private String name;
	private String address;
	
	//Defining Constructor 
	public Person(String name,String address){
		this.name = name;
		this.address = address;
	}
	
	//Defining Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return "\""+name+"("+address+")\"";
	}
	
	
	
	
}
