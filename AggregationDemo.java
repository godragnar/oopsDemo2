package oopsDemo2;

public class AggregationDemo {
	public static void main(String[] args) {
		Address ad1 =new Address("Amalapuram", "Andhra", "India", 533201);
		Address ad2 =new Address("Pargue", "Austin", "Norway",7777);
		
		Student s1= new Student(10, "Surya", ad1);
		Student s2 =new Student(11, "Bhaskar", ad2);
		
		s1.display();
		s2.display();
	}

}
