package author_Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author auth1 = new Author("Ivo","ivo@gmail.com",'m');
		Book book1 = new Book("Na drini Cuprija",auth1,150,3);
		
		System.out.println("Information about Book");
		System.out.println(book1); 
		System.out.println("Writer of the book is: "+book1.getAuthor().getName());
		
		
		
	}

}
