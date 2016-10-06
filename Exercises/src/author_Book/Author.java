package author_Book;

public class Author {
	private String name;
	private char gender;
	private String email; 
	
	 public Author(String name, String email, char gender) {
	      this.name = name;
	      this.email = email;
	      this.gender = gender;
	   }
	
	public String getName(){
		return this.name;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public String getEmail(){
		return this.email;
	} 
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setName(String name){
		this.name = name;
	} 
	
	public String toString(){
		return "Name: "+name+" Email: "+email+" Gender: "+gender;
	}
	
	
	
	
	
}