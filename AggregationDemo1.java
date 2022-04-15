package oopsDemo2;

public class AggregationDemo1 {
	
	public static void main(String[] args) {
		
		Author author =new Author(42, "John", "USA");
		
		Publisher publisher =new Publisher("Manikanta Pulications", "Mathematics-1", "India");
		
		Book b = new Book("Mathematics-II", 100, author, publisher);
		
		b.display();
	}

}
