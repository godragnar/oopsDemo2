package oopsDemo2;

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		Developer d1=new Developer(10,"James Gosling","JDBC");
		Developer d2=new Developer(11,"Tyler Durden","Spring Framework");
		
		d1.display();
		d1.display1();
		
		d2.display();
		d2.display1();
	}
	

}
